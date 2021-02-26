package com.lzumetal.springcloud.admin.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liaosi
 * @date 2020-05-17
 */
@SpringBootApplication
@EnableEurekaClient
public class AdminCloudClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminCloudClientApplication.class)
                .run(args);
    }
}
