package com.mika.blog.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.UUID;

@Slf4j
public class SecurityUtils {

    // 根据明文，进行加密
    public static String encrypt(String password) {
        String md5Str = DigestUtils.md5DigestAsHex(password.getBytes());
        String salt = UUID.randomUUID().toString().replace("-", "");
        // 密文内容：对盐值+明文拼接的字符串进行加密
        String securityPassword = DigestUtils.md5DigestAsHex((salt + password).getBytes());
        // 将盐值和密文存储在数据库中
        String finalPassword = salt + securityPassword;
        return finalPassword;
    }


    // 解密
    public static Boolean verify(String inputPassword, String sqlPassword) {
        // sqlPassword： salt + md5(salt + password)
        if (!StringUtils.hasLength(sqlPassword) || sqlPassword.length() != 64) {
            log.error("校验失败, 数据库密码格式错误");
            return false;
        }
        if (!StringUtils.hasLength(inputPassword)) {
            log.error("校验失败, 输入的密码为空");
            return false;
        }
        String salt = sqlPassword.substring(0, 32);
        String securityPassword = DigestUtils.md5DigestAsHex((salt + inputPassword).getBytes());
        String finalPassword = salt + securityPassword;
        return sqlPassword.equals(finalPassword);
    }
}
