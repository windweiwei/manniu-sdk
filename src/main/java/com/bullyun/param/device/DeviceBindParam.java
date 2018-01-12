package com.bullyun.param.device;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceBindParam extends BaseParam<BaseResponse> {
    private String accessToken;
    private String vn;
    private String lon;
    private String lat;
    private String sn;

    @Override
    public String getApi() {
        return "/api/v2/devices/" + sn + "/bind";
    }
}
