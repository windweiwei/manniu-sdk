package com.bullyun.param.face;

import lombok.Data;

@Data
public class GroupListParam {
    private String accessToken;
    private String groupId;
    private Integer type;
}
