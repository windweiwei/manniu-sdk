package com.bullyun.param.push;


import com.bullyun.param.BaseParam;
import com.bullyun.response.pushdto.PushconfigDeviceGetResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PushconfigDeviceGetParam extends BaseParam<PushconfigDeviceGetResponse> {
    private String accessToken;
    private String sn;


    @Override
    public String getApi() {
        return "/api/v1/pushconfig/" + sn + "/get";
    }
}
