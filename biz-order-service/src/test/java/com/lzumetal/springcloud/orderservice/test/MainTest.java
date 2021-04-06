package com.lzumetal.springcloud.orderservice.test;

import com.lzumetal.cloud.common.resp.ResponseData;
import com.lzumetal.springcloud.orderservice.OrderServiceBootstrap;
import com.lzumetal.springcloud.orderservice.client.SinaApiClient;
import com.lzumetal.springcloud.orderservice.client.UserServiceClient;
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

    @Autowired
    private UserServiceClient userServiceClient;


    @Test
    public void sinaApiClientTest() {
        String resp = sinaApiClient.getByCode("sh601006");
        System.out.println(resp);
    }

    @Test
    public void getUserByIdTest() {
        ResponseData resp = userServiceClient.getById(2);
        System.out.println(resp);
    }

}
