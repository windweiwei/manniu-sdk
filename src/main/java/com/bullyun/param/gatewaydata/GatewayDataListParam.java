package com.bullyun.param.gatewaydata;

import com.bullyun.param.BaseParam;
import com.bullyun.response.gatewaydatadto.GatewayDataListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GatewayDataListParam extends BaseParam<GatewayDataListResponse> {
    private String access_token;
    private String gatewaySn;
    private Integer sensorid;
    private Long startTime;
    private Long endTime;
    private Integer dataType;
    private Integer status;
    private Integer pageStart;
    private Integer pageSize;
    @Override
    public String getApi() {
        return "/api/v1/gatewayData/list";
    }
}
