package com.bullyun.response.userdto;

import com.bullyun.response.BaseResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SignInResponse extends BaseResponse {
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("user_id")
    private String userId;

}
