package com.bullyun.response;

import lombok.Data;

@Data
public  class BaseResponse {
    /**
     * 编码
     */
    private Integer code;
    /**
     * 说明
     */
    private String msg;
}
