package com.example.demo.ioc.repo;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void sayHi() {
        System.out.println("hello, UserRepository...");
    }
}
