package com.luhang.util.responsedata;

import java.text.SimpleDateFormat;

import com.luhang.bean.RoutingRecord;

public class Rule {

	private int hasRefund;
	private String refund;
	private  int partRefund;
	private  String partRefundPrice;
   private  int hasEndorse;
   private  String endorse;
   private int partEndorse;
   private  String partEndorsePrice;
   private  int endorsement;
   private int hasNoShow;
   private int noShowLimitTime;
   private  String penalty;
   private int  specialNoShow;
   private String other;
   private int hasBaggage;
   private String baggage;
public Rule() {
	super();
	// TODO Auto-generated constructor stub
}
public Rule(int hasRefund, String refund, int partRefund, String partRefundPrice, int hasEndorse, String endorse,
		int partEndorse, String partEndorsePrice, int endorsement, int hasNoShow, int noShowLimitTime, String penalty,
		int specialNoShow, String other, int hasBaggage, String baggage) {
	super();
	this.hasRefund = hasRefund;
	this.refund = refund;
	this.partRefund = partRefund;
	this.partRefundPrice = partRefundPrice;
	this.hasEndorse = hasEndorse;
	this.endorse = endorse;
	this.partEndorse = partEndorse;
	this.partEndorsePrice = partEndorsePrice;
	this.endorsement = endorsement;
	this.hasNoShow = hasNoShow;
	this.noShowLimitTime = noShowLimitTime;
	this.penalty = penalty;
	this.specialNoShow = specialNoShow;
	this.other = other;
	this.hasBaggage = hasBaggage;
	this.baggage = baggage;
}
public int getHasRefund() {
	return hasRefund;
}
public void setHasRefund(int hasRefund) {
	this.hasRefund = hasRefund;
}
public String getRefund() {
	return refund;
}
public void setRefund(String refund) {
	this.refund = refund;
}
public int getPartRefund() {
	return partRefund;
}
public void setPartRefund(int partRefund) {
	this.partRefund = partRefund;
}
public String getPartRefundPrice() {
	return partRefundPrice;
}
public void setPartRefundPrice(String partRefundPrice) {
	this.partRefundPrice = partRefundPrice;
}
public int getHasEndorse() {
	return hasEndorse;
}
public void setHasEndorse(int hasEndorse) {
	this.hasEndorse = hasEndorse;
}
public String getEndorse() {
	return endorse;
}
public void setEndorse(String endorse) {
	this.endorse = endorse;
}
public int getPartEndorse() {
	return partEndorse;
}
public void setPartEndorse(int partEndorse) {
	this.partEndorse = partEndorse;
}
public String getPartEndorsePrice() {
	return partEndorsePrice;
}
public void setPartEndorsePrice(String partEndorsePrice) {
	this.partEndorsePrice = partEndorsePrice;
}
public int getEndorsement() {
	return endorsement;
}
public void setEndorsement(int endorsement) {
	this.endorsement = endorsement;
}
public int getHasNoShow() {
	return hasNoShow;
}
public void setHasNoShow(int hasNoShow) {
	this.hasNoShow = hasNoShow;
}
public int getNoShowLimitTime() {
	return noShowLimitTime;
}
public void setNoShowLimitTime(int noShowLimitTime) {
	this.noShowLimitTime = noShowLimitTime;
}
public String getPenalty() {
	return penalty;
}
public void setPenalty(String penalty) {
	this.penalty = penalty;
}
public int getSpecialNoShow() {
	return specialNoShow;
}
public void setSpecialNoShow(int specialNoShow) {
	this.specialNoShow = specialNoShow;
}
public String getOther() {
	return other;
}
public void setOther(String other) {
	this.other = other;
}
public int getHasBaggage() {
	return hasBaggage;
}
public void setHasBaggage(int hasBaggage) {
	this.hasBaggage = hasBaggage;
}
public String getBaggage() {
	return baggage;
}
public void setBaggage(String baggage) {
	this.baggage = baggage;
}
@Override
public String toString() {
	return "Rule [hasRefund=" + hasRefund + ", refund=" + refund + ", partRefund=" + partRefund + ", partRefundPrice="
			+ partRefundPrice + ", hasEndorse=" + hasEndorse + ", endorse=" + endorse + ", partEndorse=" + partEndorse
			+ ", partEndorsePrice=" + partEndorsePrice + ", endorsement=" + endorsement + ", hasNoShow=" + hasNoShow
			+ ", noShowLimitTime=" + noShowLimitTime + ", penalty=" + penalty + ", specialNoShow=" + specialNoShow
			+ ", other=" + other + ", hasBaggage=" + hasBaggage + ", baggage=" + baggage + "]";
}
   

/******
 * 对从数据库取出的一条数据进行封装，封装成一个Rule类
 * @param routingRecord
 * @return
 */
  public void  fromatRuleData(RoutingRecord routingRecord){
	  this.hasRefund=routingRecord.getHas_refund();
	  this.refund=routingRecord.getRefund();
	  this.partRefund=routingRecord.getPart_refund();
	  this.partRefundPrice=routingRecord.getPart_refundprice();
	  this.hasEndorse=routingRecord.getHas_endorse();
	  this.endorse=routingRecord.getEndorse();
	  this.partEndorse=routingRecord.getPart_endorse();
	  this.partEndorsePrice=routingRecord.getPart_endorseprice();
	  this.endorsement=routingRecord.getEndorsement();
	  this.hasNoShow=routingRecord.getHas_noshow();
	  this.noShowLimitTime=routingRecord.getNoshow_limittime();
	  this.penalty=routingRecord.getPenalty();
	  this.specialNoShow=routingRecord.getSpecial_noshow();
	  this.other=routingRecord.getOther();
	  this.hasBaggage=routingRecord.getHas_baggage();
	  this.baggage=routingRecord.getBaggage();
 
  } 


   
   
}
