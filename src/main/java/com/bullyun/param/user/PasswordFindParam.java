package com.bullyun.param.user;

import com.bullyun.param.BaseParam;
import com.bullyun.response.userdto.SignInResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PasswordFindParam extends BaseParam<SignInResponse> {
    private String email;
    private String countryCode;
    private String phone;
    private String captcha;

    @Override
    public String getApi() {
        return "/api/v1/users/password/find";
    }
}
