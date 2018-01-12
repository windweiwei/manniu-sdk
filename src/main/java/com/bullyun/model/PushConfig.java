package com.bullyun.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PushConfig {
    private Integer pushenable;
    private Integer sleepenable;
    @JsonProperty("sleep_time_range")
    private List<SleepTimeRange> sleepTimeRange;
}
