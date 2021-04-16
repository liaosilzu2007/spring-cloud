package com.lzumetal.springcloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author liaosi
 * @date 2021-04-15
 */
@SpringBootApplication
@EnableHystrix
public class HystrixBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(HystrixBootstrap.class, args);
    }


}
