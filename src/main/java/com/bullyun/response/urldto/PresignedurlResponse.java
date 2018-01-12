package com.bullyun.response.urldto;

import com.bullyun.model.Url;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
@Data
@EqualsAndHashCode
public class PresignedurlResponse extends BaseResponse {
    private List<Url> urls;
}
