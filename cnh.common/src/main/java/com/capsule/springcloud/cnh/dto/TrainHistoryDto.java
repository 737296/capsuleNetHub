package com.capsule.springcloud.cnh.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author bolin
 * @Date 2022 12 08 15 04
 **/
@Data
public class TrainHistoryDto implements Serializable {
    //模型名称
    private String trainModelName;
    //训练轮次
    private String trainEpochs;
    //训练用户
    private String userName;

}
