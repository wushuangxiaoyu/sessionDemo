package com.demo.service;


import com.demo.common.ServerResponse;
import com.demo.pojo.User;

/**
 *
 * @author Yu
 * @create 2018-08-07 20:11
 **/
public interface UserService {

    ServerResponse<User> login(String username, String password);

}
