package com.example.demo.controller;

import com.example.demo.model.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
// @RestController
@RequestMapping("/return")
public class ReturnController {

    @RequestMapping("/r1")
    public String r1() {
        return "/index.html";
    }

    @ResponseBody
    @RequestMapping("/r2")
    public String r2() {
        return "hello,spring";
    }

    @ResponseBody
    @RequestMapping("/r3")
    public String r3() {
        return "<h1>我是返回的 HTML 片段</h1>";
    }

    @ResponseBody
    @RequestMapping("/r4")
    public UserInfo r4() {
        UserInfo userInfo = new UserInfo(1, "zhangsan", 18);
        return userInfo;
    }

    @RequestMapping("/r5")
    @ResponseBody
    public Map<String, String> r5() {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        return map;
    }

    @RequestMapping("/r6")
    public String r6() {
        return "/a.js";
    }

    @RequestMapping("/r7")
    public String r7() {
        return "b.css";
    }

    @ResponseBody
    @RequestMapping("/r8")
    public String r8(HttpServletResponse response) {
        response.setStatus(401);
        return "设置状态码成功";
    }

    @ResponseBody
    @RequestMapping(value = "/r9", produces = "application/json;charset=utf8")
    public String r9() {
        return "{ \"ok\" :1}";
    }

    @ResponseBody
    @RequestMapping(value = "/r10")
    public String r10(HttpServletResponse response) {
        response.setHeader("myHeader", "myHeaderValue");
        return "设置 header 成功";
    }
}


