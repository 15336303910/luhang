package com.luhang.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luhang.bean.PriceRecord;
import com.luhang.service.PriceRecordService;
import com.luhang.util.DataDownloadUtil;

@Component("MyJob")
public class MyJob {
	@Autowired
	private PriceRecordService priceRecordService;

	private static int counter = 0;

	public void execute() {

		// 新建时间日期类，分30次执行输出今天之后30天的每一天日期
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());

		if (counter == 30) {
			counter = 0;
		} else {
			counter = counter + 1;
		}
		c.add(Calendar.DATE, +counter);
		Date d = c.getTime();
		String day = format.format(d);

		// 先插入基础数据信息
		priceRecordService.insertBasicInfors(day, "7C8501");
		priceRecordService.insertBasicInfors(day, "7C8502");
		priceRecordService.insertBasicInfors(day, "7C8503");
		priceRecordService.insertBasicInfors(day, "7C8504");
		priceRecordService.insertBasicInfors(day, "LJ101");
		priceRecordService.insertBasicInfors(day, "LJ102");
		priceRecordService.insertBasicInfors(day, "TW607");
		priceRecordService.insertBasicInfors(day, "TW608");
		priceRecordService.insertBasicInfors(day, "TW611");
		priceRecordService.insertBasicInfors(day, "TW612");
		// 新建一个威海到首尔请求参数的json实体类
		JSONObject WEH_SEL = new JSONObject();
		WEH_SEL.put("depCity", "WEH");
		WEH_SEL.put("arrCity", "SEL");
		WEH_SEL.put("depDate", day);
		WEH_SEL.put("getOwnerPrice", "true");
		JSONArray carriers1 = new JSONArray();
		carriers1.put(0, "7C");
		carriers1.put(1, "KE");
		carriers1.put(2, "OZ");
		carriers1.put(3, "MU");
		WEH_SEL.put("carriers", carriers1);
		// 新建一个首尔到威海请求参数的json实体类
		JSONObject SEL_WEH = new JSONObject();
		SEL_WEH.put("depCity", "SEL");
		SEL_WEH.put("arrCity", "WEH");
		SEL_WEH.put("depDate", day);
		SEL_WEH.put("getOwnerPrice", "true");
		JSONArray carriers2 = new JSONArray();
		carriers2.put(0, "7C");
		carriers2.put(1, "KE");
		carriers2.put(2, "OZ");
		carriers2.put(3, "MU");
		carriers2.put(4, "CA");
		SEL_WEH.put("carriers", carriers2);
		// 新建一个上海到济州岛请求参数的json实体类
		JSONObject SHA_CJU = new JSONObject();
		SHA_CJU.put("depCity", "SHA");
		SHA_CJU.put("arrCity", "CJU");
		SHA_CJU.put("depDate", day);
		SHA_CJU.put("getOwnerPrice", "true");
		JSONArray carriers3 = new JSONArray();
		carriers3.put(0, "LJ");
		carriers3.put(1, "9C");
		carriers3.put(2, "HO");
		SHA_CJU.put("carriers", carriers3);
		// 新建一个济州岛到上海请求参数的json实体类
		JSONObject CJU_SHA = new JSONObject();
		CJU_SHA.put("depCity", "CJU");
		CJU_SHA.put("arrCity", "SHA");
		CJU_SHA.put("depDate", day);
		CJU_SHA.put("getOwnerPrice", "true");
		JSONArray carriers4 = new JSONArray();
		carriers4.put(0, "LJ");
		carriers4.put(1, "9C");
		carriers4.put(2, "HO");
		CJU_SHA.put("carriers", carriers4);

