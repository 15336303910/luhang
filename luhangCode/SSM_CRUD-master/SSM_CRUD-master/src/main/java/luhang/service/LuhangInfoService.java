package luhang.service;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import luhang.bean.LuhangInfo;
import luhang.dao.LuhangInfoMapper;

@Service
public class LuhangInfoService {
	@Autowired
LuhangInfoMapper luhangInfoMapper;
	
	
	public  List<LuhangInfo> getLuhangInfos() {
	
		
		List<LuhangInfo>  list=new ArrayList<LuhangInfo>();
		list.add(luhangInfoMapper.selectByPrimaryKey(1));
		return list;
	}

}
