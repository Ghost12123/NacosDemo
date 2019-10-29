package com.sasu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问地址： http://127.0.0.1:9984/getValue, http://127.0.0.1:9984/getShare1, http://127.0.0.1:9984/getShare2
 * 共享配置两种方式实现：
 * 1. shared-dataids: share、shareConfig1、shareConfig2
 * 2. ext-config: shareConfig3、shareConfig4
 */
@RestController
@RefreshScope
public class NacosConfigShareController {

    @Value("${nacos.share}")
    private String share;

    @Value("${share.config1}")
    private String shareConfig1;

    @Value("${share.config2}")
    private String shareConfig2;

    @Value("${share.config3}")
    private String shareConfig3;

    @Value("${share.config4}")
    private String shareConfig4;

    @GetMapping("/getValue")
    public String getValue() {
        return share;
    }

    @GetMapping("/getShare1")
    public String getShare1() {
        return shareConfig1;
    }

    @GetMapping("/getShare2")
    public String getShare2() {
        return shareConfig2;
    }

    @GetMapping("/getShare3")
    public String getShare3() {
        return shareConfig3;
    }

    @GetMapping("/getShare4")
    public String getShare4() {
        return shareConfig4;
    }
}
