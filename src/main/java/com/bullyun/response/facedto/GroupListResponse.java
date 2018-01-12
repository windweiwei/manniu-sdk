package com.bullyun.response.facedto;

import com.bullyun.model.Group;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class GroupListResponse extends BaseResponse {
    private List<Group> groups;
}
