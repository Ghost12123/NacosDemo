package com.example.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 购票服务提供者
 * 访问地址： http://127.0.0.1:9527/buyTicket/{num}
 */
@RestController
public class NacosProvideController {

    int ticket = 88;        //当前票数

    @GetMapping("/buyTicket/{num}")
    public String butTicket(@PathVariable("num") int num) {
        //若购票数>当前票数，则不允许购买
        if (num > ticket) {
            return "当前票数不足，购票失败";
        } else {
            ticket = ticket - num;
            return "购票" + num + "张成功, 当前剩余票数：" + ticket;
        }
    }
}
