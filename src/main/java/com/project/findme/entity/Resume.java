package com.project.findme.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@ToString
@Setter
@Getter
public class Resume {
    private int resid;
    private int uid;
    private String name;
    private String sex;
    private int tel;
    private Date birthday;
    private String marriage;
    private String politics;
    private String education;
    private String school;
    private String major;
    private String post;
    private String experience;
    private String introduction;
}

