package com.example.demo;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@RestController
@RequestMapping("/request")
public class RequestController {

    @RequestMapping("/getCookie")
    public String getCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            Arrays.stream(cookies).forEach(x -> System.out.println(x.getName() + ": " + x.getValue()));

            for (Cookie x : cookies) {
                System.out.println(x.getName() + ": " + x.getValue());
            }

            return "获取 Cookie 成功";
        }
        return "Cookie 为空";
    }

    @RequestMapping("/getCookie2")
    public String getCookie2(@CookieValue("bite") String bite) {
        return "bite: " + bite;
    }

    @RequestMapping("/setSession")
    public String setSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("userName", "zhangsan");
        return "设置 session 成功";
    }

    @RequestMapping("getSession")
    public String getSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("userName");
        return "登录用户: " + username;
    }

    @RequestMapping("getSession2")
    public String getSession2(HttpSession session) {
        String username = (String) session.getAttribute("userName");
        return "登录用户: " + username;
    }

    @RequestMapping("getSession3")
    public String getSession3(@SessionAttribute(value = "userName", required = false) String username) {
        return "登录用户: " + username;
    }
}
