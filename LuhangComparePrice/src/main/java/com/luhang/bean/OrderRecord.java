package com.luhang.bean;

import java.util.Date;

public class OrderRecord {
    private Integer order_id;

    private String order_num;

    private Date create_time;

    private Integer passenger_total;

    private Integer routing_id;

    private String contact_name;

    private String mobile_num;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num == null ? null : order_num.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getPassenger_total() {
        return passenger_total;
    }

    public void setPassenger_total(Integer passenger_total) {
        this.passenger_total = passenger_total;
    }

    public Integer getRouting_id() {
        return routing_id;
    }

    public void setRouting_id(Integer routing_id) {
        this.routing_id = routing_id;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name == null ? null : contact_name.trim();
    }

    public String getMobile_num() {
        return mobile_num;
    }

    public void setMobile_num(String mobile_num) {
        this.mobile_num = mobile_num == null ? null : mobile_num.trim();
    }
}