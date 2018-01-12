package com.bullyun.response.devicedto;

import com.bullyun.model.Device;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class DevicesGetResponse extends BaseResponse {
    private List<Device> devices;
}
