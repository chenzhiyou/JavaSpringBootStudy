package com.springboot.springBootStudy.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "用户登录类",description = "请求类")
@Data
public class UserDto {

    @ApiModelProperty(value = "用户名",example = "xiaojiangshan",required = true)
    private String name;
    @ApiModelProperty(value = "密码",example = "123456",required = true)
    private String pwd;

}
