package com.bullyun.param.user;

import com.bullyun.httputil.DefaultSentClient;
import com.bullyun.response.BaseResponse;
import org.junit.Test;

public class UserAuthcodeParamTest {
    @Test
    public void userAuthcodeTest() {
        DefaultSentClient defaultSentClient = new DefaultSentClient(
                "8Wa227sQ00S33p4y",
                "RlA8aCPlsuATT227kKTg003ncP35HYRI",
                "http://www.vssweb.net:10210");
        UserAuthcodeParam param = new UserAuthcodeParam();
        param.setPhone("18458306299");
        param.setCaptcha("fljy");
        param.setSession("58075be0-1e6e-4a91-bc1f-61a445dfe9f3");
        param.setCountryCode("86");
        param.setLocale("zh_CN");
        param.setValid("sms");
        BaseResponse response = defaultSentClient.postsend(param);
        System.out.println(response.getCode());
        System.out.println(response.getMsg());
    }
}
