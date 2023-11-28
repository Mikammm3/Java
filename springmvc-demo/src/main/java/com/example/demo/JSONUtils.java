package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//public class JSONUtils {
//
//    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        UserInfo userInfo = new UserInfo();
//        userInfo.setName("zhangsan");
//        userInfo.setAge(13);
//        userInfo.setId(1);
//
//        // 对象转 json
//        String JSON = objectMapper.writeValueAsString(userInfo);
//
//        System.out.println(JSON);
//
//        // json 转对象
//        UserInfo userInfo1 = objectMapper.readValue(JSON, UserInfo.class);
//        System.out.println(userInfo1);
//    }
//}
