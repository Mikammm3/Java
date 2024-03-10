package com.mika.blog.controller;

import com.mika.blog.model.BlogInfo;
import com.mika.blog.model.Result;
import com.mika.blog.model.UserInfo;
import com.mika.blog.service.BlogService;
import com.mika.blog.service.UserService;
import com.mika.blog.utils.JwtUtils;
import com.mika.blog.utils.SecurityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private BlogService blogService;

    // 登录接口
    @RequestMapping("/login")
    public Result login(String userName, String password) {
        log.info("用户登录， userName: " + userName + ", password: " + password);
        // 1. 对参数进行校验
        // 2. 对密码进行校验
        // 3. 如果校验成功，生成 token
        if (!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)) {
            return Result.fail("用户名和密码不能为空");
        }
        UserInfo userInfo = userService.getUserByName(userName);
        if (userInfo == null || userInfo.getId() < 1) return Result.fail("用户名或密码错误");
        // 密码校验
        if (SecurityUtils.verify(password, userInfo.getPassword())) {
            // 密码正确，生成 token
            return Result.success(JwtUtils.genToken(userInfo));
        }
        return Result.fail("用户名或密码错误");
    }

    // 获取当前登录用户的信息
    @RequestMapping("/getUserInfo")
    public UserInfo getUserInfo(HttpServletRequest request) {
        // 1. 获取 token，从 token 中获取 ID
        // 2. 根据 ID，获取用户信息
        UserInfo userInfo = userService.getUserInfo(request);
        if (userInfo == null) return null;
        log.info("getUserInfo, 获取 userInfo: " + userInfo.toString());
        userInfo.setPassword("");
        return userInfo;

    }

    // 根据博客ID，获取作者信息
    @RequestMapping("/getAuthor")
    public UserInfo getAuthor(Integer blogId) {
        if (blogId == null || blogId < 1) {
            return null;
        }
        BlogInfo blogInfo = blogService.getBlogById(blogId);
        if (blogInfo == null) return null;
        UserInfo userInfo = userService.getUserById(blogInfo.getUserId());
        if (userInfo == null) return null;
        log.info("getAuthor, 获取 userInfo: " + userInfo.toString());
        userInfo.setPassword("");
        return userInfo;
    }
}
