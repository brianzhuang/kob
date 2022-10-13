package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder  passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("Zjw19901213"));
        System.out.println(passwordEncoder.encode("123456"));
        System.out.println(passwordEncoder.encode("123456"));
        System.out.println(passwordEncoder.matches("Zjw19901213", "$2a$10$R1e9U59F.FxmsK8cdtu1Aep./dVxdn80xNswskk6WGBFMBXeOOCjm"));
    }

}
