package com.bullyun.param.feedback;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class FeedbackSetParam extends BaseParam<BaseResponse> {
    private String accessToken;
    private String content;

    @Override
    public String getApi() {
        return "/api/v1/feedback/set";
    }
}
