package com.bullyun.response.facedto;

import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GroupCreateResponse extends BaseResponse {
    private String groupId;
}
