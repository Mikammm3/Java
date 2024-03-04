package com.mika.blog.mapper;

import com.mika.blog.model.BlogInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class BlogMapperTest {

    @Autowired
    private BlogMapper blogMapper;

    @Test
    void getBlogList() {
        log.info(blogMapper.getBlogList().toString());
    }

    @Test
    void getBlogById() {
        log.info(blogMapper.getBlogById(1).toString());
    }

    @Test
    void updateBlog() {
        BlogInfo blogInfo = new BlogInfo();
        blogInfo.setId(3);
//        blogInfo.setTitle("测试111111111111111");
//        blogInfo.setContent("测试正文111111111正文测试正文测试正文测试正文");
        blogInfo.setDeleteFlag(1);
        log.info(blogMapper.updateBlog(blogInfo).toString());
    }

    @Test
    void insertBlog() {
        BlogInfo blogInfo = new BlogInfo();
        blogInfo.setUserId(1);
        blogInfo.setTitle("测试博客测试博客");
        blogInfo.setContent("3333333测试正文测试正文测试正文测试正文测试正文测试正文测试正文测试正文");
        log.info(blogMapper.insertBlog(blogInfo).toString());
    }
}