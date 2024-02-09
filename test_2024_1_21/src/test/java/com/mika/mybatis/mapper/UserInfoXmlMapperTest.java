package com.mika.mybatis.mapper;

import com.mika.mybatis.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserInfoXmlMapperTest {

    @Autowired
    private UserInfoXmlMapper userInfoXmlMapper;

    @Test
    void queryUserList() {
        log.info(userInfoXmlMapper.queryUserList().toString());
    }

    @Test
    void queryUserList2() {
        log.info(userInfoXmlMapper.queryUserList2().toString());
    }

    @Test
    void insert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("zhaoliu");
        userInfo.setPassword("123");
        userInfo.setAge(14);
        userInfo.setAge(0);
        userInfo.setPhone("123456");
        userInfoXmlMapper.insert(userInfo);
    }

    @Test
    void delete() {
        userInfoXmlMapper.delete(3);
    }

    @Test
    void update() {
        userInfoXmlMapper.update("hhhh", 2);
    }

    @Test
    void insert2() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("zhaoliu");
//        userInfo.setPassword("123");
//        userInfo.setAge(14);
//        userInfo.setPhone("123456");
        userInfoXmlMapper.insert2(userInfo);
    }

    @Test
    void queryUserByWhere() {
        log.info(userInfoXmlMapper.queryUserByWhere(null, null).toString());
    }

    @Test
    void update2() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(13);
        userInfo.setUsername("lisi");
//        userInfo.setPassword("123");
//        userInfo.setAge(14);
//        userInfo.setPhone("123456");
        userInfoXmlMapper.update2(userInfo);
    }

    @Test
    void batchDelete() {
        userInfoXmlMapper.batchDelete(Arrays.asList(14, 15));
    }
}