package com.luhang.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.luhang.bean.PriceRecord;

public interface PriceRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PriceRecord record);

    int insertSelective(PriceRecord record);
    
    int  insertBasicInfors (@Param(value="date")  String date ,@Param(value="flightNum")  String flightNum);

    PriceRecord selectByPrimaryKey(Integer id);

    List<PriceRecord> findRecordByPlatformAndFlightnum(@Param(value="platform")  String platform ,@Param(value="flightNum")  String flightNum);
    
    List<PriceRecord> findAllPriceRecord();
    
    int updateByPrimaryKeySelective(PriceRecord record);

    int updateByPrimaryKey(PriceRecord record);
    
    int updateByDateFlight(PriceRecord record);
}