package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserLogin {
    int signIn(User user);
    List<User> getAllUser();
}

