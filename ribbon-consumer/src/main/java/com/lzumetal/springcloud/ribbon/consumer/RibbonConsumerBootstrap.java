package com.lzumetal.springcloud.ribbon.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liaosi
 * @date 2021-04-06
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class RibbonConsumerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumerBootstrap.class, args);
    }


}
