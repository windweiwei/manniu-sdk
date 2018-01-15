package com.bullyun.param.face;

import com.bullyun.param.BaseParam;
import com.bullyun.response.facedto.PersonListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PersonListParam extends BaseParam<PersonListResponse> {
    private String accessToken;
    private String groupId;
    private Integer type;

    @Override
    public String getApi() {
        return "/api/v1/person/list";
    }
}
