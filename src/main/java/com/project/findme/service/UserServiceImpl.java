package com.project.findme.service;

import com.project.findme.entity.User;
import com.project.findme.mapper.UserMapper;

public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;
    public UserServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public User urlogin(User loginuser) {
        return userMapper.userlogin(loginuser);
    }
}
