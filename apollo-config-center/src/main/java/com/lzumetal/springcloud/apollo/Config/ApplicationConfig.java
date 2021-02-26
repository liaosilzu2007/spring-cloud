package com.lzumetal.springcloud.apollo.Config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liaosi
 * @date 2020-07-12
 */
@Configuration
@EnableApolloConfig //配置信息来源Apollo
public class ApplicationConfig {

    @Bean
    public ConfigBean couponConfig() {
        return new ConfigBean();
    }

}
