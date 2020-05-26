package com.shx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.shx.mapper"})
public class ZoneApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZoneApplication.class, args);
    }
}
