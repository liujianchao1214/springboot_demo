package com.qf.springboot_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*扫描com.qf下的conterller*/
@SpringBootApplication(scanBasePackages= "com.qf")
/*扫描mapper文件*/
@MapperScan("com.qf.dao")
public class SpringbootDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
