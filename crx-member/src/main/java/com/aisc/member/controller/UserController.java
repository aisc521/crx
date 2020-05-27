package com.aisc.member.controller;


import com.aisc.member.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author cuishuai
 * @Date 2020/5/12 16:29
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfoById")
    public String getUserInfoById(String userId){
        return userService.getUserInfoById(userId);
    }

}
