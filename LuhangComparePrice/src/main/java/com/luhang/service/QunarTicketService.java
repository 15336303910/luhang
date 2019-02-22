package com.luhang.service;

import java.nio.channels.NonWritableChannelException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.luhang.bean.OrderRecord;
import com.luhang.bean.RoutingRecord;
import com.luhang.dao.OrderRecordMapper;
import com.luhang.dao.RoutingRecordMapper;
import com.luhang.util.requestparam.SearchReq_Param;
import com.luhang.util.responsedata.AirlineInfo;
import com.luhang.util.responsedata.ResultForOrder;
import com.luhang.util.responsedata.ResultForPay;
import com.luhang.util.responsedata.ResultForSearch;
import com.luhang.util.responsedata.ResultForVerify;
import com.luhang.util.responsedata.Routing;
import com.luhang.util.responsedata.RoutingSearch;
import com.luhang.util.responsedata.Rule;
import com.mysql.fabric.xmlrpc.base.Array;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Service
public class QunarTicketService {

	@Autowired
	RoutingRecordMapper routingRecordMapper;
@Autowired
  OrderRecordMapper orderRecordMapper;
	
	
	
	/*********
	 * 查询票务
	 * @param search_Parame   ����json��
	 * @return
	 */
	public ResultForSearch getTicket(@RequestBody SearchReq_Param search_Parame) {
		ResultForSearch RS = new ResultForSearch();
		if ((search_Parame.getFromCity() == null) || (search_Parame.getToCity() == null)
				|| (search_Parame.getFromDate() == null)) {
			RS.setMsg("必要参数缺失，查询失败！");
			RS.setStatus(1);
			return RS;
		} else {
			String depAirport = search_Parame.getFromCity();
			String arrAirport = search_Parame.getToCity();
			String depdate = search_Parame.getFromDate();// ע�⣺SimpleDateFormat���캯������ʽ��strDate����ʽ�������
			String depdatetime=new String();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");// HH:mm:ss"); //����ʱ��// ���벶���쳣
	//		SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd");
			Date depTimeStart = new Date();
			try {
				depTimeStart = simpleDateFormat.parse(depdate);
				System.out.println(depdatetime);
			} catch (ParseException px) {
				px.printStackTrace();
			}
			Calendar Start=Calendar.getInstance();
			  Start.setTime(depTimeStart);
			  Start.add(Calendar.HOUR,24);
				Date depTimeEnd=new Date();
				depTimeEnd=Start.getTime();
			  
			
			
			
			
			
			
			
			List<RoutingRecord> list = routingRecordMapper.selectByAirportAndDate(depAirport, arrAirport, depTimeStart,depTimeEnd);

			ArrayList<RoutingSearch> routinglist = new ArrayList<RoutingSearch>();
			for (RoutingRecord routingRecord : list) {

				System.out.println(routingRecord.toString());
				
				
				
               Rule searchRule=new Rule();
               searchRule.fromatRuleData(routingRecord);
				AirlineInfo searchAirlineInfo=new AirlineInfo();
				searchAirlineInfo.formatAirlineData(routingRecord);
			//	searchAirlineInfo=RS.formatAirlineData(routingRecord);
				RoutingSearch searchRouting = new RoutingSearch();
				
				ArrayList<AirlineInfo> alist = new ArrayList<AirlineInfo>();
				alist.add(searchAirlineInfo);
				searchRouting.formatSearchRoutingData(routingRecord, searchRule, alist, new ArrayList<AirlineInfo>(), new ArrayList<Integer>());
				
				//searchRouting=RS.formatSearchRoutingData(routingRecord, searchRule,alist , new ArrayList<AirlineInfo>(), new ArrayList<Integer>());
				routinglist.add(searchRouting);
			}

			RS.setRoutings(routinglist);
			return RS;

		}

	}

	
	
	/*****************
	 * 
	 * 价格校验
	 * @param search_Parame
	 * @return
	 */
	public ResultForVerify verifyAirlinePrice  (AirlineInfo airlineInfo)	{
		ResultForVerify responseResult=new ResultForVerify();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("carrier", airlineInfo.getCarrier()) ;       
		map.put("depAirport", airlineInfo.getDepAirport());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm");
		Date depTime=new Date();
		try {
			depTime=simpleDateFormat.parse(airlineInfo.getDepTime());
			System.out.println(depTime);
		} catch (ParseException px) {
			px.printStackTrace();
		}
	
		map.put("depTime", depTime);
		map.put("arrAirport", airlineInfo.getArrAirport());
		Date arrTime=new Date();
		 try {
			arrTime=simpleDateFormat.parse(airlineInfo.getArrTime());
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		map.put("arrTime", arrTime);
		map.put("cabin", airlineInfo.getCabin());
		map.put("aircraftCode", airlineInfo.getAircraftCode());
		map.put("flightNumber", airlineInfo.getFlightNumber());
		
		RoutingRecord checkRouting=routingRecordMapper .selectByAirLineInfo(map);//根据传入参数查询数据库
		
		/******
		 * 对查询结果进行封装
		 */
		 Rule verifyRuleData =new Rule();
		 verifyRuleData.fromatRuleData(checkRouting);
	
		AirlineInfo verifyAirlineData=new AirlineInfo();
		verifyAirlineData.formatAirlineData(checkRouting);
	
		 ArrayList<AirlineInfo> arraylist = new ArrayList<AirlineInfo>();
		 arraylist.add(verifyAirlineData);
		 Routing  veriyRouting=new Routing();
		 veriyRouting.formatRoutingData(checkRouting, arraylist, new ArrayList<AirlineInfo>(), new ArrayList<Integer>());
		 
		 responseResult.setRoutings(veriyRouting);
		 responseResult.setRule(verifyRuleData);
		 if(checkRouting.getMax_seat()>9)
		 {
			 responseResult.setMaxSeats(9);
		 }
		 else{
			 responseResult.setMaxSeats(checkRouting.getMax_seat());
		 }
		
		// responseResult.setSessionId("123");
		 
		// Routing  veriyRouting=responseResult.formatRoutingData(checkRouting, arraylist, new ArrayList<AirlineInfo>(), new ArrayList<Integer>());

		
	
	  
	  
		
		
		
		
		
		return responseResult;
	}
	
	/*****************
	 * 
	 * 生单
	 * @param search_Parame
	 * @return
	 */
	public ResultForOrder generteOrder  ( @RequestBody  Map<String, Object> params)	{
		ResultForOrder responseResult=new ResultForOrder();
	      OrderRecord orderRecord=new OrderRecord();
          JSONObject routing=JSONObject.fromObject(params.get("routing")); 
          JSONArray airInfoJSON=(JSONArray) routing.get("fromSegments");
         ArrayList<AirlineInfo> list = (ArrayList<AirlineInfo> )JSONArray.toCollection(airInfoJSON, AirlineInfo.class);  
        //获取请求中的航班信息
         AirlineInfo checkAirline= list.get(0);
         //将航班信息封装成查询信息
         Map<String, Object> map=new HashMap<String, Object>();
 		map.put("carrier", checkAirline.getCarrier()) ;       
 		map.put("depAirport", checkAirline.getDepAirport());
 		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm");
 		Date depTime=new Date();
 		try {
 			depTime=simpleDateFormat.parse(checkAirline.getDepTime());
 			System.out.println(depTime);
 		} catch (ParseException px) {
 			px.printStackTrace();
 		}
 	
 		map.put("depTime", depTime);
 		map.put("arrAirport", checkAirline.getArrAirport());
 		Date arrTime=new Date();
 		 try {
 			arrTime=simpleDateFormat.parse(checkAirline.getArrTime());
 		} catch (ParseException e) {
 		
 			e.printStackTrace();
 		}
 		map.put("arrTime", arrTime);
 		map.put("cabin", checkAirline.getCabin());
 		map.put("aircraftCode", checkAirline.getAircraftCode());
 		map.put("flightNumber", checkAirline.getFlightNumber());
 		
 		RoutingRecord checkRouting=routingRecordMapper .selectByAirLineInfo(map);//根据传入参数查询数据库
 		
         
         
 		
 		
        
         //获取乘客总人数
         JSONArray passengers=JSONArray.fromObject(params.get("passengers")); 
         orderRecord.setPassenger_total(passengers.size());
         //产生订单号
         String s = UUID.randomUUID().toString(); 
         String orderNum="LuHang"+s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
         orderRecord.setOrder_num(orderNum);
         orderRecord.setCreate_time(new Date());
         orderRecord.setRouting_id(checkRouting.getP_id());
         JSONObject contact=JSONObject.fromObject(params.get("contact"));
         orderRecord.setContact_name(contact.get("name").toString());
         orderRecord.setMobile_num(contact.getString("mobile"));
         //新增一条订单信息
         orderRecordMapper. insertSelective(orderRecord);
         
         
         
         
		
		/******
		 * 对查询结果进行封装
		 */
		
		AirlineInfo orderAirlineData=new AirlineInfo();
		orderAirlineData.formatAirlineData(checkRouting);
	
		 ArrayList<AirlineInfo> arraylist = new ArrayList<AirlineInfo>();
		 arraylist.add(orderAirlineData);
		 Routing  orderRouting=new Routing();
		 orderRouting.formatRoutingData(checkRouting, arraylist, new ArrayList<AirlineInfo>(), new ArrayList<Integer>());
		 
		 responseResult.setRouting(orderRouting);
		 int seats=checkRouting.getMax_seat()-orderRecord.getPassenger_total();
		 checkRouting.setMax_seat(seats);
		 routingRecordMapper.updateSeatsByPrimaryKey(checkRouting);
		 if(seats>9)
		 {
			 responseResult.setMaxSeats(9);
		 }
		 else{
			 responseResult.setMaxSeats(seats);
		 }
		  responseResult.setOrderNo(orderNum);
		  responseResult.setPnrCode("-");
	 
	  
	 
		return responseResult;
	}



	public ResultForPay paycheck(@RequestBody Map<String, Object> params) {
		ResultForPay resultForPay=new ResultForPay();

	     JSONObject routing=JSONObject.fromObject(params.get("routing")); 
         JSONArray airInfoJSON=(JSONArray) routing.get("fromSegments");
        ArrayList<AirlineInfo> list = (ArrayList<AirlineInfo> )JSONArray.toCollection(airInfoJSON, AirlineInfo.class);  
       //获取请求中的航班信息
        AirlineInfo checkAirline= list.get(0);
        //将航班信息封装成查询信息
        Map<String, Object> map=new HashMap<String, Object>();
		map.put("carrier", checkAirline.getCarrier()) ;       
		map.put("depAirport", checkAirline.getDepAirport());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm");
		Date depTime=new Date();
		try {
			depTime=simpleDateFormat.parse(checkAirline.getDepTime());
			System.out.println(depTime);
		} catch (ParseException px) {
			px.printStackTrace();
		}
	
		map.put("depTime", depTime);
		map.put("arrAirport", checkAirline.getArrAirport());
		Date arrTime=new Date();
		 try {
			arrTime=simpleDateFormat.parse(checkAirline.getArrTime());
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		map.put("arrTime", arrTime);
		map.put("cabin", checkAirline.getCabin());
		map.put("aircraftCode", checkAirline.getAircraftCode());
		map.put("flightNumber", checkAirline.getFlightNumber());
		
		RoutingRecord checkRouting=routingRecordMapper .selectByAirLineInfo(map);//根据传入参数查询数据库
		/******
		 * 对查询结果进行封装
		 */
	
		AirlineInfo payCheckAirlineData=new AirlineInfo();
		payCheckAirlineData.formatAirlineData(checkRouting);
		 ArrayList<AirlineInfo> arraylist = new ArrayList<AirlineInfo>();
		 arraylist.add(payCheckAirlineData);
		 Routing  payCheckRouting=new Routing();
		 payCheckRouting.formatRoutingData(checkRouting, arraylist, new ArrayList<AirlineInfo>(), new ArrayList<Integer>());
		 resultForPay.setRouting(payCheckRouting);
	
		return resultForPay;
	}
	
	
	
	
	
}
