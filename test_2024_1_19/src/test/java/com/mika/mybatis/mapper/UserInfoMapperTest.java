package com.mika.mybatis.mapper;

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
        log.info(userInfoMapper.queryUserInfoByDF(1,0).toString());
    }

    @Test
    void queryUserInfoParam() {
        log.info(userInfoMapper.queryUserInfoParam(1,0).toString());
    }
}