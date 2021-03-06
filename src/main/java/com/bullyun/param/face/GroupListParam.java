package com.bullyun.param.face;

import com.bullyun.param.BaseParam;
import com.bullyun.response.facedto.GroupListResponse;
import lombok.Data;

@Data
public class GroupListParam extends BaseParam<GroupListResponse> {
    private String accessToken;
    private String groupId;
    private Integer type;

    @Override
    public String getApi() {
        return "/api/v1/group/list";
    }
}
