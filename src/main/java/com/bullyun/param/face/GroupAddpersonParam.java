package com.bullyun.param.face;

import com.bullyun.model.Person;
import lombok.Data;

import java.util.List;

@Data
public class GroupAddpersonParam {
    private String accessToken;
    private String groupId;
    private List<Person> persons;
}
