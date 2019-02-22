package com.luhang.util.responsedata;

import java.security.interfaces.RSAKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.luhang.bean.RoutingRecord;

public class ResultForSearch {

	private int status;
	private String msg;
	private ArrayList<RoutingSearch>    routings;


	
	
	

	public ResultForSearch(int status, String msg, ArrayList<RoutingSearch> routings, String sessionId, int maxSeats,
			Rule rule) {
		super();
		this.status = status;
		this.msg = msg;
		this.routings = routings;
	
	}
	public ResultForSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ArrayList<RoutingSearch> getRoutings() {
		return routings;
	}
	public void setRoutings(ArrayList<RoutingSearch> routings) {
		this.routings = routings;
	}

	
	@Override
	public String toString() {
		return "ResponseResult [status=" + status + ", msg=" + msg + ", routings=" + routings+"]";
	}
		
	
	
		
	
		
		
		
		
		
		
		
		
		
		
}
