package com.bullyun.param;


import com.bullyun.response.BaseResponse;
import lombok.Data;

@Data
public abstract class BaseParam<T extends BaseResponse> {
    public abstract String getApi();
}
