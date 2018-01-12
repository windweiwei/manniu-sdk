package com.bullyun.response.favoritedto;

import com.bullyun.model.Favorite;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class FavoriteGetResponse extends BaseResponse {
    private List<Favorite> favorites;
}
