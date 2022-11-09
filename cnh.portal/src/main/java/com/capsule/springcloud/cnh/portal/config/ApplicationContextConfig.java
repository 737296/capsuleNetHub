package com.capsule.springcloud.cnh.portal.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author bolin
 * @Date 2022 11 01 15 31
 **/

@Configuration
public class ApplicationContextConfig {
    @Bean
    //RestTemplate 的负载均衡能力
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
