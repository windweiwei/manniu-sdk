package com.bullyun.param.push;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PushUnregisterParam extends BaseParam<BaseResponse> {
    private String accessToken;
    private String pushToken;

    @Override
    public String getApi() {
        return "/api/v1/push/unregister";
    }
}
