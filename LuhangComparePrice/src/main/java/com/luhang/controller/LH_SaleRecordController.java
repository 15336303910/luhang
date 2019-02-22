package com.luhang.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.luhang.bean.SaleRecord;
import com.luhang.service.SaleRecordService;
import com.luhang.util.DataResponse;

@Controller
@RequestMapping("/LH_SaleRecord")
@ResponseBody
public class LH_SaleRecordController {

	@Autowired
	private SaleRecordService saleRecordService;
	
	
	@RequestMapping("/findAll" )
	public  List<SaleRecord> findAllSaleRecord() {
	
    return  saleRecordService.findAllSaleRecord();
	}
	
	@RequestMapping("/displayAll" )
	@ResponseBody
	public  DataResponse<SaleRecord> displayAllSaleRecord() {

		DataResponse<SaleRecord> DR_relust=new DataResponse<SaleRecord>();
    		List<SaleRecord> list=saleRecordService.findAllSaleRecord();
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}

	

	
	
	
	
}
