package com.lzumetal.springcloud.orderservice.example.test;

import com.lzumetal.springcloud.orderservice.example.OrderServiceBootstrap;
import com.lzumetal.springcloud.orderservice.example.client.SinaApiClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liaosi
 * @date 2021-02-24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderServiceBootstrap.class)
public class MainTest {


    @Autowired
    private SinaApiClient sinaApiClient;


    @Test
    public void testSinaApiClient() {
        String resp = sinaApiClient.getByCode("sh601006");
        System.out.println(resp);
    }

}
