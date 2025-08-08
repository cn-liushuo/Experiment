package com.hongjia.service;

import com.hongjia.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户信息
     */
    public List<User> findAll();
}
