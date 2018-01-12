package com.bullyun.param.push;

import com.bullyun.model.PushConfig;
import com.bullyun.model.SleepTimeRange;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class PushConfigSetParam extends BaseResponse {
    private String accessToken;
    private Integer pushenable;
    private Integer sleepenable;
    private List<SleepTimeRange> sleepTimeRanges;
}
