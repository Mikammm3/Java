package com.mika.mybatis;

import com.mika.mybatis.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisDemoApplicationTests {
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Test
	void contextLoads() {
		System.out.println(userInfoMapper.queryUserList());
	}

}
