package com.capsule.springcloud.cnh.hub.service.mapper;

import com.capsule.springcloud.cnh.hub.service.pojo.TrainModel;
import com.capsule.springcloud.cnh.hub.service.pojo.TrainModelExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository(value = "TrainModelMapper")
public interface TrainModelMapper {
    int countByExample(TrainModelExample example);

    int deleteByExample(TrainModelExample example);

    int deleteByPrimaryKey(String id);

    int insert(TrainModel record);

    int insertSelective(TrainModel record);

    List<TrainModel> selectByExample(TrainModelExample example);

    List<TrainModel> selectAll();
    TrainModel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TrainModel record, @Param("example") TrainModelExample example);

    int updateByExample(@Param("record") TrainModel record, @Param("example") TrainModelExample example);

    int updateByPrimaryKeySelective(TrainModel record);

    int updateByPrimaryKey(TrainModel record);
}
