package com.bullyun.param.thirdlogin;

import com.bullyun.param.BaseParam;
import com.bullyun.response.thirdlogindto.UsersSaveResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UsersSaveParam extends BaseParam<UsersSaveResponse> {
    private String openId;
    private String nickname;
    private String avatar;
    private String from;
    private String appType;

    @Override
    public String getApi() {
        return "/api/v1/users/save";
    }
}
