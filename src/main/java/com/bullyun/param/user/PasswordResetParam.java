package com.bullyun.param.user;

import com.bullyun.param.BaseParam;
import com.bullyun.response.userdto.SignInResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class PasswordResetParam extends BaseParam<SignInResponse> {
    private String username;
    private String active_code;
    private String password;

    @Override
    public String getApi() {
        return "/api/v1/users/password/reset";
    }
}
