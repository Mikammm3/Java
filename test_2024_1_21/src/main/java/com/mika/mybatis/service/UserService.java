package com.mika.mybatis.service;

import com.mika.mybatis.mapper.UserInfoMapper;
import com.mika.mybatis.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> queryAllUser() {
        return userInfoMapper.queryUserList();
    }


    public UserInfo queryUserByNameAndPs(String userName, String password) {
        List<UserInfo> userInfos = userInfoMapper.queryUserByNameAndPs(userName, password);
        if (userInfos.size() > 1) {
            return userInfos.get(0);
        }
        return null;
    }
}
