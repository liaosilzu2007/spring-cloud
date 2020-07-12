package com.lzumetal.springcloud.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author liaosi
 * @date 2020-07-12
 */
@SpringBootApplication
public class ApolloBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApolloBootstrap.class)
                .registerShutdownHook(true)
                .build(args)
                .run();
    }
}
