package com.luhang.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;








public class DataDownloadUtil {

	public static JSONObject jsonPost(String urls, String text) throws IOException {
	    //创建httpclient
	    CloseableHttpClient httpClient = HttpClients.createDefault(); 
	    //创建httppost
	    HttpPost httpPost = new HttpPost(urls);
	    //设置httppost的内容格式
	    httpPost.setHeader("Content-Type", "application/json");
	   //设置参数到http请求对象中
	    httpPost.setEntity(new StringEntity(text));
	   //执行请求操作并拿到请求结果
	    CloseableHttpResponse response = httpClient.execute(httpPost);
	  //获取结果实体
	    HttpEntity entity = response.getEntity();
	    //看返回状态是否正常
	    int statue = response.getStatusLine().getStatusCode();
	    if (statue != HttpStatus.SC_OK) {
	    System.out.println("http connect fail:{}");
	    }
	     //正常的话把结果返回给调用者
	    String result = EntityUtils.toString(entity, "utf-8");
	    return   new JSONObject(result);
	}

	
}
