package com.bullyun.param.user;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SignOutParam extends BaseParam<BaseResponse> {
    private String accessToken;


    @Override
    public String getApi() {
        return "/api/v1/users/signout";
    }
}
