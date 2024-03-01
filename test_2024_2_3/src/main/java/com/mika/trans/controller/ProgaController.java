package com.mika.trans.controller;

import com.mika.trans.model.LogInfo;
import com.mika.trans.service.LogInfoService;
import com.mika.trans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proga")
public class ProgaController {
    @Autowired
    private LogInfoService logInfoService;
    @Autowired
    private UserService userService;

    @Transactional
    @RequestMapping("/p1")
    public String p1(String userName, String password) {
        userService.insertUser(userName, password);
        LogInfo logInfo = new LogInfo();
        logInfo.setUserName(userName);
        logInfo.setOp("用户注册");
        logInfoService.insertLog(logInfo);
        return "用户注册成功";
    }
}
