package com.project.findme.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Company {
    private String c_uname;
    private String c_pwd;
    private String c_name;
    private String scope;
    private String hr;
    private int e_tel;
    private String addr;
    private String intro;

}
