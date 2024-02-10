package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/request")
public class RequestController {

    @RequestMapping("/getCookie")
    public String getCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + ": " + cookie.getValue());
            }
            return "获取 Cookie 成功";
        }
        return "获取 Cookie 失败";
    }


    @RequestMapping("/getCookie2")
    public String getCookie2(@CookieValue("bite") String cookie) {
        return "bite: " + cookie;
    }

    @RequestMapping("/setSession")
    public String setSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("username", "zhangsan");
        return "设置 Session 成功";
    }

    @RequestMapping("/getSession")
    public String getSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        return "登录用户: " + username;
    }

    @RequestMapping("/getSession2")
    public String getSession2(HttpSession session) {
        String username = (String) session.getAttribute("username");
        return "登录用户: " + username;
    }


    @RequestMapping("/getSession3")
    public String getSession3(@SessionAttribute(value = "username", required = false) String username) {
        return "useername :" + username;
    }


    @RequestMapping("/getHeader")
    public String getHeader(HttpServletRequest request) {
        String userAgent = request.getHeader("User-Agent");
        return "userAgent: " + userAgent;
    }

    @RequestMapping("/getHeader2")
    public String getHeader2(@RequestHeader("User-Agent") String userAgent) {
        return "userAgent: " + userAgent;
    }
}
