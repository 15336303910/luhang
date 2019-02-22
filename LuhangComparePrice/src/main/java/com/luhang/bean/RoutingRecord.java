package com.luhang.bean;

import java.util.Date;

public class RoutingRecord {
    private Integer p_id;

    private String carrier;

    private String flight_number;

    private String dep_airport;

    private Date dep_time;

    private String arr_airport;

    private Date arr_time;

    private String stop_city;

    private Boolean code_share;

    private String cabin;

    private String aircraft_code;

    private Integer cabin_class;

   
 
    
    private Integer group;

    private String data;

    private String currency;

    private Integer adult_price;

    private Integer adult_tax;

    private Integer child_price;

    private Integer child_tax;

    private Integer nationality_type;

    private String nationality;

    private String suit_age;

    private Integer price_type;

    private Integer applyType;

    private Integer adultTaxType;

    private Integer childTaxType;

    private Integer ticket_timelimit;

    private Integer ticket_invoicetype;

    private Integer tag;

    private Integer has_refund;

    private String refund;

    private Integer part_refund;

    private String part_refundprice;

    private Integer has_endorse;

    private String endorse;

    private Integer part_endorse;

    private String part_endorseprice;

    private Integer endorsement;

    private Integer has_noshow;

    private Integer noshow_limittime;

    private String penalty;

    private Integer special_noshow;

    private String other;

    private Integer has_baggage;

    private String baggage;

