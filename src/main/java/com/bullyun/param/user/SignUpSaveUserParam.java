package com.bullyun.param.user;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class SignUpSaveUserParam extends BaseParam<BaseResponse> {
    private String countryCode;
    private String phone;
    private String email;
    private String password;
    private String activeCode;

    @Override
    public String getApi() {
        return "/api/v1/users/signup/save";
    }
}
