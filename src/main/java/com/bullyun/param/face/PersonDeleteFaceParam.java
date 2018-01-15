package com.bullyun.param.face;

import com.bullyun.param.BaseParam;
import com.bullyun.response.facedto.PersonDeleteResponse;

import java.util.List;

public class PersonDeleteFaceParam extends BaseParam<PersonDeleteResponse> {
    private String accessToken;
    private String groupId;
    private String personId;
    private List<String> faceIds;

    @Override
    public String getApi() {
        return "/api/v1/person/deleteFace";
    }
}
