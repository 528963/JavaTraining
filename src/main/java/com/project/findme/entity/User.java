package com.project.findme.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class User {
    private int uid;
    private String password;
    private String username;
}
