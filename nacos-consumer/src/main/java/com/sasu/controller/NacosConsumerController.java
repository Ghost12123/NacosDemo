package com.sasu.controller;

import com.sasu.client.NacosConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 购票服务消费者
 * 访问地址： http://127.0.0.1:9528/takeTicket/{num}
 */
@RestController
public class NacosConsumerController {

    @Autowired
    private NacosConsumerClient nacosConsumerClient;

    @GetMapping("/takeTicket/{num}")
    public String takeTicket(@PathVariable("num") int num) {
        return nacosConsumerClient.buyTicket(num);
    }
}
