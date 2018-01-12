package com.bullyun.param.face;

import com.bullyun.param.BaseParam;

public class GroupDeleteParam extends BaseParam {
    private String accessToken;
    private String groupId;

    @Override
    public String getApi() {
        return "/api/v1/group/delete";
    }
}
