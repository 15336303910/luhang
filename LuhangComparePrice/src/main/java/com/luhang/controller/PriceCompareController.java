package com.luhang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luhang.bean.PriceRecord;
import com.luhang.bean.SaleRecord;
import com.luhang.service.PriceRecordService;
import com.luhang.util.DataResponse;

@Controller
@RequestMapping("/QunaerPriceCompare")
@ResponseBody
public class PriceCompareController {

	@Autowired 
	 private PriceRecordService priceRecordService;
	@RequestMapping("/display7C8501" )
	@ResponseBody
	public  DataResponse<PriceRecord> display7C8501() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","7C8501");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
	@RequestMapping("/display7C8502" )
	@ResponseBody
	public  DataResponse<PriceRecord> display7C8502() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","7C8502");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
	@RequestMapping("/display7C8503" )
	@ResponseBody
	public  DataResponse<PriceRecord> display7C8503() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","7C8503");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
	@RequestMapping("/display7C8504" )
	@ResponseBody
	public  DataResponse<PriceRecord> display7C8504() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","7C8504");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
	@RequestMapping("/displayLJ101" )
	@ResponseBody
	public  DataResponse<PriceRecord> displayLJ101() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","LJ101");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
	@RequestMapping("/displayLJ102" )
	@ResponseBody
	public  DataResponse<PriceRecord> displayLJ102() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","LJ102");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
	@RequestMapping("/displayTW607" )
	@ResponseBody
	public  DataResponse<PriceRecord> displayTW607() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","TW607");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
	@RequestMapping("/displayTW608" )
	@ResponseBody
	public  DataResponse<PriceRecord> displayTW608() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","TW608");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
	@RequestMapping("/displayTW611" )
	@ResponseBody
	public  DataResponse<PriceRecord> displayTW611() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","TW611");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
	@RequestMapping("/displayTW612" )
	@ResponseBody
	public  DataResponse<PriceRecord> displayTW612() {

		DataResponse<PriceRecord> DR_relust=new DataResponse<PriceRecord>();
    		List<PriceRecord> list=priceRecordService.findPriceRecord("去哪儿","TW612");
    		
    		System.out.println(list.toString());
    		DR_relust.setPage("1");
    		DR_relust.setRows(list);
    		DR_relust.setTotal("1");
    		DR_relust.setRecords("2");
   
    		
    	    return DR_relust;
	}
}
