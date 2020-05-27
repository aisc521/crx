package com.aisc.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//注册到eureka
@EnableEurekaClient
public class EurekaClientApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication2.class, args);
    }

}
