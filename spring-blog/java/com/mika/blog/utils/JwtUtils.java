package com.mika.blog.utils;

import com.mika.blog.constants.Constant;
import com.mika.blog.model.UserInfo;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;


import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class JwtUtils {

    // 设置过期时间 1h
    private static final long EXPIRATION_DATE = 60 * 60 * 1000;

    private static final String secretString = "40CeNXAdNOjv6tnZillEnBD11w9px3eG8uUkfLs3P1w=";

    private static final Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretString));

    // 生成令牌
    public static String genToken(UserInfo userInfo) {
        Map<String, Object> claim = new HashMap<>();
        claim.put(Constant.USER_CLAIM_ID, userInfo.getId());
        claim.put(Constant.USER_CLAIM_NAME, userInfo.getUserName());
        claim.put(Constant.USER_CLAIM_GITHUB, userInfo.getGithubUrl());

        String token = Jwts.builder()
                .setClaims(claim)
                .signWith(key)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_DATE))
                .compact();
        log.info("生成令牌 token: " + token);
        return token;
    }

    // 生成 key
    public static void genKey() {
        // 生成 key
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String encode = Encoders.BASE64.encode(secretKey.getEncoded());
        log.info("生成 encode: " + encode);
    }

    // 校验令牌
    public static Boolean checkToken(String token) {
        Claims claims = JwtUtils.parseClaim(token);
        if (claims == null) return false;
//        log.info(claims.toString());
        return true;
    }

    // 解析令牌
    public static Claims parseClaim(String token) {
        JwtParser build = Jwts.parserBuilder().setSigningKey(key).build();
        Claims body = null;
        try {
            body = build.parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException e) {
            log.error("token 过期, token: " + token);
        } catch (Exception e) {
            log.error("令牌校验失败, token: " + token + ", e:{}", e);
        }
        return body;
    }


    public static Integer getUserIdFromToken(String token) {
        Claims claims = JwtUtils.parseClaim(token);
        if (claims != null) {
//            log.info(claims.toString());
            return (Integer) claims.get(Constant.USER_CLAIM_ID);
        }
        return null;
    }
}
