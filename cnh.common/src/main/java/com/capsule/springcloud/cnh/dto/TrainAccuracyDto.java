package com.capsule.springcloud.cnh.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author bolin
 * @Date 2022 12 08 15 04
 **/
@Data
public class TrainAccuracyDto implements Serializable {
    //训练序号
    private String trainHistoryId;
    //训练轮次
    private String epoch;
    //准确度
    private String accuracy;

}
