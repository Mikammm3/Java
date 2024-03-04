package com.mika.blog.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void selectByName() {
        log.info(userMapper.selectByName("zhangsan").toString());
    }

    @Test
    void selectById() {
        log.info(userMapper.selectById(1).toString());
    }
}