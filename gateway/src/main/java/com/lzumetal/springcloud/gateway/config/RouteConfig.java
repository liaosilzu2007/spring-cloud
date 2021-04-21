package com.lzumetal.springcloud.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liaosi
 * @date 2021-04-20
 */
@Configuration
public class RouteConfig {

    @Autowired
    private UserServiceRouteConfig userServiceRouteConfig;

    @Bean
    public RouteLocator activityRouter(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder builderRoutes = builder.routes();
        userServiceRouteConfig.addRoute(builderRoutes);
        return builderRoutes.build();
    }
}
