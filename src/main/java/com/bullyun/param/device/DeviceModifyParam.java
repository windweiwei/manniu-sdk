package com.bullyun.param.device;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceModifyParam extends BaseParam<BaseResponse> {
    private String dev_name;
    private String vn;
    private String ver;
    private String logoType;
    private String sn;

    @Override
    public String getApi() {
        return "/api/v1/devices/" + sn + "/modify";
    }
}
