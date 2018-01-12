package com.bullyun.param.user;

import com.bullyun.param.BaseParam;
import com.bullyun.response.userdto.SignInResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class SignInParam extends BaseParam<SignInResponse> {
    private String username;
    private String password;
    private String appType;

    @Override
    public String getApi() {
        return "/api/v1/users/signin";
    }
}
