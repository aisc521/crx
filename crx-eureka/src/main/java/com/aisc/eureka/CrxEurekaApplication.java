package com.aisc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//注册为EurekaServer注册中心
@EnableEurekaServer
public class CrxEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrxEurekaApplication.class, args);
    }

}
