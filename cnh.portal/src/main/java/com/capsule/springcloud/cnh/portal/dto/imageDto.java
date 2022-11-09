package com.capsule.springcloud.cnh.portal.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * @Author bolin
 * @Date 2022 11 01 17 54
 **/
@Data
public class imageDto implements Serializable {
    MultipartFile[]  photos;
    String mid;
    HttpServletRequest request;
}
