package com.ruoyi.framework.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordTest {
    public static void main(String[] args) {
        String password = "123456";
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        String encode1 = bCryptPasswordEncoder.encode(password);
        System.out.println("加密后的密码：" + encode1);
    }
}
