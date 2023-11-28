package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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

    @RequestMapping("/r8")
    public String r8(@RequestBody UserInfo userInfo) {
        return userInfo.toString();
    }

    @RequestMapping("/r9/{articleId}")
    public String r9(@PathVariable Integer articleId) {
        return "articleId: " + articleId;
    }

    @RequestMapping("/r10/{name}/{age}")
    public String r10(@PathVariable("name") String username, @PathVariable Integer age) {
        return "username: " + username + ", age: " + age;
    }

    @RequestMapping("/r11")
    public String r11(@RequestPart MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        // 将上传的文件放在 C:\Users\86135\Pictures\ 路径下
        file.transferTo(new File("C:\\Users\\86135\\Pictures\\" + fileName));
        return "获取上传文件: " + file.getOriginalFilename();
    }
}

