package com.bullyun.response.areasdto;

import com.bullyun.model.Area;
import com.bullyun.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class AreasResponse extends BaseResponse {
    private List<Area> areas;
}
