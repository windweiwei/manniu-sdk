package com.bullyun.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private String username;
    private String email;
    @JsonProperty("unvalid_email")
    private String unvalidEmail;
    private String phone;
    @JsonProperty("unvalid_phone")
    private String unvalidPhone;
    private String nickname;
    private String realname;
    private String avatar;
    @JsonProperty("register_date")
    private Long registerDate;
    @JsonProperty("active_date")
    private Long activeDate;
}
