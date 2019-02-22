package com.luhang.util.responsedata;

import java.security.interfaces.RSAKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.luhang.bean.RoutingRecord;

public class ResultForVerify {

	private int status;
	private String msg;
	private String sessionId;
	private int maxSeats;
	private Routing  routings;
	private Rule rule;
	public ResultForVerify() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultForVerify(int status, String msg, Routing routings, String sessionId, int maxSeats, Rule rule) {
		super();
		this.status = status;
		this.msg = msg;
		this.routings = routings;
		this.sessionId = sessionId;
		this.maxSeats = maxSeats;
		this.rule = rule;
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
	public Routing getRoutings() {
		return routings;
	}
	public void setRoutings(Routing routings) {
		this.routings = routings;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public int getMaxSeats() {
		return maxSeats;
	}
	public void setMaxSeats(int maxSeats) {
		this.maxSeats = maxSeats;
	}
	public Rule getRule() {
		return rule;
	}
	public void setRule(Rule rule) {
		this.rule = rule;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxSeats;
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		result = prime * result + ((routings == null) ? 0 : routings.hashCode());
		result = prime * result + ((rule == null) ? 0 : rule.hashCode());
		result = prime * result + ((sessionId == null) ? 0 : sessionId.hashCode());
		result = prime * result + status;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultForVerify other = (ResultForVerify) obj;
		if (maxSeats != other.maxSeats)
			return false;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		if (routings == null) {
			if (other.routings != null)
				return false;
		} else if (!routings.equals(other.routings))
			return false;
		if (rule == null) {
			if (other.rule != null)
				return false;
		} else if (!rule.equals(other.rule))
			return false;
		if (sessionId == null) {
			if (other.sessionId != null)
				return false;
		} else if (!sessionId.equals(other.sessionId))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ResultForVerify [status=" + status + ", msg=" + msg + ", routings=" + routings + ", sessionId="
				+ sessionId + ", maxSeats=" + maxSeats + ", rule=" + rule + "]";
	}
	
	
	

	

	
		
		
		
		
		
		
		
		
		
		
}
