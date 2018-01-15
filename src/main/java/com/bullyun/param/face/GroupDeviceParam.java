package com.bullyun.param.face;

import com.bullyun.param.BaseParam;
import com.bullyun.response.facedto.GroupDeviceResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GroupDeviceParam extends BaseParam<GroupDeviceResponse> {
    private String accessToken;
    private String deviceId;
    private String channel;

    @Override
    public String getApi() {
        return "/api/v1/group/device";
    }
}
