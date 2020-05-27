package com.aisc.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.aisc.member.mapper"})
public class CrxMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrxMemberApplication.class, args);
    }

}
