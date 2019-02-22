package com.luhang.util.responsedata;

public class ResultForPay {
	private int status;
	private String msg;
	private String sessionId;
	private String orderNo;
	private String pnrCode;
	private Routing routing;
	public ResultForPay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultForPay(int status, String msg, String sessionId, String orderNo, String pnrCode, Routing routing) {
		super();
		this.status = status;
		this.msg = msg;
		this.sessionId = sessionId;
		this.orderNo = orderNo;
		this.pnrCode = pnrCode;
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
	public Routing getRouting() {
		return routing;
	}
	public void setRouting(Routing routing) {
		this.routing = routing;
	}
	@Override
	public String toString() {
		return "ResultForPay [status=" + status + ", msg=" + msg + ", sessionId=" + sessionId + ", orderNo=" + orderNo
				+ ", pnrCode=" + pnrCode + ", routing=" + routing + "]";
	}

	
	
	
	
}
