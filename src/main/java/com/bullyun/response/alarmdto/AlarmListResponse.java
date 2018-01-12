package com.bullyun.response.alarmdto;

import com.bullyun.model.Alarm;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
@Data
@EqualsAndHashCode(callSuper =true)
public class AlarmListResponse extends BaseResponse {
    private List<Alarm> alarms;
}
