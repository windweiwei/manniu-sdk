package com.bullyun.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Person {
    @JsonProperty("person_name")
    private String personName;
    private String tag;
    private String gender;
    private String birthday;
    private String address;
    @JsonProperty("id_card")
    private String idCard;
    private List<Face> faces;
}
