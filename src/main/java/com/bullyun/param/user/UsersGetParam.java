package com.bullyun.param.user;


import com.bullyun.param.BaseParam;
import com.bullyun.response.userdto.UserGetResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class UsersGetParam extends BaseParam<UserGetResponse> {
    private String accessToken;

    @Override
    public String getApi() {
        return "/api/v1/users/get";
    }
}
