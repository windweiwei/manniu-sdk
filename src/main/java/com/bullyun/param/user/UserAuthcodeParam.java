package com.bullyun.param.user;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserAuthcodeParam extends BaseParam<BaseResponse> {
    /**
     * 国家码
     */
    private String countryCode;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 验证码
     */
    private String captcha;
    /**
     * 当地语言
     */
    private String locale;
    /**
     * 验证方式：”email”或”sms”
     */
    private String valid;
    /**
     * 当要输入验证码时要带入客户端的请求头Sessionid web端不需要！ 为了保证服务器端的安全防止别人无限刷这个接口去发短信！
     */
    private String session;

    @Override
    public String getApi() {
        return "/api/v1/users/signup/authcode";
    }
}
