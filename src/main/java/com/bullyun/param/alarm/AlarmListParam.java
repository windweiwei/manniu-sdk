package com.bullyun.param.alarm;

import com.bullyun.param.BaseParam;
import com.bullyun.response.alarmdto.AlarmListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AlarmListParam extends BaseParam<AlarmListResponse> {
    private String accessToken;
    private String deviceSn;
    private String channelNo;
    private String startTime;
    private String endTime;
    private String alarmType;
    private String subAlarmType;
    private String personName;
    private String img;
    private String url;
    private String pageStart;
    private String pageSize;

    @Override
    public String getApi() {
        return "/api/v1/alarms/list";
    }
}
