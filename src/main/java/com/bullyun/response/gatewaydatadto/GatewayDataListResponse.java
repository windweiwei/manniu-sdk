package com.bullyun.response.gatewaydatadto;

import com.bullyun.model.GatewayData;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class GatewayDataListResponse extends BaseResponse {
    private List<GatewayData> gatewayData;
}
