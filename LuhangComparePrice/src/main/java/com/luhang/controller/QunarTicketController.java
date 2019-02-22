package com.luhang.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.luhang.service.QunarTicketService;

import com.luhang.util.requestparam.SearchReq_Param;
import com.luhang.util.responsedata.AirlineInfo;
import com.luhang.util.responsedata.ResultForOrder;
import com.luhang.util.responsedata.ResultForPay;
import com.luhang.util.responsedata.ResultForSearch;
import com.luhang.util.responsedata.ResultForVerify;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;





@Controller
@RequestMapping("/qunar")

public class QunarTicketController {
@Autowired
QunarTicketService qunarTicketService;
	
	//去哪儿搜索接口对接入口
	
@PostMapping("/search")
@ResponseBody
	public  ResultForSearch searchTicket(@RequestBody  SearchReq_Param search_Param){
		ResultForSearch responseResult=new ResultForSearch();

		try {		
			responseResult = qunarTicketService.getTicket( search_Param);	
			
			return responseResult;
		} catch (Exception ex) {
			ex.printStackTrace();
			responseResult.setStatus(1);
			responseResult.setMsg("ERROR MESSAGE");
		}
		
		return responseResult;
				
				
	}
	//去哪儿价格校验接口对接入口
@PostMapping("/verify")
	@ResponseBody
	public  ResultForVerify checkPrice( HttpServletRequest request,  @RequestBody  Map<String, Object> params){
		ResultForVerify responseResult=new ResultForVerify();
		                JSONObject jsonObject=JSONObject.fromObject(params.get("routing")); // ������ת��json�ַ���
		                JSONArray airInfoJSON=(JSONArray) jsonObject.get("fromSegments");
		               ArrayList<AirlineInfo> list = (ArrayList<AirlineInfo> )JSONArray.toCollection(airInfoJSON, AirlineInfo.class);  
		               AirlineInfo checkAirline= list.get(0);
		           	try {		
		    			responseResult = qunarTicketService.verifyAirlinePrice( checkAirline);	
		    			responseResult.setStatus(0);
		    			responseResult.setMsg("Success");
		    			String sessionId=request.getSession().getId();
		    			responseResult.setSessionId(sessionId);
		    		} catch (Exception ex) {
		    			ex.printStackTrace();
		    			responseResult.setStatus(505);
		    			responseResult.setMsg("ERROR MESSAGE");
		    		}
		    		         
		             return responseResult;
				
				
	}	
	//去哪儿生成订单接口对接入口
	
@PostMapping("/order")
	@ResponseBody
	@Encrypt
	public  ResultForOrder orderGenerator( HttpServletRequest request, 	@Encrypt @RequestBody  Map<String, Object> params){
		
		              ResultForOrder responseResult=new ResultForOrder();

		           	try {		
		    		
		    			 String sessionID=params.get("sessionId").toString();
		    		if(sessionID !=""&& sessionID !=null )
		    		{
		    			
			    		responseResult = qunarTicketService.generteOrder(params);	
			    		responseResult.setSessionId(sessionID);
		    			responseResult.setStatus(0);
		    			responseResult.setMsg("Success");
		    		}
		    	    
		 	
		    		
		    		} catch (Exception ex) {
		    			ex.printStackTrace();
		    			responseResult.setStatus(999);
		    			responseResult.setMsg("ERROR MESSAGE");
		    		}
		    		         
		             return responseResult;
				
				
	}	
	//去哪儿支付校验接口对接入口

@PostMapping("/pay")
	@ResponseBody
	@Encrypt
	public  ResultForPay payCheck( HttpServletRequest request, @Encrypt @RequestBody  Map<String, Object> params){
		
		              ResultForPay responseResult=new ResultForPay();

		           	try {		
		    		
		    		
		    		 String sessionID=params.get("sessionId").toString();
		    		String orderNo=params.get("orderNo").toString();
		    		String pnrCode=params.get("pnrCode").toString();
		    	
		    		if(sessionID !=""&& sessionID !=null && orderNo !=""&& orderNo !=null && pnrCode  !=""&&pnrCode !=null)
		    		{
		    		
		    			responseResult = qunarTicketService.paycheck(params);	
		    			responseResult.setStatus(0);
		    			responseResult.setMsg("Success");
		    			responseResult.setSessionId(sessionID);
		    			responseResult.setOrderNo(orderNo);
		    			responseResult.setPnrCode(pnrCode);
		    		}
		 
		    		
		    		
		    	
		    		} catch (Exception ex) {
		    			ex.printStackTrace();
		    			responseResult.setStatus(-1);
		    			responseResult.setMsg("ERROR MESSAGE");
		    		}
		    		         
		             return responseResult;
				
				
	}	
	
	
	
	
	
	
	
	
}
