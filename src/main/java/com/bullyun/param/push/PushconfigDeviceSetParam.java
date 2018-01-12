package com.bullyun.param.push;


import com.bullyun.model.SleepTimeRange;
import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PushconfigDeviceSetParam extends BaseParam<BaseResponse> {
    private String accessToken;
    private Integer pushenable;
    private Integer sleepenable;
    private SleepTimeRange sleepTimeRange;
    private Integer facePush;
    private Integer strangerPush;
    private String sn;

    @Override
    public String getApi() {
        return "/api/v1/pushconfig/" + sn + "/set";
    }
}
