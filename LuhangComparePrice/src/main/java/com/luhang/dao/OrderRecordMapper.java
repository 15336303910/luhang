package com.luhang.dao;

import com.luhang.bean.OrderRecord;

public interface OrderRecordMapper {
    int deleteByPrimaryKey(Integer order_id);

    int insert(OrderRecord record);

    int insertSelective(OrderRecord record);

    OrderRecord selectByPrimaryKey(Integer order_id);

    int updateByPrimaryKeySelective(OrderRecord record);

    int updateByPrimaryKey(OrderRecord record);
}