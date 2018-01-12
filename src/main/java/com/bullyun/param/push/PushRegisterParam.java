package com.bullyun.param.push;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PushRegisterParam extends BaseParam<BaseResponse> {
    private String accessToken;
    private String pushToken;
    private String pushType;
    private String appType;
    private String locale;


    @Override
    public String getApi() {
        return "/api/v1/push/register";
    }
}
