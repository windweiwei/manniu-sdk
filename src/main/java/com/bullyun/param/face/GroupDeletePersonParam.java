package com.bullyun.param.face;

import com.bullyun.param.BaseParam;
import com.bullyun.response.facedto.GroupDeletePersonResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GroupDeletePersonParam extends BaseParam<GroupDeletePersonResponse> {
    private String accessToken;
    private String groupId;
    private String personIds;

    @Override
    public String getApi() {
        return "/api/v1/group/delete_persons";
    }
}
