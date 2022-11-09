package com.capsule.springcloud.cnh.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author bolin
 * @Date 2022 11 09 14 13
 **/
@Data
public class UserDto implements Serializable {
    //用户名
    private String name;
    //用户密码
    private String password;
}
