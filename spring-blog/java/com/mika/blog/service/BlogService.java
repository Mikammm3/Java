package com.mika.blog.service;

import com.mika.blog.mapper.BlogMapper;
import com.mika.blog.model.BlogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogMapper blogMapper;

    public List<BlogInfo> getBlogList() {
        List<BlogInfo> blogInfos = blogMapper.getBlogList();
        for (BlogInfo blogInfo : blogInfos) {
            if (blogInfo.getContent().length() > 100) {
                blogInfo.setContent(blogInfo.getContent().substring(0, 100) + "...");
            }
        }
        return blogInfos;
    }

    public BlogInfo getBlogById(Integer blogId) {
        return blogMapper.getBlogById(blogId);
    }

    public Integer publishBlog(BlogInfo blogInfo) {
        return blogMapper.insertBlog(blogInfo);
    }

    public Integer updateBlog(BlogInfo blogInfo) {
        return blogMapper.updateBlog(blogInfo);
    }
}
