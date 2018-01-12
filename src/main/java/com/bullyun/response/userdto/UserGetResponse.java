package com.bullyun.response.userdto;

import com.bullyun.model.User;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserGetResponse extends BaseResponse {
    private User user;
}
