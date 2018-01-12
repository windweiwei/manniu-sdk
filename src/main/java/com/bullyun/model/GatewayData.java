package com.bullyun.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GatewayData {
    private String dataId;
    private String gatewaySn;
    private String sensorid;
    private String datatime;
    private String data;
    private String status;
    private String dataType;
}
