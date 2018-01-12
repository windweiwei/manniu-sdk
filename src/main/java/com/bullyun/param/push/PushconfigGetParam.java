package com.bullyun.param.push;


import com.bullyun.param.BaseParam;
import com.bullyun.response.pushdto.PushConfigGetResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@EqualsAndHashCode(callSuper = true)
public class PushconfigGetParam extends BaseParam<PushConfigGetResponse> {
    private String accessToken;

    @Override
    public String getApi() {
        return "/api/v1/pushconfig/get";
    }
}
