package com.aisc.serviceribbon.controller;

import com.aisc.serviceribbon.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {


    @Autowired
    private SayHiService sayHiService;

    @RequestMapping("/hi")
    public String hi(String name){
        return sayHiService.getNameInfo(name);

    }
}
