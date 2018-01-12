package com.bullyun.model;

import lombok.Data;

@Data
public class Alarm {
    private String alarmId;
    private String deviceSn;
    private String devName;
    private Integer channelNo;
    private Long alarmTime;
    private Integer status;
    private Integer alarmType;
    private String imageUrl;
    private String videoUrl;
    private Long vStartTime;
    private Long vEndTime;
    private String alarmInfo;
    private String personName;
    private Double confidence;
}
