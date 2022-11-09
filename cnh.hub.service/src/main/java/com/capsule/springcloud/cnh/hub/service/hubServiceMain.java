package com.capsule.springcloud.cnh.hub.service;

/**
 * @Author bolin
 * @Date 2022 10 14 16 38
 **/


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//        import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//        import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class hubServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(hubServiceMain.class, args);
    }
}
