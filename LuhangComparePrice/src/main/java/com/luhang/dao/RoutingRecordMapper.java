package com.luhang.dao;


import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.luhang.bean.RoutingRecord;

public interface RoutingRecordMapper {
    int deleteByPrimaryKey(Integer p_id);

    int insert(RoutingRecord record);

    int insertSelective(RoutingRecord record);

    RoutingRecord selectByPrimaryKey(Integer p_id);
    List<RoutingRecord>selectByAirportAndDate( @Param("depAirport")String depAirport, @Param("arrAirport")String arrAirport,@Param("depStaTime") Date  depStaTime,@Param("depEndTime") Date  depEndTime);
    RoutingRecord       selectByAirLineInfo( Map<String, Object>  paramMap);
    
    int updateByPrimaryKeySelective(RoutingRecord record);

    int updateByPrimaryKey(RoutingRecord record);
    int     updateSeatsByPrimaryKey(RoutingRecord record);
    
}