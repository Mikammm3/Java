package com.mika.blog.controller;

import com.mika.blog.constants.Constant;
import com.mika.blog.model.BlogInfo;
import com.mika.blog.service.BlogService;
import com.mika.blog.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping("/getList")
    public List<BlogInfo> getList() {
        List<BlogInfo> blogList = blogService.getBlogList();
        log.info("获取博客列表, blogList: " + blogList);
        return blogList;
    }

    @RequestMapping("/getBlogDetail")
    public BlogInfo getBlogDetail(Integer blogId, HttpServletRequest request) {
        BlogInfo blogInfo = blogService.getBlogById(blogId);
        if (blogInfo == null) return null;
        String token = request.getHeader(Constant.USER_TOKEN_HEADER);
        Integer userId = JwtUtils.getUserIdFromToken(token);
        if (userId != null && userId == blogInfo.getUserId()) {
            blogInfo.setIsLoginUser(true);
        }
        log.info("通过 blogId 获取博客详情, blogInfo: " + blogInfo);
        return blogInfo;
    }

    @RequestMapping("/publishBlog")
    public Boolean publishBlog(String title, String content, HttpServletRequest request) {
        log.info("发布博客");
        // 1. 参数校验
        // 2. 获取当前登录用户
        // 3. 发布博客
        if (!StringUtils.hasLength(title) || !StringUtils.hasLength(content)) {
            log.error("title or content 为空");
            return false;
        }
        String token = request.getHeader(Constant.USER_TOKEN_HEADER);
        Integer userId = JwtUtils.getUserIdFromToken(token);
        if (userId == null || userId < 1) {
            log.error("userId 不合法， userId: " + userId);
            return false;
        }
        BlogInfo blogInfo = new BlogInfo(title, content, userId);
        Integer result = blogService.publishBlog(blogInfo);
        return result > 0 ? true : false;
    }

    // 编辑博客
    @RequestMapping("/updateBlog")
    public Boolean update(String title, String content, Integer blogId) {
        log.info("update, 接收参数 title:{},content:{}", title, content);
        if (blogId == null || blogId < 1 || !StringUtils.hasLength(title) || !StringUtils.hasLength(content)) {
            log.error("blogId 或标题或正文为不合法");
            return false;
        }
        BlogInfo blogInfo = new BlogInfo(blogId, title, content);
        Integer result = blogService.updateBlog(blogInfo);
        return result > 0 ? true : false;
    }

    // 删除博客
    @RequestMapping("/deleteBlog")
    public Boolean delete(Integer blogId) {
        log.info("删除博客，blogId: " + blogId);
        if (blogId == null || blogId < 1) {
            log.error("blogId 不合法");
            return false;
        }
        BlogInfo blogInfo = new BlogInfo();
        blogInfo.setId(blogId);
        blogInfo.setDeleteFlag(1);
        Integer result = blogService.updateBlog(blogInfo);
        return result > 0 ? true : false;
    }

}
