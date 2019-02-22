package com.luhang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luhang.bean.PriceRecord;

import com.luhang.dao.PriceRecordMapper;


@Service
public class PriceRecordService {

	@Autowired
	private PriceRecordMapper priceRecordMapper;
	
//	public List<PriceRecord> findAllPriceRecord() {
//		return priceRecordMapper.findAllPriceRecord();
//	}
	
	public List<PriceRecord> findPriceRecord(String platform,String flightnum) {
		return priceRecordMapper.findRecordByPlatformAndFlightnum(platform,flightnum);
	}
	 public void  updateByDateFlight(PriceRecord record){	 
			int R= priceRecordMapper.updateByDateFlight(record);
			if (R==1)
			{
				System.out.println("更新成功！");
			}
		 }

	public void insertBasicInfors(String day,String flightNum) {
		int R= priceRecordMapper.insertBasicInfors(day,flightNum);
		if (R==1)
		{
			System.out.println("插入成功！");
		}
		
	}


	
	
	
	
	
	
	
	
}
