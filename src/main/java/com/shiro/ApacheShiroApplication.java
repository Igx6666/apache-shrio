package com.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@MapperScan(basePackages = "com.shiro.mapper")
public class ApacheShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApacheShiroApplication.class, args);
    }
}
