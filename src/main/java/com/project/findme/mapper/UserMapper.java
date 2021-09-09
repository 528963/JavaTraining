package com.project.findme.mapper;

import com.project.findme.entity.User;
import com.project.findme.sqlbuilder.UserBuilder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @SelectProvider(type = UserBuilder.class, method = "userlogin")
    @Options(flushCache = Options.FlushCachePolicy.FALSE, timeout = 10000)
    User userlogin(@Param(value = "loginuser") User loginuser);
}
