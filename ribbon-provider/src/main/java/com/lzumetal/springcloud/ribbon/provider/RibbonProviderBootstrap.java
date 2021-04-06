package com.lzumetal.springcloud.ribbon.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liaosi
 * @date 2021-04-06
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonProviderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(RibbonProviderBootstrap.class, args);
    }

}
