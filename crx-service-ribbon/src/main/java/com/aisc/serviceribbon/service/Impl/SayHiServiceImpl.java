package com.aisc.serviceribbon.service.Impl;


import com.aisc.serviceribbon.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SayHiServiceImpl implements SayHiService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getNameInfo(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name,String.class);
    }
}
