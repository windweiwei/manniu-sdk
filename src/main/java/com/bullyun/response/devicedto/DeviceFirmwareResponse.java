package com.bullyun.response.devicedto;


import com.bullyun.model.Firmware;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceFirmwareResponse extends BaseResponse {
    private String currentVersion;
    private Firmware firmware;
}
