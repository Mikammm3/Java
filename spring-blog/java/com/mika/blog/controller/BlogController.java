package com.mika.blog.controller;

import com.mika.blog.model.BlogInfo;
import com.mika.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping("/getList")
    public List<BlogInfo> getList() {
        return blogService.getBlogList();
    }

    @RequestMapping("/getBlogDetail")
    public BlogInfo getBlogDetail(Integer blogId) {
        return blogService.getBlogById(blogId);
    }

}
