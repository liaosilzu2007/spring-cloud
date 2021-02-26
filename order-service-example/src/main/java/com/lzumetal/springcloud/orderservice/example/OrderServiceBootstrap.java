package com.lzumetal.springcloud.orderservice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liaosi
 * @date 2021-02-24
 */
@SpringBootApplication
@EnableFeignClients
public class OrderServiceBootstrap {


    public static void main(String[] args) {
        SpringApplication.run(OrderServiceBootstrap.class, args);
    }

}