		JSONArray searchCondition = new JSONArray();
		searchCondition.put(0, WEH_SEL);
		searchCondition.put(1, SEL_WEH);
		searchCondition.put(2, SHA_CJU);
		searchCondition.put(3, CJU_SHA);
		// 将请求参数放入请求体中
		JSONObject RequsetBody = new JSONObject();
		RequsetBody.put("searchConditions", searchCondition);
		RequsetBody.put("domain", "qun.trade.qunar.com");
		RequsetBody.put("password", "admin");
		RequsetBody.put("realTime", "true");
		String url = "http://xvc.trade.qunar.com/priceCompare/searchList";
		// 发送请求，查询报价
		org.json.JSONObject rets = null;
		
		
		try {

			rets = DataDownloadUtil.jsonPost(url, RequsetBody.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 新建一个青岛到首尔请求参数的json实体类
		JSONObject TAO_SEL = new JSONObject();
		TAO_SEL.put("depCity", "TAO");
		TAO_SEL.put("arrCity", "SEL");
		TAO_SEL.put("depDate", day);
		TAO_SEL.put("getOwnerPrice", "true");
		JSONArray carriers01 = new JSONArray();
		carriers01.put(0, "TW");
		carriers01.put(1, "7C");
		TAO_SEL.put("carriers", carriers01);
		// 新建一个首尔到青岛请求参数的json实体类
		JSONObject SEL_TAO = new JSONObject();
		SEL_TAO.put("depCity", "SEL");
		SEL_TAO.put("arrCity", "TAO");
		SEL_TAO.put("depDate", day);
		SEL_TAO.put("getOwnerPrice", "true");
		JSONArray carriers02 = new JSONArray();
		carriers02.put(0, "TW");
		carriers02.put(1, "7C");
		SEL_TAO.put("carriers", carriers02);
		// 新建一个温州到首尔请求参数的json实体类
		JSONObject WNZ_SEL = new JSONObject();
		WNZ_SEL.put("depCity", "WNZ");
		WNZ_SEL.put("arrCity", "SEL");
		WNZ_SEL.put("depDate", day);
		WNZ_SEL.put("getOwnerPrice", "true");
		JSONArray carriers03 = new JSONArray();
		carriers03.put(0, "TW");
		carriers03.put(1, "CA");
		WNZ_SEL.put("carriers", carriers03);
		// 新建一个首尔到温州请求参数的json实体类
		JSONObject SEL_WNZ = new JSONObject();
		SEL_WNZ.put("depCity", "SEL");
		SEL_WNZ.put("arrCity", "WNZ");
		SEL_WNZ.put("depDate", day);
		SEL_WNZ.put("getOwnerPrice", "true");
		JSONArray carriers04 = new JSONArray();
		carriers04.put(0, "TW");
		carriers04.put(1, "CA");
	
		SEL_WNZ.put("carriers", carriers04);

		JSONArray searchCondition2 = new JSONArray();
		searchCondition2.put(0, TAO_SEL);
		searchCondition2.put(1, SEL_TAO);
		searchCondition2.put(2, WNZ_SEL);
		searchCondition2.put(3, SEL_WNZ);
		// 将请求参数放入请求体中
		
		RequsetBody.put("searchConditions", searchCondition2);
		RequsetBody.put("domain", "qun.trade.qunar.com");
		RequsetBody.put("password", "admin");
		RequsetBody.put("realTime", "true");
		
		// 发送请求，查询报价
		org.json.JSONObject rets2 = null;
		
		
		try {

			rets2 = DataDownloadUtil.jsonPost(url, RequsetBody.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		// 获取查询结果进行分析
		JSONObject resultMap = new JSONObject();
		resultMap = rets.getJSONObject("resultMap");
		System.out.println(resultMap.toString());
		// 解析威海到首尔的航班报价数据
		String W_S_Result = "WEH_SEL_" + day + "_[7C, KE, OZ, MU]";
		JSONObject WEH_SEL_RS = new JSONObject();
		try {
			WEH_SEL_RS = resultMap.getJSONObject(W_S_Result).getJSONObject("resultMap");
		} catch (Exception e) {
			System.out.println("WEH_SEL_" + day + "_[7C, KE, OZ, MU]  查询结果为空！");
		}
	

		/*****
		 * 7C8504的航班价格，对手一大韩航空KE840的价格，对手二韩亚航空OZ310的价格
		 */
		    int Lowest_7C8504=0;
		try {
			JSONObject R_7C8504 = WEH_SEL_RS.getJSONObject("7C8504");
			Lowest_7C8504=R_7C8504.getInt("lowestTotalPrice");
			System.out.println("7C8504最低价格为:" + R_7C8504.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_7C8504=0;
			System.out.println("7C8504的最低价格未查询到！");
		}
		     int Lowest_KE840=0;
		try {
			JSONObject R_KE840 = WEH_SEL_RS.getJSONObject("KE840");
			Lowest_KE840=R_KE840.getInt("lowestTotalPrice");
			System.out.println("大韩航空KE840最低价格为:" + R_KE840.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_KE840=0;
			System.out.println("大韩航空KE840的最低价格未查询到！");
		}
           int Lowest_OZ310=0;
		try {
			JSONObject R_OZ310 = WEH_SEL_RS.getJSONObject("OZ310");
			Lowest_OZ310=R_OZ310.getInt("lowestTotalPrice");
			System.out.println("韩亚航空OZ310的最低价格为:" + R_OZ310.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_OZ310=0;
			System.out.println("韩亚航空OZ310的最低价格未查询到！");
		}

		/*****
		 * 7C8502的航班价格，对手一大韩航空KE840的价格，对手二韩亚航空OZ310的价格
		 */
		  int  Lowest_7C8502=0;
		try {
			JSONObject R_7C8502 = WEH_SEL_RS.getJSONObject("7C8502");
			Lowest_7C8502=R_7C8502.getInt("lowestTotalPrice");
			System.out.println("7C8502最低价格为:" + R_7C8502.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_7C8502=0;
			System.out.println("7C8502的最低价格未查询到！");
		}
		   int Lowest_MU2017=0;
		try {
			JSONObject R_MU2017 = WEH_SEL_RS.getJSONObject("MU2017");
			Lowest_MU2017=R_MU2017.getInt("lowestTotalPrice");
			System.out.println("东航MU2017最低价格为:" + R_MU2017.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_MU2017=0;
			System.out.println("东航MU2017的最低价格未查询到！");
		}
 
		try {
			JSONObject R_OZ310 = WEH_SEL_RS.getJSONObject("OZ310");
		
			System.out.println("韩亚航空OZ310的最低价格为:" + R_OZ310.get("lowestTotalPrice").toString());

		} catch (Exception e) {
			
			System.out.println("韩亚航空OZ310的最低价格未查询到！");
		}

		// 解析首尔到威海的航班报价数据

		String S_W_Result = "SEL_WEH_" + day + "_[7C, KE, OZ, MU, CA]";
		JSONObject SEL_WEH_RS = new JSONObject();
		try {
			SEL_WEH_RS = resultMap.getJSONObject(S_W_Result).getJSONObject("resultMap");
		} catch (Exception e) {
			System.out.println("SEL_WEH_" + day + "_[7C, KE, OZ, MU, CA]  查询结果为空！");
		}
	

		/*****
		 * 7C8501的航班价格，对手一韩亚航空OZ310的价格，对手二国航CA5008的价格
		 */
		int Lowest_7C8501=0;
		try {
			JSONObject R_7C8501 = SEL_WEH_RS.getJSONObject("7C8501");
			Lowest_7C8501=R_7C8501.getInt("lowestTotalPrice");
			System.out.println("7C8501最低价格为:" + R_7C8501.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_7C8501= 0;
			System.out.println("7C8501的最低价格未查询到！");
		}
		int Lowest_OZ309=0;
		try {
			JSONObject R_OZ309 = SEL_WEH_RS.getJSONObject("OZ309");
			Lowest_OZ309=R_OZ309.getInt("lowestTotalPrice");
			System.out.println("韩亚航空OZ309最低价格为:" + R_OZ309.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_OZ309=0;
			System.out.println("韩亚航空OZ309的最低价格未查询到！");
		}
		int Lowest_CA5008=0;
		try {
			JSONObject R_CA5008 = SEL_WEH_RS.getJSONObject("CA5008");
			Lowest_CA5008=R_CA5008.getInt("lowestTotalPrice");
			System.out.println("国航CA5008的最低价格为:" + R_CA5008.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_CA5008=0;
			System.out.println("国航CA5008的最低价格未查询到！");
		}

		/*****
		 * 7C8503的航班价格，对手一大韩航空KE839的价格，对手二东航MU2018的价格
		 */
               int Lowest_7C8503=0;
		try {
			JSONObject R_7C8503 = SEL_WEH_RS.getJSONObject("7C8503");
			Lowest_7C8503=R_7C8503.getInt("lowestTotalPrice");
			System.out.println("7C8503最低价格为:" + R_7C8503.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_7C8503=0;
			System.out.println("7C8503的最低价格未查询到！");
		}
          int Lowest_KE839=0;
		try {
			JSONObject R_KE839 = SEL_WEH_RS.getJSONObject("KE839");
			Lowest_KE839=R_KE839.getInt("lowestTotalPrice");
			System.out.println("大韩航空KE839最低价格为:" + R_KE839.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_KE839=0;
			System.out.println("大韩航空KE839的最低价格未查询到！");
		}
		 int  Lowest_MU2018=0;
		try {
			JSONObject R_MU2018 = SEL_WEH_RS.getJSONObject("MU2018");
			Lowest_MU2018=R_MU2018.getInt("lowestTotalPrice");
			System.out.println("东航MU2018的最低价格为:" + R_MU2018.getString("lowestTotalPrice"));

		} catch (Exception e) {
			Lowest_MU2018=0;
			System.out.println("东航MU2018的最低价格未查询到！");
		}

		// 解析上海到济州岛的航班报价数据

				String S_J_Result = "SHA_CJU_" + day + "_[LJ, 9C, HO]";
				JSONObject SHA_CJU_RS = new JSONObject();
				try {
					SHA_CJU_RS = resultMap.getJSONObject(S_J_Result).getJSONObject("resultMap");
					
				} catch (Exception e) {
					System.out.println( "SHA_CJU_" + day + "_[LJ, 9C, HO] 查询结果为空！");
				}
				
   
				/*****
				 * LJ102的航班价格，对手一春秋航空9C8569的价格，对手二吉祥HO1375的价格
				 */
				
				   int Lowest_LJ102=0;
				try {
					JSONObject R_LJ102 = SHA_CJU_RS.getJSONObject("LJ102");
					Lowest_LJ102=R_LJ102.getInt("lowestTotalPrice");
					System.out.println("LJ102最低价格为:" + R_LJ102.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_LJ102=0;
					System.out.println("LJ102的最低价格未查询到！");
				}
				int  Lowest_9C8569=0;
				try {
					JSONObject R_9C8569 = SHA_CJU_RS.getJSONObject("9C8569");
					Lowest_9C8569=R_9C8569.getInt("lowestTotalPrice");
					System.out.println("春秋航空9C8569最低价格为:" + R_9C8569.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_9C8569=0;
					System.out.println("春秋航空9C8569的最低价格未查询到！");
				}
                       int Lowest_HO1375=0;
				try {
					JSONObject R_HO1375 = SHA_CJU_RS.getJSONObject("HO1375");
					Lowest_HO1375=R_HO1375.getInt("lowestTotalPrice");
					System.out.println("吉祥航空HO1375的最低价格为:" + R_HO1375.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_HO1375=0;
					System.out.println("吉祥航空HO1375的最低价格未查询到！");
				}
		
				// 解析济州岛到上海的航班报价数据

				String J_S_Result = "CJU_SHA_" + day + "_[LJ, 9C, HO]";
				JSONObject CJU_SHA_RS = new JSONObject();
				try {
					CJU_SHA_RS = resultMap.getJSONObject(J_S_Result).getJSONObject("resultMap");
				} catch (Exception e) {
					System.out.println("CJU_SHA_" + day + "_[LJ, 9C, HO]查询结果为空！");
				}
			
   
				/*****
				 * LJ101的航班价格，对手一春秋航空9C8568的价格，对手二吉祥HO1378的价格
				 */
				int Lowest_LJ101=0;
				try {
					JSONObject R_LJ101 = CJU_SHA_RS.getJSONObject("LJ101");
					Lowest_LJ101=R_LJ101.getInt("lowestTotalPrice");
					System.out.println("LJ101最低价格为:" + R_LJ101.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_LJ101=0;
					System.out.println("LJ101的最低价格未查询到！");
				}
				   int Lowest_9C8568 =0;
				try {
					JSONObject R_9C8568 = CJU_SHA_RS.getJSONObject("9C8568");
					Lowest_9C8568=R_9C8568.getInt("lowestTotalPrice");
					System.out.println("春秋航空9C8568最低价格为:" + R_9C8568.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_9C8568=0;
					System.out.println("春秋航空9C8568的最低价格未查询到！");
				}
                 int Lowest_HO1378=0;
				try {
					JSONObject R_HO1378 = CJU_SHA_RS.getJSONObject("HO1378");
					Lowest_HO1378=R_HO1378.getInt("lowestTotalPrice");
					System.out.println("吉祥航空HO1378的最低价格为:" + R_HO1378.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_HO1378=0;
					System.out.println("吉祥航空HO1378的最低价格未查询到！");
				}
		
				
				
				
				
				
				
				
				
				
				
				
				
				// 获取查询结果进行分析
				JSONObject resultMap2 = new JSONObject();
				resultMap2 = rets2.getJSONObject("resultMap");
				System.out.println(resultMap2.toString());
				// 解析青岛到首尔的航班报价数据
				String Q_S_Result = "TAO_SEL_" + day + "_[TW, 7C]";
				JSONObject TAO_SEL_RS = new JSONObject();
				try {
					TAO_SEL_RS = resultMap2.getJSONObject(Q_S_Result).getJSONObject("resultMap");
				} catch (Exception e) {
					System.out.println("TAO_SEL_" + day + "_[TW, 7C]  查询结果为空！");
				}
			

				/*****
				 * TW608的航班价格，对手一济州航空7C8402的价格
				 */
				    int Lowest_TW608=0;
				try {
					JSONObject R_TW608 = TAO_SEL_RS.getJSONObject("TW608");
					Lowest_TW608=R_TW608.getInt("lowestTotalPrice");
					System.out.println("TW608最低价格为:" + R_TW608.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_TW608=0;
					System.out.println("TW608的最低价格未查询到！");
				}
				     int Lowest_7C8402=0;
				try {
					JSONObject R_7C8402 = TAO_SEL_RS.getJSONObject("7C8402");
					Lowest_7C8402=R_7C8402.getInt("lowestTotalPrice");
					System.out.println("济州航空7C8402最低价格为:" + R_7C8402.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_7C8402=0;
					System.out.println("济州航空7C8402的最低价格未查询到！");
				}
		           
				// 解析首尔到青岛的航班报价数据
				String S_Q_Result = "SEL_TAO_" + day + "_[TW, 7C]";
				JSONObject SEL_TAO_RS = new JSONObject();
				try {
					SEL_TAO_RS = resultMap2.getJSONObject(S_Q_Result).getJSONObject("resultMap");
				} catch (Exception e) {
					System.out.println("SEL_TAO_" + day + "_[TW, 7C]  查询结果为空！");
				}
			

				/*****
				 * TW607的航班价格，对手一济州航空7C8401的价格
				 */
				    int Lowest_TW607=0;
				try {
					JSONObject R_TW607 = SEL_TAO_RS.getJSONObject("TW607");
					Lowest_TW607=R_TW607.getInt("lowestTotalPrice");
					System.out.println("TW607最低价格为:" + R_TW607.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_TW607=0;
					System.out.println("TW607的最低价格未查询到！");
				}
				     int Lowest_7C8401=0;
				try {
					JSONObject R_7C8401 = SEL_TAO_RS.getJSONObject("7C8401");
					Lowest_7C8401=R_7C8401.getInt("lowestTotalPrice");
					System.out.println("济州航空7C8401最低价格为:" + R_7C8401.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_7C8401=0;
					System.out.println("济州航空7C8401的最低价格未查询到！");
				}
		       
				// 解析温州到首尔的航班报价数据
				String WNZ_S_Result = "WNZ_SEL_" + day + "_[TW, CA]";
				JSONObject WNZ_SEL_RS = new JSONObject();
				try {
					WNZ_SEL_RS = resultMap2.getJSONObject(WNZ_S_Result).getJSONObject("resultMap");
				} catch (Exception e) {
					System.out.println("WNZ_SEL_" + day + "_[TW, CA]  查询结果为空！");
				}
			

				/*****
				 * TW612的航班价格，对手一中国国航CA739的价格
				 */
				    int Lowest_TW612=0;
				try {
					JSONObject R_TW612 = WNZ_SEL_RS.getJSONObject("TW612");
					Lowest_TW612 =R_TW612 .getInt("lowestTotalPrice");
					System.out.println("TW612 最低价格为:" + R_TW612 .getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_TW612 =0;
					System.out.println("TW612 的最低价格未查询到！");
				}
				     int Lowest_CA739=0;
				try {
					JSONObject R_CA739 = WNZ_SEL_RS.getJSONObject("CA739");
					Lowest_CA739=R_CA739.getInt("lowestTotalPrice");
					System.out.println("中国国航CA739最低价格为:" + R_CA739.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_CA739=0;
					System.out.println("中国国航CA739的最低价格未查询到！");
				}
				
				// 解析首尔到温州的航班报价数据
				String S_WNZ_Result = "SEL_WNZ_" + day + "_[TW, CA]";
				JSONObject SEL_WNZ_RS = new JSONObject();
				try {
					SEL_WNZ_RS = resultMap2.getJSONObject(S_WNZ_Result).getJSONObject("resultMap");
				} catch (Exception e) {
					System.out.println("SEL_WNZ_" + day + "_[TW, CA]  查询结果为空！");
				}
			

				/*****
				 * TW611的航班价格，对手一中国国航CA740的价格
				 */
				    int Lowest_TW611=0;
				try {
					JSONObject R_TW611 = SEL_WNZ_RS.getJSONObject("TW611");
					Lowest_TW611 =R_TW611 .getInt("lowestTotalPrice");
					System.out.println("TW611 最低价格为:" + R_TW611 .getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_TW611 =0;
					System.out.println("TW611 的最低价格未查询到！");
				}
				     int Lowest_CA740=0;
				try {
					JSONObject R_CA740 = SEL_WNZ_RS.getJSONObject("CA740");
					Lowest_CA740=R_CA740.getInt("lowestTotalPrice");
					System.out.println("中国国航CA740最低价格为:" + R_CA740.getString("lowestTotalPrice"));

				} catch (Exception e) {
					Lowest_CA740=0;
					System.out.println("中国国航CA740的最低价格未查询到！");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		/****
		 * 将查询出的数据存入数据库中
		 */
		 //新建一个存储数据的实体类
		 PriceRecord Data_7C8501 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_7C8501.setSameairline_opp(Lowest_7C8501);
		 Data_7C8501.setDiffairline_opp1(Lowest_OZ309);
		 Data_7C8501.setDiffairline_opp2(Lowest_CA5008);
		 Data_7C8501.setPlatform_web("去哪儿");
		 Data_7C8501.setFlight_num("7C8501");
		 SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd");
		 try {
			 Data_7C8501.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 }
		 //新建一个存储数据的实体类
		 PriceRecord Data_7C8502 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_7C8502.setSameairline_opp(Lowest_7C8502);
		 Data_7C8502.setDiffairline_opp1(Lowest_MU2017);
		 Data_7C8502.setDiffairline_opp2(Lowest_OZ310);
		 Data_7C8502.setPlatform_web("去哪儿");
		 Data_7C8502.setFlight_num("7C8502");
		 try {
			 Data_7C8502.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 }
		 
		 //新建一个存储数据的实体类
		 PriceRecord Data_7C8503 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_7C8503.setSameairline_opp(Lowest_7C8503);
		 Data_7C8503.setDiffairline_opp1(Lowest_KE839);
		 Data_7C8503.setDiffairline_opp2(Lowest_MU2018);
		 Data_7C8503.setPlatform_web("去哪儿");
		 Data_7C8503.setFlight_num("7C8503");
		 try {
			 Data_7C8503.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 } 
		 //新建一个存储数据的实体类
		 PriceRecord Data_7C8504 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_7C8504.setSameairline_opp(Lowest_7C8504);
		 Data_7C8504.setDiffairline_opp1(Lowest_KE840);
		 Data_7C8504.setDiffairline_opp2(Lowest_OZ310);
		 Data_7C8504.setPlatform_web("去哪儿");
		 Data_7C8504.setFlight_num("7C8504");
		 try {
			 Data_7C8504.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 } 
		 //新建一个存储数据的实体类
		 PriceRecord Data_LJ101 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_LJ101.setSameairline_opp(Lowest_LJ101);
		 Data_LJ101.setDiffairline_opp1(Lowest_9C8568);
		 Data_LJ101.setDiffairline_opp2(Lowest_HO1378);
		 Data_LJ101.setPlatform_web("去哪儿");
		 Data_LJ101.setFlight_num("LJ101");
		 try {
			 Data_LJ101.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 } 
		 //新建一个存储数据的实体类
		 PriceRecord Data_LJ102 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_LJ102.setSameairline_opp(Lowest_LJ102);
		 Data_LJ102.setDiffairline_opp1(Lowest_9C8569);
		 Data_LJ102.setDiffairline_opp2(Lowest_HO1375);
		 Data_LJ102.setPlatform_web("去哪儿");
		 Data_LJ102.setFlight_num("LJ102");
		 try {
			 Data_LJ102.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 } 
		 //新建一个存储数据的实体类
		 PriceRecord Data_TW607 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_TW607.setSameairline_opp(Lowest_TW607);
		 Data_TW607.setDiffairline_opp1(Lowest_7C8401);
		 Data_TW607.setPlatform_web("去哪儿");
		 Data_TW607.setFlight_num("TW607");
		 try {
			 Data_TW607.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 } 
		 //新建一个存储数据的实体类
		 PriceRecord Data_TW608 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_TW608.setSameairline_opp(Lowest_TW608);
		 Data_TW608.setDiffairline_opp1(Lowest_7C8402);
		 Data_TW608.setPlatform_web("去哪儿");
		 Data_TW608.setFlight_num("TW608");
		 try {
			 Data_TW608.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 } 
		 //新建一个存储数据的实体类
		 PriceRecord Data_TW611 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_TW611.setSameairline_opp(Lowest_TW611);
		 Data_TW611.setDiffairline_opp1(Lowest_CA740);
		 Data_TW611.setPlatform_web("去哪儿");
		 Data_TW611.setFlight_num("TW611");
		 try {
			 Data_TW611.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 }  
		 //新建一个存储数据的实体类
		 PriceRecord Data_TW612 = new PriceRecord();
		 //将http请求返回的json结果设置进该实体类对应的属性
		 Data_TW612.setSameairline_opp(Lowest_TW612);
		 Data_TW612.setDiffairline_opp1(Lowest_CA739);
		 Data_TW612.setPlatform_web("去哪儿");
		 Data_TW612.setFlight_num("TW612");
		 try {
			 Data_TW612.setDate(sdfs.parse(day));
		 } catch (ParseException e) {
		 e.printStackTrace();
		 }  
		 //写入数据库
		 priceRecordService.updateByDateFlight(Data_7C8501);
		 priceRecordService.updateByDateFlight(Data_7C8502);
		 priceRecordService.updateByDateFlight(Data_7C8503);
		 priceRecordService.updateByDateFlight(Data_7C8504);
		 priceRecordService.updateByDateFlight(Data_LJ101);
		 priceRecordService.updateByDateFlight(Data_LJ102);
		 priceRecordService.updateByDateFlight(Data_TW607);
		 priceRecordService.updateByDateFlight(Data_TW608);
		 priceRecordService.updateByDateFlight(Data_TW611);
		 priceRecordService.updateByDateFlight(Data_TW612);
		 
		 
		 
		System.out.println("从今天起第" + counter + "天是：" + day);
	}

}
