package com.luhang.controller;






import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luhang.bean.SaleRecord;
import com.luhang.service.SaleRecordService;
import com.luhang.util.DataDownloadUtil;



@Controller
@RequestMapping("/GetJson")
public class GetJsonToDBController {
@Autowired
private SaleRecordService saleRecordService;
	
	@RequestMapping(value = "/GetJsonToDB" , produces = "application/json; charset=utf-8")
	public void   GetJsonToDB()
	{
	  //新建一个请求参数的json实体类
		 JSONObject inner = new JSONObject();
		//新建时间和日期类用于循环遍历从今天起之后一个月的时间

         inner.put("depCity", "WEH");
         inner.put("arrCity", "SEL");
         inner.put("depDate", "2019-01-25");
         inner.put("getOwnerPrice", "true");

         JSONArray searchCondition = new JSONArray();
         
         searchCondition.put(0, inner);
         //将请求参数放入请求体中
         JSONObject RequsetBody=new JSONObject();
         RequsetBody.put("searchConditions", searchCondition);
         RequsetBody.put("domain", "qun.trade.qunar.com");
         RequsetBody.put("password", "admin");
         RequsetBody.put("realTime", "true");
         String url = "http://xvc.trade.qunar.com/priceCompare/searchList";

         
         
         
         
         org.json.JSONObject rets = null;
         try {

             rets = DataDownloadUtil.jsonPost(url, RequsetBody.toString()); 
         
         } catch (IOException e) {
             e.printStackTrace();
         }

 
           
         JSONObject resultMap = rets.getJSONObject("resultMap");
         JSONObject WEH_SEL_RS=resultMap.getJSONObject("WEH_SEL_2019-01-25").getJSONObject("resultMap");
         
        JSONObject  R_7C8504=WEH_SEL_RS.getJSONObject("7C8504");		       
        System.out.println("7C8504最低价格为:"+R_7C8504.get("lowestTotalPrice").toString());
        JSONObject  R_KE840=WEH_SEL_RS.getJSONObject("KE840");		   
        System.out.println("大韩航空KE840最低价格为:"+R_KE840.get("lowestTotalPrice").toString());

        
        


        //新建一个存储数据的实体类
        SaleRecord getData = new SaleRecord();
        //将http请求返回的json结果设置进该实体类对应的属性
        getData.setOpponent1_price(Integer.parseInt(R_7C8504.get("lowestTotalPrice").toString()));
        getData.setOpponent2_price(Integer.parseInt(R_KE840.get("lowestTotalPrice").toString()));
        getData.setId(1);
        getData.setPlatform_web("去哪儿");
        SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd");
        try {
     	   getData.setDate(sdfs.parse("2019-01-25"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
         //写入数据库
        saleRecordService.updateByDate(getData);
    
  
	   
	}
	
	
	
	
}
