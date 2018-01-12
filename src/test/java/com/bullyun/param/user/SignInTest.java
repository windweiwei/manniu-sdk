package com.bullyun.param.user;

import com.bullyun.httputil.DefaultSentClient;
import com.bullyun.response.userdto.SignInResponse;
import com.bullyun.response.userdto.UserGetResponse;
import org.junit.Test;


public class SignInTest {
    @Test
    public void sininTest() {
        DefaultSentClient defaultSentClient = new DefaultSentClient(
                "8Wa227sQ00S33p4y",
                "RlA8aCPlsuATT227kKTg003ncP35HYRI",
                "http://www.vssweb.net:10210");
        SignInParam signInParam = new SignInParam();
        signInParam.setUsername("1013398588@qq.com");
        signInParam.setPassword("123456jiang");
        signInParam.setAppType("WEB");
        SignInResponse response = defaultSentClient.postsend(signInParam);
        System.out.println(response.getMsg());
        System.out.println(response.getAccessToken());
    }

    @Test
    public void usersGet() {
        DefaultSentClient defaultSentClient = new DefaultSentClient(
                "8Wa227sQ00S33p4y",
                "RlA8aCPlsuATT227kKTg003ncP35HYRI",
                "http://www.vssweb.net:10210");
        UsersGetParam param = new UsersGetParam();
        param.setAccessToken("u_e9ebbfe8428b4379a6c23673dc34eaa4");
        UserGetResponse response = defaultSentClient.getsend(param);
        System.out.println(response.getUser());
    }

}
