package com.hongjia.service.impl;

import com.hongjia.dao.UserDao;
import com.hongjia.pojo.User;
import com.hongjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
// @Component
public class UserServiceImpl implements UserService {

    @Autowired // 应用程序运行时，会自动查询该类型的bean对象，并赋值给成员变量
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        // 1.调用dao，获取数据
        List<String> lines = userDao.findAll();

        // 2.解析用户信息，封装为user对象 -> list集合
        List<User> userList = lines.stream()
                .map(line -> {
                    String[] parts = line.split(",");
                    Integer id = Integer.parseInt(parts[0]);
                    String username = parts[1];
                    String password = parts[2];
                    String name = parts[3];
                    Integer age = Integer.parseInt(parts[4]);
                    LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    return new User(id, username, password, name, age, updateTime);
                })
                .collect(Collectors.toList());

        return userList;
    }
}
