package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping("/r1")
    public String r1(String name) {
        return "接收到参数 name: " + name;
    }

    @RequestMapping("/r2")
    public String r2(Integer age) {
        return "接收到参数 age: " + age;
    }


    @RequestMapping("/r3")
    public String r3(String name, Integer age) {
        return "name: " + name + ", age: " + age;
    }

    @RequestMapping("/r4")
    public String r4(UserInfo user) {
        return user.toString();
    }

    @RequestMapping("/r5")
    public String r5(@RequestParam(value = "name", required = false) String username, @RequestParam(value = "age", required = false) Integer userage) {
        return "username: " + username + ", userage: " + userage;
    }

    @RequestMapping("/r6")
    public String r6(String[] arr) {
        return Arrays.toString(arr) + ", length: " + arr.length;
    }

    @RequestMapping("/r7")
    public String r7(@RequestParam(value = "list", required = false) List<String> list) {
        if (list != null) {
            return list.toString();
        }
        return "list 为空";
    }
}

