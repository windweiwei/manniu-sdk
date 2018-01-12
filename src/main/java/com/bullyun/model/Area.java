package com.bullyun.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Area {
    @JsonProperty("en_name")
    private String enName;
    @JsonProperty("cn_name")
    private String cnName;
    private String nc;
    private String ac;
    private Integer code;
}
