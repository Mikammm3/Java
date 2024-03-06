package com.mika.blog;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {

    // 设置过期时间 1h
    private static final long EXPIRATION_DATE = 60 * 60 * 1000;

    private static final String secretString = "40CeNXAdNOjv6tnZillEnBD11w9px3eG8uUkfLs3P1w=";

    private static final Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretString));

    // 生成令牌
    @Test
    public void genToken() {
        Map<String, Object> claim = new HashMap<>();
        claim.put("id", 8);
        claim.put("name", "zhangsan");

        String token = Jwts.builder()
                .setClaims(claim)
                .signWith(key)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_DATE))
                .compact();
        System.out.println(token);
    }

    // 生成 key
    @Test
    public void genKey() {
        // 生成 key
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String encode = Encoders.BASE64.encode(secretKey.getEncoded());
        System.out.println(encode);
    }

    // 校验令牌
    @Test
    public void parseToken() {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiemhhbmdzYW4iLCJpZCI6OCwiZXhwIjoxNzA5NjE5NDA2fQ.kWi1bt-oO8fGzmzIzMbUxCv-QpDTagPI5GaAjLhulzc";
        JwtParser build = Jwts.parserBuilder().setSigningKey(key).build();
        Claims body = null;
        try {
            body = build.parseClaimsJws(token).getBody();
        } catch (Exception e) {
            System.out.println("令牌校验失败");
        }
        System.out.println(body);
    }
}
