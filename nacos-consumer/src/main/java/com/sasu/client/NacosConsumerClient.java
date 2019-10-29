package com.sasu.client;

import com.sasu.hystrix.NacosConsumerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nacos-provide", fallback = NacosConsumerHystrix.class)
public interface NacosConsumerClient {

    @GetMapping("/buyTicket/{num}")
    String buyTicket(@PathVariable("num") int num);
}
