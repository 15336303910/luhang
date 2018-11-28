package luhang.bean;

import java.util.Date;




public class LuhangInfo {
    private Integer id;

    private Date date;

    private String platformWeb;

    private Integer showPrice;

    private Integer opponent1Price;

    private Integer opponent2Price;

    private Integer opponent3Price;

    private Integer soldOnline;

    private Integer remainingOnline;

    private Integer inventoryOnline;

    private Integer bookingOffline;

    private Integer soldOffline;

    private Integer remainingOffline;

    private Integer inventoryOffline;

    private Integer ROC;

    private Integer inventoryTotal;

    private Integer remainingTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlatformWeb() {
        return platformWeb;
    }

    public void setPlatformWeb(String platformWeb) {
        this.platformWeb = platformWeb == null ? null : platformWeb.trim();
    }

    public Integer getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Integer showPrice) {
        this.showPrice = showPrice;
    }

    public Integer getOpponent1Price() {
        return opponent1Price;
    }

    public void setOpponent1Price(Integer opponent1Price) {
        this.opponent1Price = opponent1Price;
    }

    public Integer getOpponent2Price() {
        return opponent2Price;
    }

    public void setOpponent2Price(Integer opponent2Price) {
        this.opponent2Price = opponent2Price;
    }

    public Integer getOpponent3Price() {
        return opponent3Price;
    }

    public void setOpponent3Price(Integer opponent3Price) {
        this.opponent3Price = opponent3Price;
    }

    public Integer getSoldOnline() {
        return soldOnline;
    }

    public void setSoldOnline(Integer soldOnline) {
        this.soldOnline = soldOnline;
    }

    public Integer getRemainingOnline() {
        return remainingOnline;
    }

    public void setRemainingOnline(Integer remainingOnline) {
        this.remainingOnline = remainingOnline;
    }

    public Integer getInventoryOnline() {
        return inventoryOnline;
    }

    public void setInventoryOnline(Integer inventoryOnline) {
        this.inventoryOnline = inventoryOnline;
    }

    public Integer getBookingOffline() {
        return bookingOffline;
    }

    public void setBookingOffline(Integer bookingOffline) {
        this.bookingOffline = bookingOffline;
    }

    public Integer getSoldOffline() {
        return soldOffline;
    }

    public void setSoldOffline(Integer soldOffline) {
        this.soldOffline = soldOffline;
    }

    public Integer getRemainingOffline() {
        return remainingOffline;
    }

    public void setRemainingOffline(Integer remainingOffline) {
        this.remainingOffline = remainingOffline;
    }

    public Integer getInventoryOffline() {
        return inventoryOffline;
    }

    public void setInventoryOffline(Integer inventoryOffline) {
        this.inventoryOffline = inventoryOffline;
    }

    public Integer getROC() {
        return ROC;
    }

    public void setROC(Integer ROC) {
        this.ROC = ROC;
    }

    public Integer getInventoryTotal() {
        return inventoryTotal;
    }

    public void setInventoryTotal(Integer inventoryTotal) {
        this.inventoryTotal = inventoryTotal;
    }

    public Integer getRemainingTotal() {
        return remainingTotal;
    }

    public void setRemainingTotal(Integer remainingTotal) {
        this.remainingTotal = remainingTotal;
    }
}