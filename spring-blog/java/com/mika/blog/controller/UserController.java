package com.mika.blog.controller;

import com.mika.blog.model.Result;
import com.mika.blog.model.UserInfo;
import com.mika.blog.service.UserService;
import com.mika.blog.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 登录接口
    @RequestMapping("/login")
    public Result login(String userName, String password) {
        // 1. 对参数进行校验
        // 2. 对密码进行校验
        // 3. 如果校验成功，生成 token
        if (!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)) {
            return Result.fail("用户名和密码不能为空");
        }
        UserInfo userInfo = userService.getUserByName(userName);
        if (userInfo == null || userInfo.getId() < 1) return Result.fail("用户名或密码错误");
        if (password.equals(userInfo.getPassword())) {
            // 密码正确，生成 token
            return Result.success(JwtUtils.genToken(userInfo));
        }
        return Result.fail("用户名或密码错误");
    }
}
