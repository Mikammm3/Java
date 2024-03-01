package com.mika.trans.service;

import com.mika.trans.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Transactional(propagation = Propagation.NESTED)
    public Integer insertUser(String userName, String password) {
        return userInfoMapper.insertUser(userName, password);
    }
}
