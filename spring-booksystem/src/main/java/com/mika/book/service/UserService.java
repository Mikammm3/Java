package com.mika.book.service;


import com.mika.book.mapper.UserInfoMapper;
import com.mika.book.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 从数据库中查询用户信息
     *
     * @param userName
     * @return
     */
    public UserInfo queryByName(String userName) {
        return userInfoMapper.queryByName(userName);
    }
}
