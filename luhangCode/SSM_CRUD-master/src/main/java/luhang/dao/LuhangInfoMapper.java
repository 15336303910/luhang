package luhang.dao;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import luhang.bean.LuhangInfo;

public interface LuhangInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LuhangInfo record);

    int insertSelective(LuhangInfo record);

    LuhangInfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(LuhangInfo record);

    int updateByPrimaryKey(LuhangInfo record);
}