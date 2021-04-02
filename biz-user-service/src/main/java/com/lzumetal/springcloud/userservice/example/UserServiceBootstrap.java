package com.lzumetal.springcloud.userservice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liaosi
 * @date 2021-02-24
 */
@SpringBootApplication
@EnableEurekaClient
public class UserServiceBootstrap {


    public static void main(String[] args) {
        SpringApplication.run(UserServiceBootstrap.class, args);
    }

}
