package com.w2x.ssm.service;

import com.w2x.ssm.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void delUser(int id);

    void updateUser(User user);

    List<User> findAll();
}
