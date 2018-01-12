package com.bullyun.param.urls;

import com.bullyun.model.Url;
import com.bullyun.param.BaseParam;
import com.bullyun.response.urldto.PresignedurlResponse;

import java.util.List;

public class PresignedurlParam extends BaseParam<PresignedurlResponse> {
    private List<Url> urls;

    @Override
    public String getApi() {
        return "/api/v1/presignedurl";
    }
}
