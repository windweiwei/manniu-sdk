package com.bullyun.param.device;

import com.bullyun.param.BaseParam;
import com.bullyun.response.devicedto.DeviceOnlineResponse;

public class DeviceOnlineParam extends BaseParam<DeviceOnlineResponse> {
    private String accessToken;
    private String sn;

    @Override
    public String getApi() {
        return "/api/v1/devices/" + sn + "/online";
    }
}
