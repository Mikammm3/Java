package com.mika.blog.service;

import com.mika.blog.constants.Constant;
import com.mika.blog.mapper.UserMapper;
import com.mika.blog.model.UserInfo;
import com.mika.blog.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserInfo getUserByName(String userName) {
        return userMapper.selectByName(userName);
    }

    public UserInfo getUserById(Integer userId) {
        return userMapper.selectById(userId);
    }

    public UserInfo getUserInfo(HttpServletRequest request) {
        // 1. 获取 token，从 token 中获取 ID
        // 2. 根据 ID，获取用户信息
        String user_token = request.getHeader(Constant.USER_TOKEN_HEADER);
        Integer userId = JwtUtils.getUserIdFromToken(user_token);
        return userMapper.selectById(userId);
    }
}
