package com.mika.mybatis.mapper;

import com.mika.mybatis.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @BeforeEach
    void setUp() {
        log.info("setUp...");
    }

    @AfterEach
    void tearDown() {
        log.info("tearDown...");
    }

    @Test
    void queryUserList() {
        log.info(userInfoMapper.queryUserList().toString());
    }

    @Test
    void queryUserInfo() {
        log.info(userInfoMapper.queryUserInfo(1).toString());
    }

    @Test
    void queryUserInfoByDF() {
        log.info(userInfoMapper.queryUserInfoByDF(1, 0).toString());
    }

    @Test
    void queryUserInfoParam() {
        log.info(userInfoMapper.queryUserInfoParam(1, 0).toString());
    }

    @Test
    void insert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("zhaoliu");
        userInfo.setPassword("123");
        userInfo.setAge(14);
        userInfo.setAge(0);
        userInfo.setPhone("123456");
        userInfoMapper.insert(userInfo);
    }

    @Test
    void insert2() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("zhaoliu");
        userInfo.setPassword("123");
        userInfo.setAge(14);
        userInfo.setAge(0);
        userInfo.setPhone("123456");
        userInfoMapper.insert2(userInfo);
        System.out.println(userInfo.getId());
    }

    @Test
    void delete() {
        userInfoMapper.delete(7);
    }

    @Test
    void update() {
        userInfoMapper.update("444", 1);
    }

    @Test
    void updateByOb() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(5);
        userInfoMapper.updateByOb(userInfo);
    }
}