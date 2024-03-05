package com.mika.blog.service;

import com.mika.blog.mapper.UserMapper;
import com.mika.blog.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserInfo getUserByName(String userName) {
        return userMapper.selectByName(userName);
    }
}
