package com.mika.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/t1")
    public Integer t1() {
        return 1;
    }

    @RequestMapping("/t2")
    public boolean t2() {
        String a = null;
        System.out.println(a.length());
        return true;
    }

    @RequestMapping("/t3")
    public String t3() {
        int a = 1 / 0;
        return "t3";
    }
}
