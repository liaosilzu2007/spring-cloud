package com.lzumetal.springcloud.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liaosi
 * @date 2020-05-17
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class AdminCloudServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminCloudServerApplication.class)
                .run(args);
    }
}
