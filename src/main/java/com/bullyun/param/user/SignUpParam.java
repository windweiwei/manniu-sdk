package com.bullyun.param.user;


import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SignUpParam extends BaseParam<BaseResponse> {
    private String username;
    private String password;
    private String email;
    private String countryCode;
    private String phone;
    private String captcha;
    private String locale;
    private String valid;

    @Override
    public String getApi() {
        return "/api/v1/users/signup";
    }
}
