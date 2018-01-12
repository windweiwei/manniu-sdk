package com.bullyun.param.alarm;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AlarmStatusModifyPAram extends BaseParam<BaseResponse> {
    private String accessToken;
    private Integer status;
    private String alarmId;

    @Override
    public String getApi() {
        return "/api/v1/alarms/" + alarmId + "/status/modify";
    }
}
