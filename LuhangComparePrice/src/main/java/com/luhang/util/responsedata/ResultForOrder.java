package com.luhang.util.responsedata;

import org.aspectj.weaver.AjAttribute.PrivilegedAttribute;

public class ResultForOrder {
private int status;
private String msg;
private String sessionId;
private String orderNo;
private String pnrCode;
private int maxSeats;
private Routing routing;

public ResultForOrder() {
	super();
	// TODO Auto-generated constructor stub
}
public ResultForOrder(int status, String msg, String sessionId, String orderNo, String pnrCode, int maxSeats,
		Routing routing, String currency) {
	super();
	this.status = status;
	this.msg = msg;
	this.sessionId = sessionId;
	this.orderNo = orderNo;
	this.pnrCode = pnrCode;
	this.maxSeats = maxSeats;
	this.routing = routing;

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
public String getSessionId() {
	return sessionId;
}
public void setSessionId(String sessionId) {
	this.sessionId = sessionId;
}
public String getOrderNo() {
	return orderNo;
}
public void setOrderNo(String orderNo) {
	this.orderNo = orderNo;
}
public String getPnrCode() {
	return pnrCode;
}
public void setPnrCode(String pnrCode) {
	this.pnrCode = pnrCode;
}
public int getMaxSeats() {
	return maxSeats;
}
public void setMaxSeats(int maxSeats) {
	this.maxSeats = maxSeats;
}
public Routing getRouting() {
	return routing;
}
public void setRouting(Routing routing) {
	this.routing = routing;
}

@Override
public String toString() {
	return "ResultForOrder [status=" + status + ", msg=" + msg + ", sessionId=" + sessionId + ", orderNo=" + orderNo
			+ ", pnrCode=" + pnrCode + ", maxSeats=" + maxSeats + ", routing=" + routing 
			+ "]";
}







	
}
