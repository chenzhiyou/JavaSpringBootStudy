package com.springboot.springBootStudy.controller;

import com.springboot.springBootStudy.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("TestUser")
public class TestUserController {

//    @RequestMapping(value = "login",  method = RequestMethod.POST)
    @PostMapping("login")
    public String login(@RequestBody UserDto userDto){
        System.out.println(userDto.getName());
        System.out.println(userDto.getPwd());
        return "成功";
    }

    @RequestMapping(value = "ByID",  method = RequestMethod.GET)
    @GetMapping(value = "ByID")
    public String getInfo(@RequestParam(value = "userID", required = false) Long userID){
        System.out.println(userID);
        return "成功"+userID;
    }
}
