package com.sasu.hystrix;

import com.sasu.client.NacosConsumerClient;
import org.springframework.stereotype.Component;

@Component
public class NacosConsumerHystrix implements NacosConsumerClient {
    @Override
    public String buyTicket(int num) {
        return "服务暂不可用，请等待...";
    }
}
