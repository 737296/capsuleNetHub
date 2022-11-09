package com.capsule.springcloud.cnh.hub.service.controller;

import com.capsule.springcloud.cnh.common.CommonResult;
import com.capsule.springcloud.cnh.dto.UserDto;
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
import java.util.HashMap;

/**
 * @Author bolin
 * @Date 2022 11 01 15 27
 **/

@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class serviceController {
//生产环境
//    public static final String flaskCapsule_URL = "http://192.168.0.96:5000";
public static final String flaskCapsule_URL = "http://localhost:5000";
    @Autowired

    private RestTemplate restTemplate;

    @GetMapping("/123")

    public CommonResult queryById() {
        log.info("访问成功");
        return new CommonResult(200, "查询成功");

    }

    @PostMapping("/api/upload")
    //允许跨域
    @CrossOrigin(origins = "*")
    public CommonResult insertDbMsPhoto(@RequestParam("photos") MultipartFile photos) {
//        try {
//            if (photos!=null) {
//                HashMap<String, String> hashMap = null;
//
//                    if (!photos.isEmpty()) {
//                        hashMap = new HashMap<>();
//                        String originalFilename = photos.getOriginalFilename();
//
//                        String sufixPhoto = originalFilename.split("\\.")[1];
//                        //拼接图片
//                        String date = new SimpleDateFormat("yyyyMM").format(System.currentTimeMillis());
//                        InputStream is = null;
//                        OutputStream os = null;
//                        //获得路径 本地路径
////                        String filePath = request.getSession().getServletContext().getRealPath("/UploadFiles/db/photo/" + date + "/");
//                        String filePath="C:\\Users\\mlamp\\Desktop\\123abc";
//                        File file = new File(filePath);
//                        if (!file.exists()) {
//                            //先创建该文件的所有上级目录
//                            if (file.getParentFile().mkdirs()) {
//                                try {
//                                    log.info("创建了文件目录====================");
//                                    //如果不存在就创建
//                                    file.mkdir();
//                                } catch (Exception e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                        }
//                        //获得图片名称
//                        String photoName = date + System.currentTimeMillis() + "." + sufixPhoto;
//                        log.info("图片被上传到了：{}", filePath + photoName);
//
//                        try {
//                            is = photos.getInputStream();
//                            os = new FileOutputStream(new File(filePath + photoName));
//                            FileCopyUtils.copy(is, os);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        } finally {
//                            try {
//                                os.flush();
//                                os.close();
//                                is.close();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//
//                //照片上传成功后返回照片信息到页面，用于更新页面显示的照片信息，便于删除是获取相关信息
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new CommonResult(400, "上传失败");
//        }
        LinkedMultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        MultiValueMap map = new LinkedMultiValueMap();
        map.add("photos", photos.getResource());
        log.info("Hub被调用8002");
        return restTemplate.postForObject(flaskCapsule_URL + "/api/upload", map, CommonResult.class);
    }
    @PostMapping("/api/login")
    public CommonResult login(@RequestBody UserDto userDto) {
        try {
            log.info("name:" + userDto.getName());
            log.info("name:" + userDto.getPassword());
            if (userDto.getName().equals("123") && userDto.getPassword().equals("123")) {
                return new CommonResult(200, "登录成功", userDto);

            } else {
                return new CommonResult(201, "登陆失败", userDto);
            }
        } catch (Exception e) {
            log.info("登录异常：" + e);
            return new CommonResult(202, "异常", e);
        }

    }
}
