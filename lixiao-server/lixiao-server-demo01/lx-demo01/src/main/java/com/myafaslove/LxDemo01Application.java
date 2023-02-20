package com.myafaslove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author afas
 */
@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public class LxDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(LxDemo01Application.class, args);
    }

}
