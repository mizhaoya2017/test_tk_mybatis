package com.mzy.test_tk_mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.mzy.test_tk_mybatis.mapper")
public class TestTkMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTkMybatisApplication.class, args);
    }

}
