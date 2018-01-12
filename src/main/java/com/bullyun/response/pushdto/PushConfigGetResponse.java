package com.bullyun.response.pushdto;

import com.bullyun.model.PushConfig;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class PushConfigGetResponse extends BaseResponse {
    private PushConfig pushConfig;
}
