package com.capsule.springcloud.cnh.hub.service.mapper;

import com.capsule.springcloud.cnh.hub.service.pojo.TrainAccuracy;
import com.capsule.springcloud.cnh.hub.service.pojo.TrainAccuracyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainAccuracyMapper {
    int countByExample(TrainAccuracyExample example);

    int deleteByExample(TrainAccuracyExample example);

    int insert(TrainAccuracy record);

    int insertSelective(TrainAccuracy record);

    List<TrainAccuracy> selectByExample(TrainAccuracyExample example);

    int updateByExampleSelective(@Param("record") TrainAccuracy record, @Param("example") TrainAccuracyExample example);

    int updateByExample(@Param("record") TrainAccuracy record, @Param("example") TrainAccuracyExample example);
}
