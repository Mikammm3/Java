package com.mika.captcha;


import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("/admin")
public class KaptchaController {

    private static final String KAPTCHA_SESSION_KEY = "KAPTCHA_SESSION_KEY";
    private static final String KAPTCHA_SESSION_DATE = "KAPTCHA_SESSION_DATE";
    private static final long TIME_OUT = 60 * 1000;// 一分钟，毫秒数

    // 校验验证码是否正确
    @RequestMapping("/check")
    public boolean check(String input, HttpSession session) {
        // 1. 判断输入是否为空
        if (!StringUtils.hasLength(input)) {
            return false;
        }
        // 2. 获取生成的验证码
        String key = (String) session.getAttribute(KAPTCHA_SESSION_KEY);
        Date date = (Date) session.getAttribute(KAPTCHA_SESSION_DATE);
        // 3. 判断两个验证码是否相同
        if (input.equalsIgnoreCase(key)) {
            // 4. 确认验证码是否过期
            if (date == null || System.currentTimeMillis() - date.getTime() < TIME_OUT) {
                return true;
            }
        }
        return false;
    }
}
