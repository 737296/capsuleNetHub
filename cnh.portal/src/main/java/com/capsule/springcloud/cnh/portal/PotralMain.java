package com.capsule.springcloud.cnh.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author bolin
 * @Date 2022 10 14 17 53
 **/


@SpringBootApplication
@EnableEurekaClient
public class PotralMain {
    public static void main(String[] args) {
        SpringApplication.run(PotralMain.class, args);
    }
}

