package com.bullyun.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Firmware {
    private String url;
    private Integer size;
    private String md5;
    private String version;
    @JsonProperty("min_version")
    private String minVersion;
    @JsonProperty("max_version")
    private String maxVersion;
    private String desc;
}
