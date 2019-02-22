package com.luhang.util.responsedata;

import java.util.ArrayList;

import com.luhang.bean.RoutingRecord;

public class Routing {
	private String data;
	private String currency;
	private int adultPrice ;
	private  int adultTax;
	private int childPrice;
	private int childTax;
	private int nationalityType;
	private String nationality;
	private String suitAge;
	private int priceType;
	private int applyType;
	private int adultTaxType;
	private int childTaxType;
	private int ticketTimeLimit;
	private int ticketInvoiceType;
	private ArrayList<AirlineInfo> fromSegment;
	private ArrayList<AirlineInfo> retSegment;
	private ArrayList<Integer> combineIndexs;
	private int tag;
	
	public Routing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Routing(String data, String currency, int adultPrice, int adultTax, int childPrice, int childTax,
			int nationalityType, String nationality, String suitAge, int priceType, int applyType, int adultTaxType,
			int childTaxType, int ticketTimeLimit, int ticketInvoiceType, ArrayList<AirlineInfo> fromSegment,
			ArrayList<AirlineInfo> retSegment, ArrayList<Integer> combineIndexs, int tag) {
		super();
		this.data = data;
		this.currency = currency;
		this.adultPrice = adultPrice;
		this.adultTax = adultTax;
		this.childPrice = childPrice;
		this.childTax = childTax;
		this.nationalityType = nationalityType;
		this.nationality = nationality;
		this.suitAge = suitAge;
		this.priceType = priceType;
		this.applyType = applyType;
		this.adultTaxType = adultTaxType;
		this.childTaxType = childTaxType;
		this.ticketTimeLimit = ticketTimeLimit;
		this.ticketInvoiceType = ticketInvoiceType;
		this.fromSegment = fromSegment;
		this.retSegment = retSegment;
		this.combineIndexs = combineIndexs;
		this.tag = tag;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getAdultPrice() {
		return adultPrice;
	}

	public void setAdultPrice(int adultPrice) {
		this.adultPrice = adultPrice;
	}

	public int getAdultTax() {
		return adultTax;
	}

	public void setAdultTax(int adultTax) {
		this.adultTax = adultTax;
	}

	public int getChildPrice() {
		return childPrice;
	}

	public void setChildPrice(int childPrice) {
		this.childPrice = childPrice;
	}

	public int getChildTax() {
		return childTax;
	}

	public void setChildTax(int childTax) {
		this.childTax = childTax;
	}

	public int getNationalityType() {
		return nationalityType;
	}

	public void setNationalityType(int nationalityType) {
		this.nationalityType = nationalityType;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getSuitAge() {
		return suitAge;
	}

	public void setSuitAge(String suitAge) {
		this.suitAge = suitAge;
	}

	public int getPriceType() {
		return priceType;
	}

	public void setPriceType(int priceType) {
		this.priceType = priceType;
	}

	public int getApplyType() {
		return applyType;
	}

	public void setApplyType(int applyType) {
		this.applyType = applyType;
	}

	public int getAdultTaxType() {
		return adultTaxType;
	}

	public void setAdultTaxType(int adultTaxType) {
		this.adultTaxType = adultTaxType;
	}

	public int getChildTaxType() {
		return childTaxType;
	}

	public void setChildTaxType(int childTaxType) {
		this.childTaxType = childTaxType;
	}

	public int getTicketTimeLimit() {
		return ticketTimeLimit;
	}

	public void setTicketTimeLimit(int ticketTimeLimit) {
		this.ticketTimeLimit = ticketTimeLimit;
	}

	public int getTicketInvoiceType() {
		return ticketInvoiceType;
	}

	public void setTicketInvoiceType(int ticketInvoiceType) {
		this.ticketInvoiceType = ticketInvoiceType;
	}

	public ArrayList<AirlineInfo> getFromSegment() {
		return fromSegment;
	}

	public void setFromSegment(ArrayList<AirlineInfo> fromSegment) {
		this.fromSegment = fromSegment;
	}

	public ArrayList<AirlineInfo> getRetSegment() {
		return retSegment;
	}

	public void setRetSegment(ArrayList<AirlineInfo> retSegment) {
		this.retSegment = retSegment;
	}

	public ArrayList<Integer> getCombineIndexs() {
		return combineIndexs;
	}

	public void setCombineIndexs(ArrayList<Integer> combineIndexs) {
		this.combineIndexs = combineIndexs;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Routing [data=" + data + ", currency=" + currency + ", adultPrice=" + adultPrice + ", adultTax="
				+ adultTax + ", childPrice=" + childPrice + ", childTax=" + childTax + ", nationalityType="
				+ nationalityType + ", nationality=" + nationality + ", suitAge=" + suitAge + ", priceType=" + priceType
				+ ", applyType=" + applyType + ", adultTaxType=" + adultTaxType + ", childTaxType=" + childTaxType
				+ ", ticketTimeLimit=" + ticketTimeLimit + ", ticketInvoiceType=" + ticketInvoiceType + ", fromSegment="
				+ fromSegment + ", retSegment=" + retSegment + ", combineIndexs=" + combineIndexs + ", tag=" + tag
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adultPrice;
		result = prime * result + adultTax;
		result = prime * result + adultTaxType;
		result = prime * result + applyType;
		result = prime * result + childPrice;
		result = prime * result + childTax;
		result = prime * result + childTaxType;
		result = prime * result + ((combineIndexs == null) ? 0 : combineIndexs.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((fromSegment == null) ? 0 : fromSegment.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + nationalityType;
		result = prime * result + priceType;
		result = prime * result + ((retSegment == null) ? 0 : retSegment.hashCode());
		result = prime * result + ((suitAge == null) ? 0 : suitAge.hashCode());
		result = prime * result + tag;
		result = prime * result + ticketInvoiceType;
		result = prime * result + ticketTimeLimit;
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
		Routing other = (Routing) obj;
		if (adultPrice != other.adultPrice)
			return false;
		if (adultTax != other.adultTax)
			return false;
		if (adultTaxType != other.adultTaxType)
			return false;
		if (applyType != other.applyType)
			return false;
		if (childPrice != other.childPrice)
			return false;
		if (childTax != other.childTax)
			return false;
		if (childTaxType != other.childTaxType)
			return false;
		if (combineIndexs == null) {
			if (other.combineIndexs != null)
				return false;
		} else if (!combineIndexs.equals(other.combineIndexs))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (fromSegment == null) {
			if (other.fromSegment != null)
				return false;
		} else if (!fromSegment.equals(other.fromSegment))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (nationalityType != other.nationalityType)
			return false;
		if (priceType != other.priceType)
			return false;
		if (retSegment == null) {
			if (other.retSegment != null)
				return false;
		} else if (!retSegment.equals(other.retSegment))
			return false;
		if (suitAge == null) {
			if (other.suitAge != null)
				return false;
		} else if (!suitAge.equals(other.suitAge))
			return false;
		if (tag != other.tag)
			return false;
		if (ticketInvoiceType != other.ticketInvoiceType)
			return false;
		if (ticketTimeLimit != other.ticketTimeLimit)
			return false;
		return true;
	}

	
	/******
	 * 对从数据库进行veriy/order/pay操作取出的一条数据进行封装，封装成一个Routing类
	 * @param routingRecord
	 * @return
	 */
	
	
	public void   formatRoutingData(RoutingRecord routingRecord,ArrayList<AirlineInfo> airlineInfoFrom,ArrayList<AirlineInfo> airlineInfoBack,ArrayList<Integer>combineIndexs){
	
		this.data=routingRecord.getData();
		this.currency=routingRecord.getCurrency();
		this.adultPrice=routingRecord.getAdult_price();
		this.adultTax=routingRecord.getAdult_tax();
		this.childPrice=routingRecord.getChild_price();
		this.childTax=routingRecord.getChild_tax();
		this.nationality=routingRecord.getNationality();
		this.nationalityType=routingRecord.getNationality_type();
		this.suitAge=routingRecord.getSuit_age();
		this.priceType=routingRecord.getPrice_type();
		this.applyType=routingRecord.getApplyType();
		this.adultTaxType=routingRecord.getAdultTaxType();
		this.childTaxType=routingRecord.getChildTaxType();
		this.ticketTimeLimit=routingRecord.getTicket_timelimit();
		this.ticketInvoiceType=routingRecord.getTicket_invoicetype();
		this.fromSegment=airlineInfoFrom;
		this.retSegment=airlineInfoBack;
		this.combineIndexs=combineIndexs;
		
		
		
		/*Routing routing =new Routing();
		routing.setData(routingRecord.getData());
		routing.setCurrency(routingRecord.getCurrency());
		routing.setAdultPrice(routingRecord.getAdult_price());
		routing.setAdultTax(routingRecord.getAdult_tax());
		routing.setChildPrice(routingRecord.getChild_price());
		routing.setChildTax(routingRecord.getChild_tax());
		routing.setNationality(routingRecord.getNationality());
		routing.setNationalityType(routingRecord.getNationality_type());
		routing.setSuitAge(routingRecord.getSuit_age());
		routing.setPriceType(routingRecord.getPrice_type());
		routing.setApplyType(routingRecord.getApplyType());
		routing.setAdultTaxType(routingRecord.getAdultTaxType());
		routing.setChildTaxType(routingRecord.getChildTaxType());
		routing.setTicketTimeLimit(routingRecord.getTicket_timelimit());
		routing.setTicketInvoiceType(routingRecord.getTicket_invoicetype());
		routing.setFromSegment(airlineInfoFrom);
		routing.setRetSegment(airlineInfoBack);
		routing.setCombineIndexs(combineIndexs);
		return routing;*/
		
	}
	
	
	
	
}