    private Integer max_seat;

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number == null ? null : flight_number.trim();
    }

    public String getDep_airport() {
        return dep_airport;
    }

    public void setDep_airport(String dep_airport) {
        this.dep_airport = dep_airport == null ? null : dep_airport.trim();
    }

    public Date getDep_time() {
        return dep_time;
    }

    public void setDep_time(Date dep_time) {
        this.dep_time = dep_time;
    }

    public String getArr_airport() {
        return arr_airport;
    }

    public void setArr_airport(String arr_airport) {
        this.arr_airport = arr_airport == null ? null : arr_airport.trim();
    }

    public Date getArr_time() {
        return arr_time;
    }

    public void setArr_time(Date arr_time) {
        this.arr_time = arr_time;
    }

    public String getStop_city() {
        return stop_city;
    }

    public void setStop_city(String stop_city) {
        this.stop_city = stop_city == null ? null : stop_city.trim();
    }

    public Boolean getCode_share() {
        return code_share;
    }

    public void setCode_share(Boolean code_share) {
        this.code_share = code_share;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin == null ? null : cabin.trim();
    }

    public String getAircraft_code() {
        return aircraft_code;
    }

    public void setAircraft_code(String aircraft_code) {
        this.aircraft_code = aircraft_code == null ? null : aircraft_code.trim();
    }

    public Integer getCabin_class() {
        return cabin_class;
    }

    public void setCabin_class(Integer cabin_class) {
        this.cabin_class = cabin_class;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Integer getAdult_price() {
        return adult_price;
    }

    public void setAdult_price(Integer adult_price) {
        this.adult_price = adult_price;
    }

    public Integer getAdult_tax() {
        return adult_tax;
    }

    public void setAdult_tax(Integer adult_tax) {
        this.adult_tax = adult_tax;
    }

    public Integer getChild_price() {
        return child_price;
    }

    public void setChild_price(Integer child_price) {
        this.child_price = child_price;
    }

    public Integer getChild_tax() {
        return child_tax;
    }

    public void setChild_tax(Integer child_tax) {
        this.child_tax = child_tax;
    }

    public Integer getNationality_type() {
        return nationality_type;
    }

    public void setNationality_type(Integer nationality_type) {
        this.nationality_type = nationality_type;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getSuit_age() {
        return suit_age;
    }

    public void setSuit_age(String suit_age) {
        this.suit_age = suit_age == null ? null : suit_age.trim();
    }

    public Integer getPrice_type() {
        return price_type;
    }

    public void setPrice_type(Integer price_type) {
        this.price_type = price_type;
    }

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public Integer getAdultTaxType() {
        return adultTaxType;
    }

    public void setAdultTaxType(Integer adultTaxType) {
        this.adultTaxType = adultTaxType;
    }

    public Integer getChildTaxType() {
        return childTaxType;
    }

    public void setChildTaxType(Integer childTaxType) {
        this.childTaxType = childTaxType;
    }

    public Integer getTicket_timelimit() {
        return ticket_timelimit;
    }

    public void setTicket_timelimit(Integer ticket_timelimit) {
        this.ticket_timelimit = ticket_timelimit;
    }

    public Integer getTicket_invoicetype() {
        return ticket_invoicetype;
    }

    public void setTicket_invoicetype(Integer ticket_invoicetype) {
        this.ticket_invoicetype = ticket_invoicetype;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Integer getHas_refund() {
        return has_refund;
    }

    public void setHas_refund(Integer has_refund) {
        this.has_refund = has_refund;
    }

    public String getRefund() {
        return refund;
    }

    public void setRefund(String refund) {
        this.refund = refund == null ? null : refund.trim();
    }

    public Integer getPart_refund() {
        return part_refund;
    }

    public void setPart_refund(Integer part_refund) {
        this.part_refund = part_refund;
    }

    public String getPart_refundprice() {
        return part_refundprice;
    }

    public void setPart_refundprice(String part_refundprice) {
        this.part_refundprice = part_refundprice == null ? null : part_refundprice.trim();
    }

    public Integer getHas_endorse() {
        return has_endorse;
    }

    public void setHas_endorse(Integer has_endorse) {
        this.has_endorse = has_endorse;
    }

    public String getEndorse() {
        return endorse;
    }

    public void setEndorse(String endorse) {
        this.endorse = endorse == null ? null : endorse.trim();
    }

    public Integer getPart_endorse() {
        return part_endorse;
    }

    public void setPart_endorse(Integer part_endorse) {
        this.part_endorse = part_endorse;
    }

    public String getPart_endorseprice() {
        return part_endorseprice;
    }

    public void setPart_endorseprice(String part_endorseprice) {
        this.part_endorseprice = part_endorseprice == null ? null : part_endorseprice.trim();
    }

    public Integer getEndorsement() {
        return endorsement;
    }

    public void setEndorsement(Integer endorsement) {
        this.endorsement = endorsement;
    }

    public Integer getHas_noshow() {
        return has_noshow;
    }

    public void setHas_noshow(Integer has_noshow) {
        this.has_noshow = has_noshow;
    }

    public Integer getNoshow_limittime() {
        return noshow_limittime;
    }

    public void setNoshow_limittime(Integer noshow_limittime) {
        this.noshow_limittime = noshow_limittime;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty == null ? null : penalty.trim();
    }

    public Integer getSpecial_noshow() {
        return special_noshow;
    }

    public void setSpecial_noshow(Integer special_noshow) {
        this.special_noshow = special_noshow;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public Integer getHas_baggage() {
        return has_baggage;
    }

    public void setHas_baggage(Integer has_baggage) {
        this.has_baggage = has_baggage;
    }

    public String getBaggage() {
        return baggage;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage == null ? null : baggage.trim();
    }

    public Integer getMax_seat() {
        return max_seat;
    }

    public void setMax_seat(Integer max_seat) {
        this.max_seat = max_seat;
    }

	@Override
	public String toString() {
		return "RoutingRecord [p_id=" + p_id + ", carrier=" + carrier + ", flight_number=" + flight_number
				+ ", dep_airport=" + dep_airport + ", dep_time=" + dep_time + ", arr_airport=" + arr_airport
				+ ", arr_time=" + arr_time + ", stop_city=" + stop_city + ", code_share=" + code_share + ", cabin="
				+ cabin + ", aircraft_code=" + aircraft_code + ", cabin_class=" + cabin_class + ", group=" + group
				+ ", data=" + data + ", currency=" + currency + ", adult_price=" + adult_price + ", adult_tax="
				+ adult_tax + ", child_price=" + child_price + ", child_tax=" + child_tax + ", nationality_type="
				+ nationality_type + ", nationality=" + nationality + ", suit_age=" + suit_age + ", price_type="
				+ price_type + ", applyType=" + applyType + ", adultTaxType=" + adultTaxType + ", childTaxType="
				+ childTaxType + ", ticket_timelimit=" + ticket_timelimit + ", ticket_invoicetype=" + ticket_invoicetype
				+ ", tag=" + tag + ", has_refund=" + has_refund + ", refund=" + refund + ", part_refund=" + part_refund
				+ ", part_refundprice=" + part_refundprice + ", has_endorse=" + has_endorse + ", endorse=" + endorse
				+ ", part_endorse=" + part_endorse + ", part_endorseprice=" + part_endorseprice + ", endorsement="
				+ endorsement + ", has_noshow=" + has_noshow + ", noshow_limittime=" + noshow_limittime + ", penalty="
				+ penalty + ", special_noshow=" + special_noshow + ", other=" + other + ", has_baggage=" + has_baggage
				+ ", baggage=" + baggage + ", max_seat=" + max_seat + "]";
	}
    
}