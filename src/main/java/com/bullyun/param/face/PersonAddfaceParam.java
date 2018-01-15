package com.bullyun.param.face;

import com.bullyun.param.BaseParam;
import com.bullyun.response.facedto.PersonAddfaceResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true )
public class PersonAddfaceParam extends BaseParam<PersonAddfaceResponse> {
    private String accessToken;
    private String groupId;
    private String personId;
    private String img;
    private String url;

    @Override
    public String getApi() {
        return "/api/v1/person/add_face";
    }
}
