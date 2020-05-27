package com.aisc.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiController {

    @Value("${server.port}")
    private String port;

    /**
     * 提供服务
     * @param name
     * @return
     */
    @RequestMapping("/hi")
    public String hi(String name){
        return name + ",hi from:" + port;
    }
}
