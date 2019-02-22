package com.luhang.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;




public class SaleRecord {
    private Integer id;

    private Date date;

    private String platform_web;

    private Integer show_price;

    private Integer opponent1_price;

    private Integer opponent2_price;

    private Integer opponent3_price;

    private Integer sold_online;

    private Integer remaining_online;

    private Integer inventory_online;

    private Integer booking_offline;

    private Integer sold_offline;

    private Integer remaining_offline;

    private Integer inventory_offline;

    private Integer roc;

    private Integer inventory_total;

    private Integer remaining_total;

    private String flight_num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlatform_web() {
        return platform_web;
    }

    public void setPlatform_web(String platform_web) {
        this.platform_web = platform_web == null ? null : platform_web.trim();
    }

    public Integer getShow_price() {
        return show_price;
    }

    public void setShow_price(Integer show_price) {
        this.show_price = show_price;
    }

    public Integer getOpponent1_price() {
        return opponent1_price;
    }

    public void setOpponent1_price(Integer opponent1_price) {
        this.opponent1_price = opponent1_price;
    }

    public Integer getOpponent2_price() {
        return opponent2_price;
    }

    public void setOpponent2_price(Integer opponent2_price) {
        this.opponent2_price = opponent2_price;
    }

    public Integer getOpponent3_price() {
        return opponent3_price;
    }

    public void setOpponent3_price(Integer opponent3_price) {
        this.opponent3_price = opponent3_price;
    }

    public Integer getSold_online() {
        return sold_online;
    }

    public void setSold_online(Integer sold_online) {
        this.sold_online = sold_online;
    }

    public Integer getRemaining_online() {
        return remaining_online;
    }

    public void setRemaining_online(Integer remaining_online) {
        this.remaining_online = remaining_online;
    }

    public Integer getInventory_online() {
        return inventory_online;
    }

    public void setInventory_online(Integer inventory_online) {
        this.inventory_online = inventory_online;
    }

    public Integer getBooking_offline() {
        return booking_offline;
    }

    public void setBooking_offline(Integer booking_offline) {
        this.booking_offline = booking_offline;
    }

    public Integer getSold_offline() {
        return sold_offline;
    }

    public void setSold_offline(Integer sold_offline) {
        this.sold_offline = sold_offline;
    }

    public Integer getRemaining_offline() {
        return remaining_offline;
    }

    public void setRemaining_offline(Integer remaining_offline) {
        this.remaining_offline = remaining_offline;
    }

    public Integer getInventory_offline() {
        return inventory_offline;
    }

    public void setInventory_offline(Integer inventory_offline) {
        this.inventory_offline = inventory_offline;
    }

    public Integer getRoc() {
        return roc;
    }

    public void setRoc(Integer roc) {
        this.roc = roc;
    }

    public Integer getInventory_total() {
        return inventory_total;
    }

    public void setInventory_total(Integer inventory_total) {
        this.inventory_total = inventory_total;
    }

    public Integer getRemaining_total() {
        return remaining_total;
    }

    public void setRemaining_total(Integer remaining_total) {
        this.remaining_total = remaining_total;
    }

    public String getFlight_num() {
        return flight_num;
    }

    public void setFlight_num(String flight_num) {
        this.flight_num = flight_num == null ? null : flight_num.trim();
    }

	@Override
	public String toString() {
		return "SaleRecord [id=" + id + ", date=" + date + ", platform_web=" + platform_web + ", show_price="
				+ show_price + ", opponent1_price=" + opponent1_price + ", opponent2_price=" + opponent2_price
				+ ", opponent3_price=" + opponent3_price + ", sold_online=" + sold_online + ", remaining_online="
				+ remaining_online + ", inventory_online=" + inventory_online + ", booking_offline=" + booking_offline
				+ ", sold_offline=" + sold_offline + ", remaining_offline=" + remaining_offline + ", inventory_offline="
				+ inventory_offline + ", roc=" + roc + ", inventory_total=" + inventory_total + ", remaining_total="
				+ remaining_total + ", flight_num=" + flight_num + "]";
	}
    
}