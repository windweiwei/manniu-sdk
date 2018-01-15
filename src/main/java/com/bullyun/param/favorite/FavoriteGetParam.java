package com.bullyun.param.favorite;

import com.bullyun.param.BaseParam;
import com.bullyun.response.favoritedto.FavoriteGetResponse;

public class FavoriteGetParam extends BaseParam<FavoriteGetResponse> {
    private String accessToken;

    @Override
    public String getApi() {
        return "/api/v1/favorites/get";
    }
}
