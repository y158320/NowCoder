package com.nowcoder.testmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.nowcoder.testmybatis.mapper") //扫描的mapper
@SpringBootApplication
public class TestmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmybatisApplication.class, args);
    }

}
