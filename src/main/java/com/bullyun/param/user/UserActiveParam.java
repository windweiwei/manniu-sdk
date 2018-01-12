package com.bullyun.param.user;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserActiveParam extends BaseParam<BaseResponse> {
    private String email;
    private String phone;
    private String active_code;


    @Override
    public String getApi() {
        return "/api/v1/users/active";
    }
}
