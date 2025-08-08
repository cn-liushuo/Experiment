package com.hongjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 开启了SpringBoot对Servlet组件的支持
@SpringBootApplication
public class ITliasWebManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ITliasWebManagementApplication.class, args);
    }

}
