package com.capsule.springcloud.cnh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author bolin
 * @Date 2022 11 01 16 34
 **/


@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class,args);
    }
}

