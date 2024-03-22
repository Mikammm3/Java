package com.mika.chatroom.service;

import com.mika.chatroom.mapper.UserMapper;
import com.mika.chatroom.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Integer insert(User user) {
        return userMapper.insert(user);
    }

    public User selectByName(String userName) {
        return userMapper.selectByName(userName);
    }
}
