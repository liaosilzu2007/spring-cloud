package com.lzumetal.springcloud.gateway.config;

import com.lzumetal.springcloud.gateway.filter.ParameterGlobalFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;


/**
 * @author liaosi
 * @date 2021-04-19
 */
@Configuration
public class UserServiceRouteConfig {

    public void addRoute(RouteLocatorBuilder.Builder routeBuilder) {
        routeBuilder.route("user-service",
                predicateSpec -> predicateSpec.path("/user/**")
                        .uri("lb://biz-user-service"));
    }

}
