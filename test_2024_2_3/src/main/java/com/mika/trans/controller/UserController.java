package com.mika.trans.controller;

import com.mika.trans.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    @Autowired
    private TransactionDefinition transactionDefinition;

    @RequestMapping("/registry")
    public String registry(String userName, String password) {
        // 获取事务
        TransactionStatus transaction = dataSourceTransactionManager.getTransaction(transactionDefinition);

        Integer result = userService.insertUser(userName, password);
        log.info("数据插入成功, result: " + result);

        // 回滚事务
//        dataSourceTransactionManager.rollback(transaction);
        dataSourceTransactionManager.commit(transaction);
        return "注册成功";
    }
}
