package com.bullyun.param.face;

import com.bullyun.param.BaseParam;
import com.bullyun.response.facedto.GroupAddPersonResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GroupSetinfoParam extends BaseParam<GroupAddPersonResponse> {
    private String accessToken;
    private String groupId;
    private String groupName;
    private String tag;

    @Override
    public String getApi() {
        return "/api/v1/group/add_persons";
    }
}
