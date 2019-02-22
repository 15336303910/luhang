package com.luhang.util.requestparam;

public class SearchReq_Param {

	private String cid;
	private String tripType;
	private int adultNum;
	private int childNum;
	private String fromCity;
	private String toCity;
	private String fromDate;
	private String retDate;
	
	
	
	
	public SearchReq_Param() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchReq_Param(String cid, String tripType, int adultNum, int childNum, String fromCity, String toCity,
			String fromDate, String retDate) {
		super();
		this.cid = cid;
		this.tripType = tripType;
		this.adultNum = adultNum;
		this.childNum = childNum;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.fromDate = fromDate;
		this.retDate = retDate;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	public int getAdultNum() {
		return adultNum;
	}
	public void setAdultNum(int adultNum) {
		this.adultNum = adultNum;
	}
	public int getChildNum() {
		return childNum;
	}
	public void setChildNum(int childNum) {
		this.childNum = childNum;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getRetDate() {
		return retDate;
	}
	public void setRetDate(String retDate) {
		this.retDate = retDate;
	}
	

	@Override
	public String toString() {
		return "SearchReq_Param [cid=" + cid + ", tripType=" + tripType + ", adultNum=" + adultNum + ", childNum="
				+ childNum + ", fromCity=" + fromCity + ", toCity=" + toCity + ", fromDate=" + fromDate + ", retDate="
				+ retDate + "]";
	}
	
}
