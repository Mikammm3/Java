package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        UserInfo userInfo = new UserInfo();
        userInfo.setName("zhangsan");
        userInfo.setAge(17);
        userInfo.setId(11);

        // 对象转 json
        String json = objectMapper.writeValueAsString(userInfo);
        System.out.println(json);
        // json 转对象
        UserInfo userInfo1 = objectMapper.readValue(json, UserInfo.class);
        System.out.println(userInfo1);
    }
}
