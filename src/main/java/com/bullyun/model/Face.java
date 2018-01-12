package com.bullyun.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Face {
    @JsonProperty("face_id")
    private String faceId;
    @JsonProperty("img_url")
    private String imgUrl;
    @JsonProperty("position_x")
    private Integer positionX;
    @JsonProperty("position_y")
    private Integer positionY;
    @JsonProperty("position_w")
    private Integer positionW;
    @JsonProperty("position_h")
    private Integer positionH;
}
