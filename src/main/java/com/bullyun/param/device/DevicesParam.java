package com.bullyun.param.device;

import com.bullyun.param.BaseParam;
import com.bullyun.response.devicedto.DevicesGetResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DevicesParam extends BaseParam<DevicesGetResponse> {
    private String accessToken;

    @Override
    public String getApi() {
        return "/api/v1/devices";
    }
}
