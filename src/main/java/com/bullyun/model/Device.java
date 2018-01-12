package com.bullyun.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Device {
    private String id;
    private String sn;
    @JsonProperty("dev_name")
    private String devName;
    private String ip;
    private Integer port;
    private Integer state;
    private Integer type;
    private String ver;
    private String model;
    private String vn;
    private String logo;
    @JsonProperty("logo_type")
    private Integer logoType;
    @JsonProperty("add_time")
    private Long addTime;
    @JsonProperty("firm_id")
    private Long firmId;
    private Integer channels;
    private Integer online;
    @JsonProperty("alarm_storage_days")
    private Integer alarmStorageDays;
    @JsonProperty("video_storage_days")
    private Integer videoStorageDays;
    private Float longitude;
    private Float latitude;
}
