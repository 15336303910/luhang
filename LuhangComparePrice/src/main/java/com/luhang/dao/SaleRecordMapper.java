package com.luhang.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.luhang.bean.SaleRecord;

public interface SaleRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SaleRecord record);

    int insertSelective(SaleRecord record);
     int insertDate(@Param(value="date")  String date );
    SaleRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SaleRecord record);
    int updateBySelective(SaleRecord record);
    int updateByDate(SaleRecord record);
    int updateByPrimaryKey(SaleRecord record);
    List <SaleRecord>  findAllSaleRecord ();

	
}