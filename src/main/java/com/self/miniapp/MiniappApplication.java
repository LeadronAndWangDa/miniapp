package com.self.miniapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.self.miniapp.mapper")
public class MiniappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniappApplication.class, args);
    }
}
