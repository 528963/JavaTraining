package com.project.findme.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@ToString
@Getter
@Setter
public class Job {
    private String jkind;
    private int salary;
    private int jnum;
    private String area;
    private String contacts;
    private int tel;
    private Date time;
    private String require;
}
