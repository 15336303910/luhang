package com.luhang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luhang.bean.SaleRecord;
import com.luhang.dao.SaleRecordMapper;

@Service
public class SaleRecordService {

	@Autowired
	private SaleRecordMapper saleRecordMapper;
	
	public List<SaleRecord> findAllSaleRecord() {
		return saleRecordMapper.findAllSaleRecord();
	}
	

	 public void  updateByPrimaryKeySelective(SaleRecord record){	 
		int R= saleRecordMapper.updateByPrimaryKeySelective(record);
		if (R==1)
		{
			System.out.println("更新成功！");
		}
	 }
	 public void  updateByDate(SaleRecord record){	 
			int R= saleRecordMapper.updateByDate(record);
			if (R==1)
			{
				System.out.println("更新成功！");
			}
		 }

	public void insertDate(String day) {
		int R= saleRecordMapper.insertDate(day);
		if (R==1)
		{
			System.out.println("插入成功！");
		}
		
	}


	
	
	
	
	
	
	
	
}
