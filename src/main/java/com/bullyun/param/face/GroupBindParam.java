package com.bullyun.param.face;


import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GroupBindParam extends BaseParam<BaseResponse> {
    private String accessToken;
    private String groupId;

    @Override
    public String getApi() {
        return "/api/v1/ device/group";
    }
}
