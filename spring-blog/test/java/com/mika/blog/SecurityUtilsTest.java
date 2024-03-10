package com.mika.blog;

import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.UUID;

public class SecurityUtilsTest {

    @Test
    public void encrypt() {
        String password = "123";
        String md5Str = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println(md5Str);
        String salt = UUID.randomUUID().toString().replace("-", "");
        System.out.println(salt);
        // 密文内容：对盐值+明文拼接的字符串进行加密
        String securityPassword = DigestUtils.md5DigestAsHex((salt + password).getBytes());
        // 将盐值和密文存储在数据库中
        String finalPassword = salt + securityPassword;
        System.out.println(finalPassword);
    }

    @Test
    public void verify() {
        String inputPassword = "123";
        String sqlPassword = "8eb4de8727484ae19a9c9bbf311550665321c8a593db6e0a07cecc8bfc53e626";

        // sqlPassword： salt + md5(salt + password)
        if (!StringUtils.hasLength(sqlPassword) || sqlPassword.length() != 64) {
            System.out.println("校验失败, 数据库密码错误");
            return;
        }
        if (!StringUtils.hasLength(inputPassword)) {
            System.out.println("校验失败, 输入的密码为空");
            return;
        }

        String salt = sqlPassword.substring(0, 32);
        String securityPassword = DigestUtils.md5DigestAsHex((salt + inputPassword).getBytes());
        String finalPassword = salt + securityPassword;
        if (sqlPassword.equals(finalPassword)) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }
    }
}
