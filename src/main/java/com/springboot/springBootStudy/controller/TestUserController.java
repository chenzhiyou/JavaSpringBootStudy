package com.springboot.springBootStudy.controller;

import com.springboot.springBootStudy.dto.UserDto;
import com.springboot.springBootStudy.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("TestUser")
public class TestUserController {

    @Autowired
    private TestUserService testUserService;

    @Value("${hogwarts.key1}")
    private String hogwartsKey1;

//    @RequestMapping(value = "login",  method = RequestMethod.POST)
    @PostMapping("login")
    public String login(@RequestBody UserDto userDto){
        testUserService.login(userDto);
        return "成功"+ hogwartsKey1;
    }

    @RequestMapping(value = "ByID",  method = RequestMethod.GET)
    @GetMapping(value = "ByID")
    public String getInfo(@RequestParam(value = "userID", required = false) Long userID){
        System.out.println(userID);
        return "成功"+userID;
    }
}
