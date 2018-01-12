package com.bullyun.param.face;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GroupCreateParam extends BaseParam<BaseResponse> {
    private String accessToken;
    private String groupName;
    private String tag;

    @Override
    public String getApi() {
        return "/api/v1/group/create";
    }
}
