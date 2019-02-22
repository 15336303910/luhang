package com.luhang.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PriceRecord {
    private Integer id;

    private String flight_num;

    private Date date;

    private String week;

    private String platform_web;

    private Integer sameairline_opp;

    private Integer diffairline_opp1;

    private Integer diffairline_opp2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlight_num() {
        return flight_num;
    }

    public void setFlight_num(String flight_num) {
        this.flight_num = flight_num == null ? null : flight_num.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    public String getPlatform_web() {
        return platform_web;
    }

    public void setPlatform_web(String platform_web) {
        this.platform_web = platform_web == null ? null : platform_web.trim();
    }

    public Integer getSameairline_opp() {
        return sameairline_opp;
    }

    public void setSameairline_opp(Integer sameairline_opp) {
        this.sameairline_opp = sameairline_opp;
    }

    public Integer getDiffairline_opp1() {
        return diffairline_opp1;
    }

    public void setDiffairline_opp1(Integer diffairline_opp1) {
        this.diffairline_opp1 = diffairline_opp1;
    }

    public Integer getDiffairline_opp2() {
        return diffairline_opp2;
    }

    public void setDiffairline_opp2(Integer diffairline_opp2) {
        this.diffairline_opp2 = diffairline_opp2;
    }
}