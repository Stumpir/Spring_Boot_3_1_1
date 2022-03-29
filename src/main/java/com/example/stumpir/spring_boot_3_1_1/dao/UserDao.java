package com.example.stumpir.spring_boot_3_1_1.dao;

import com.example.stumpir.spring_boot_3_1_1.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    User getUser(Long id);
    void update(Long id, User user);
    void delete(Long id);
}
