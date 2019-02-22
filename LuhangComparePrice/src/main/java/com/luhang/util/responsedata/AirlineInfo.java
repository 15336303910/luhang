package com.luhang.util.responsedata;

import java.text.SimpleDateFormat;

import com.luhang.bean.RoutingRecord;

public class AirlineInfo {
	private String carrier;
	private String flightNumber;
	private String depAirport;
	private String depTime;
	private String arrAirport;
	private String arrTime;
	private String stopCities;
	private boolean codeShare;
	private String cabin;
	private String aircraftCode;
	private int cabinClass;
	private int group;
	public AirlineInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AirlineInfo(String carrier, String flightNumber, String depAirport, String depTime, String arrAirport,
			String arrTime, String stopCities, boolean codeShare, String cabin, String aircraftCode, int cabinClass,
			int group) {
		super();
		this.carrier = carrier;
		this.flightNumber = flightNumber;
		this.depAirport = depAirport;
		this.depTime = depTime;
		this.arrAirport = arrAirport;
		this.arrTime = arrTime;
		this.stopCities = stopCities;
		this.codeShare = codeShare;
		this.cabin = cabin;
		this.aircraftCode = aircraftCode;
		this.cabinClass = cabinClass;
		this.group = group;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDepAirport() {
		return depAirport;
	}
	public void setDepAirport(String depAirport) {
		this.depAirport = depAirport;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	public String getArrAirport() {
		return arrAirport;
	}
	public void setArrAirport(String arrAirport) {
		this.arrAirport = arrAirport;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public String getStopCities() {
		return stopCities;
	}
	public void setStopCities(String stopCities) {
		this.stopCities = stopCities;
	}
	public boolean isCodeShare() {
		return codeShare;
	}
	public void setCodeShare(boolean codeShare) {
		this.codeShare = codeShare;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getAircraftCode() {
		return aircraftCode;
	}
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}
	public int getCabinClass() {
		return cabinClass;
	}
	public void setCabinClass(int cabinClass) {
		this.cabinClass = cabinClass;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "AirlineInfo [carrier=" + carrier + ", flightNumber=" + flightNumber + ", depAirport=" + depAirport
				+ ", depTime=" + depTime + ", arrAirport=" + arrAirport + ", arrTime=" + arrTime + ", stopCities="
				+ stopCities + ", codeShare=" + codeShare + ", cabin=" + cabin + ", aircraftCode=" + aircraftCode
				+ ", cabinClass=" + cabinClass + ", group=" + group + "]";
	}
	
	/******
	 * 对从数据库取出的一条数据进行封装，封装成一个AirlineInfo类
	 * @param routingRecord
	 * @return
	 */
	public void  formatAirlineData(RoutingRecord routingRecord){
	this.carrier=routingRecord.getCarrier();
	this.flightNumber=routingRecord.getFlight_number();
	this.depAirport=routingRecord.getDep_airport();
	SimpleDateFormat f = new SimpleDateFormat("yyyyMMddhhmm");
	this.depTime=f.format(routingRecord.getDep_time());
	this.arrAirport=routingRecord.getArr_airport();
	this.arrTime=f.format(routingRecord.getArr_time());
	this.stopCities=routingRecord.getStop_city();
	this.codeShare=routingRecord.getCode_share();
	this.cabin=routingRecord.getCabin();
	this.aircraftCode=routingRecord.getAircraft_code();
	this.group=routingRecord.getGroup();
	
/*		airlineInfo.setCarrier(routingRecord.getCarrier());
		airlineInfo.setFlightNumber(routingRecord.getFlight_number());
		airlineInfo.setDepAirport(routingRecord.getDep_airport());
		
		airlineInfo.setDepTime();
		airlineInfo.setArrAirport(routingRecord.getArr_airport());
		airlineInfo.setArrTime();
		airlineInfo.setStopCities(routingRecord.getStop_city());
		airlineInfo.setCodeShare(routingRecord.getCode_share());
		airlineInfo.setCabin(routingRecord.getCabin());
		airlineInfo.setAircraftCode(routingRecord.getAircraft_code());
		airlineInfo.setCabinClass(routingRecord.getCabin_class());
		airlineInfo.setGroup(routingRecord.getGroup());
		*/
		
	
	}  
	
	
	
	
}
