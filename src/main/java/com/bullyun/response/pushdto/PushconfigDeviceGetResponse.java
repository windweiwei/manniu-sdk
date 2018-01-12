package com.bullyun.response.pushdto;

import com.bullyun.model.PushConfig;
import com.bullyun.response.BaseResponse;

public class PushconfigDeviceGetResponse extends BaseResponse {
    private PushConfig pushConfig;
    private  Integer facePush;
    private  Integer strangerPush;
}
