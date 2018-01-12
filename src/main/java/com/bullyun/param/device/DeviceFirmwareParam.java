package com.bullyun.param.device;

import com.bullyun.param.BaseParam;
import com.bullyun.response.devicedto.DeviceFirmwareResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceFirmwareParam extends BaseParam<DeviceFirmwareResponse> {
    private String access_token;
    private String lang;
    private String pal;
    private String sn;

    @Override
    public String getApi() {
        return "/api/v1/devices/" + sn + "/firmware";
    }
}
