package com.lzumetal.springcloud.apollo.test;

import com.lzumetal.springcloud.apollo.ApolloBootstrap;
import com.lzumetal.springcloud.apollo.Config.ConfigBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @author liaosi
 * @date 2020-07-12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApolloBootstrap.class)
public class MainTest {

    @Autowired
    private ConfigBean configBean;

    @Test
    public void testConfig() throws InterruptedException {
        while (true) {
            System.out.println("------->" + configBean.getCouponCount());
            TimeUnit.SECONDS.sleep(2L);
        }
    }


    @Test
    public void getCouponType() {
        System.out.println("type=" + configBean.getType());
    }
}
