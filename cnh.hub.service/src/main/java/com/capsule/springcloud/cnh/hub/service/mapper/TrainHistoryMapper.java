package com.capsule.springcloud.cnh.hub.service.mapper;

import com.capsule.springcloud.cnh.hub.service.pojo.TrainHistory;
import com.capsule.springcloud.cnh.hub.service.pojo.TrainHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainHistoryMapper {
    int countByExample(TrainHistoryExample example);

    int deleteByExample(TrainHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(TrainHistory record);

    int insertSelective(TrainHistory record);

    List<TrainHistory> selectByExample(TrainHistoryExample example);

    TrainHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TrainHistory record, @Param("example") TrainHistoryExample example);

    int updateByExample(@Param("record") TrainHistory record, @Param("example") TrainHistoryExample example);

    int updateByPrimaryKeySelective(TrainHistory record);

    int updateByPrimaryKey(TrainHistory record);
}
