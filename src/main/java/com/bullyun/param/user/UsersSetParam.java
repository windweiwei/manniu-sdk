package com.bullyun.param.user;

import lombok.Data;

@Data
public class UsersSetParam {
    private String accessToken;
    private String unvalidEmail;
    private String countryCode;
    private String unvalidPhone;
    private String locale;
    private String nickname;
    private String realname;
}
