package com.capsule.springcloud.cnh.portal.controller;

import com.capsule.springcloud.cnh.common.CommonResult;
import com.capsule.springcloud.cnh.dto.TrainAccuracyDto;
import com.capsule.springcloud.cnh.dto.TrainHistoryDto;
import com.capsule.springcloud.cnh.dto.UserDto;
import com.capsule.springcloud.cnh.portal.dto.imageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author bolin
 * @Date 2022 10 14 17 56
 **/
@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class portalController {
    //eureka注册中心名称 转发地址
    public static final String hubService_URL = "http://hubService";
    //本地转发地址
//    public static final String hubService_URL = "http://localhost:8002";
    @Autowired
    private RestTemplate restTemplate;

    //调试demo
    @GetMapping("/123")
    public CommonResult queryById() {
        log.info("8080请求");

        return restTemplate.getForObject(hubService_URL + "/123", CommonResult.class);

    }

    //登录
    @PostMapping("/api/login")
    public CommonResult login(@RequestBody UserDto userDto) {
        try {
            return restTemplate.postForObject(hubService_URL + "/api/login", userDto, CommonResult.class);
        } catch (Exception e) {
            log.info("登录异常：" + e);
            return new CommonResult(202, "异常", e);
        }

    }

    //图片检测
    @PostMapping("/api/upload")
    @CrossOrigin(origins = "*")
    public CommonResult insertDbMsPhoto(@RequestParam("photos") MultipartFile photos) {
        LinkedMultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        MultiValueMap map = new LinkedMultiValueMap();
        map.add("photos", photos.getResource());
        log.info("potral被调用8080");
        return restTemplate.postForObject(hubService_URL + "/api/upload", map, CommonResult.class);
    }
    //查询训练历史
    @PostMapping("/api/querytrainhistory")
    @CrossOrigin(origins = "*")
    public CommonResult queryTrainHistory(@RequestBody TrainHistoryDto trainHistoryDto){
        try{
            return restTemplate.postForObject(hubService_URL + "/api/querytrainhistory",trainHistoryDto,CommonResult.class);
        }catch (Exception e){
            log.info("查询训练历史异常：" + e);
            return new CommonResult(202, "异常", e);
        }
    }
    //查询训练准确度
    @PostMapping("/api/querytrainaccuracy")
    @CrossOrigin(origins = "*")
    public CommonResult queryTrainAccuracy(@RequestBody TrainAccuracyDto trainAccuracyDto){
        try{
            return restTemplate.postForObject(hubService_URL + "/api/querytrainaccuracy",trainAccuracyDto, CommonResult.class);
        }catch (Exception e){
            log.info("查询训练准确度：" + e);
            return new CommonResult(202, "异常", e);
        }
    }
    //查询预测历史
    @PostMapping("/api/querypredicthistory")
    public CommonResult queryPredictHistory(@RequestBody HashMap<String, String> map){
        try{
            return restTemplate.postForObject(hubService_URL+"/api/querypredicthistory",map,CommonResult.class);
        }catch (Exception e){
            log.info("查询预测历史：" + e);
            return new CommonResult(202, "异常", e);
        }
    }
    @PostMapping("/api/querytrainmodel")
    public CommonResult queryTrainModel(@RequestBody HashMap<String, String> map){
        try{
            return restTemplate.postForObject(hubService_URL+"/api/querytrainmodel",map,CommonResult.class);
        }catch (Exception e){
            log.info("查询模型：" + e);
            return new CommonResult(202, "异常", e);
        }
    }

}
