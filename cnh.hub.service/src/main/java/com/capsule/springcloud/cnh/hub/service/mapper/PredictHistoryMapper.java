package com.capsule.springcloud.cnh.hub.service.mapper;

import com.capsule.springcloud.cnh.hub.service.pojo.PredictHistory;
import com.capsule.springcloud.cnh.hub.service.pojo.PredictHistoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository(value = "PredictHistoryMapper")
public interface PredictHistoryMapper {
    int countByExample(PredictHistoryExample example);

    int deleteByExample(PredictHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(PredictHistory record);

    int insertSelective(PredictHistory record);

    List<PredictHistory> selectByExample(PredictHistoryExample example);
    List<PredictHistory> selectAll();

    PredictHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PredictHistory record, @Param("example") PredictHistoryExample example);

    int updateByExample(@Param("record") PredictHistory record, @Param("example") PredictHistoryExample example);

    int updateByPrimaryKeySelective(PredictHistory record);

    int updateByPrimaryKey(PredictHistory record);
}
