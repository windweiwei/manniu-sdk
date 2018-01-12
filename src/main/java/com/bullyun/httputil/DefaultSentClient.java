package com.bullyun.httputil;

import com.bullyun.http.HttpService;
import com.bullyun.http.JsonMapper;
import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.sf.json.JSONObject;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unchecked")
public class DefaultSentClient {
    @JsonProperty("app_key")
    private String appKey;
    @JsonProperty("app_secret")
    private String appSecret;
    private String serviceUrl;

    public DefaultSentClient(String appKey, String appSecret, String serviceUrl) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.serviceUrl = serviceUrl;
    }

    public <T extends BaseResponse> T postsend(BaseParam<T> param) {
        Class<? extends BaseParam> clazz = param.getClass();
        Type t = clazz.getGenericSuperclass();
        Class<T> responseClass = null;
        if (t instanceof ParameterizedType) {
            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
            responseClass = (Class<T>) p[0];
        }
        JSONObject jsonObject = new JSONObject();
        boolean haveCookie = false;
        jsonObject.put("app_key", appKey);
        jsonObject.put("app_secret", appSecret);
        //获取属性的名字和值放入jsonObject
        Map<String, Object> map = getNameValue(param);
        for (String s : map.keySet()) {
            if (s.equals("session")) {
                haveCookie = true;
                continue;
            }
            jsonObject.put(s, map.get(s));
        }
        HttpPost httpPost = new HttpPost(serviceUrl + param.getApi());
        if (haveCookie) { //如果有需要传入session的情况
            Map<String, String> mp = new HashMap<>();
            mp.put("Cookie", "SESSION=" + map.get("session"));
            Header[] headerss = buildHeader(mp);
            httpPost.setHeaders(headerss);
        }
        CloseableHttpClient client = HttpService.getHttpClient();
        StringEntity entity = new StringEntity(jsonObject.toString(), "UTF-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        HttpResponse response;
        String result;
        try {
            response = client.execute(httpPost);
            result = EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            JSONObject object = new JSONObject();
            object.put("code", "500");
            object.put("msg", e.getMessage());
            return JsonMapper.readValue(object.toString(), responseClass);
        }

        return JsonMapper.readValue(result, responseClass);

    }

    public <T extends BaseResponse> T getsend(BaseParam<T> param) {
        String url = serviceUrl + param.getApi() + "?app_key=" + appKey + "&app_secret=" + appSecret;
        Class<? extends BaseParam> clazz = param.getClass();
        Type t = clazz.getGenericSuperclass();
        Class<T> responseClass = null;
        if (t instanceof ParameterizedType) {
            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
            responseClass = (Class<T>) p[0];
        }
        Map<String, Object> map = getNameValue(param);
        for (String s : map.keySet()) {
            url = url + "&" + getSendName(s) + "=" + map.get(s);
        }
        String result = "";
        try {
            CloseableHttpClient client = HttpService.getHttpClient();
            HttpGet request = new HttpGet(url);
            HttpResponse response = client.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                result = EntityUtils.toString(response.getEntity(), "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonMapper.readValue(result, responseClass);
    }

    private static Map<String, Object> getNameValue(Object f) {
        // 获取f对象对应类中的所有属性域
        Field[] fields = f.getClass().getDeclaredFields();
        Map<String, Object> map = new HashMap<>();
        for (Field field : fields) {
            // 对于每个属性，获取属性名
            String varName = field.getName();
            try {
                // 获取原来的访问控制权限
                boolean accessFlag = field.isAccessible();
                // 修改访问控制权限
                field.setAccessible(true);
                // 获取在对象f中属性fields[i]对应的对象中的变量
                Object o = field.get(f);
                map.put(getSendName(varName), o);
                // 恢复访问控制权限
                field.setAccessible(accessFlag);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }
        return map;
    }

    //装请求头！
    private static Header[] buildHeader(Map<String, String> params) {
        Header[] headers = null;
        if (params != null && params.size() > 0) {
            int i = 0;
            headers = new BasicHeader[params.size()];
            for (Map.Entry<String, String> entry : params.entrySet()) {
                headers[i] = new BasicHeader(entry.getKey(), entry.getValue());
                i++;
            }
        }
        return headers;
    }

    //把所有驼峰命名的属性名称改成aBa->a_ba
    private static String getSendName(String line) {
        if (line == null || "".equals(line)) {
            return "";
        }
        line = String.valueOf(line.charAt(0)).toUpperCase().concat(line.substring(1));
        StringBuffer sb = new StringBuffer();
        Pattern pattern = Pattern.compile("[A-Z]([a-z\\d]+)?");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String word = matcher.group();
            sb.append(word.toUpperCase());
            sb.append(matcher.end() == line.length() ? "" : "_");
        }
        return sb.toString().toLowerCase();
    }
}
