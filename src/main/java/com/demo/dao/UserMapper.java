package com.demo.dao;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {

    int checkUsername(String username);

    User selectLogin(@Param("username") String username, @Param("password") String password);

}