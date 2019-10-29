package com.sasu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问地址： http://127.0.0.1:8080/getValue
 */
@RestController
@RefreshScope
public class NacosConfigController {
    @Value("${nacos.config}")
    private String config;

    @GetMapping("/getValue")
    public String getValue() {
        return config;
    }
}
