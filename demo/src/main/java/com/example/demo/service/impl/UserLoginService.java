package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;
import com.example.demo.service.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class UserLoginService implements UserLogin {
    @Autowired
    UserMapper userMapper;


    @Override
    public int signIn(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }
}
