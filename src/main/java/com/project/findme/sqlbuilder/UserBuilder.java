package com.project.findme.sqlbuilder;

import com.project.findme.entity.User;

public class UserBuilder {

    public String userlogin(User loginuser){
        String sql = "select * from user where username = '" + loginuser.getUsername() + "' and pwd = '" + loginuser.getPassword() + "'";
        return sql;
    }
}
