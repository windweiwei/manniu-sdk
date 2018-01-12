package com.bullyun.param.Favorite;

import com.bullyun.param.BaseParam;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class FavoriteSetParam extends BaseParam<BaseResponse> {
    private String accessToken;
    private String type;
    private String favorite;

    @Override
    public String getApi() {
        return "/api/v1/favorites/set";
    }
}
