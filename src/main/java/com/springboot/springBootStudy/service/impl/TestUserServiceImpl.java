package com.springboot.springBootStudy.service.impl;

import com.springboot.springBootStudy.dto.UserDto;
import com.springboot.springBootStudy.service.TestUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TestUserServiceImpl implements TestUserService {
    public String login(UserDto userDto){
        System.out.println(userDto.getName());
        System.out.println(userDto.getPwd());
        return "成功";
    }

}
