package com.bullyun.param.face;

import com.bullyun.param.BaseParam;
import com.bullyun.response.facedto.PersonSetinfoResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PersonSetInfoParam extends BaseParam<PersonSetinfoResponse> {
    private String accessToken;
    private String personId;
    private String personName;
    private String tag;
    private String gender;
    private String birthday;
    private String address;
    private String idCard;

    @Override
    public String getApi() {
        return "/api/v1/person/set_info";
    }
}
