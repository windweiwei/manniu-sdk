package com.bullyun.param.device;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceUnbindParam extends BaseParam<BaseResponse> {
    private String accessToken;
    private String sn;

    @Override
    public String getApi() {
        return "/api/v1/devices/" + sn + "/unbind";
    }
}
