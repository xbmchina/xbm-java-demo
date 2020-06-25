package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class shopBuyer {
    private Long tradeId;

    private Long channelSellerId;

    private Long channelSellerManageId;

    private Long shopBuyerId;

    private String buyerNick;

    private BigDecimal receivedPayment;

    private BigDecimal postFee;

    private String receiverName;

    private String receiverAddress;

    private String receiverZip;

    private String receiverMobile;

    private Byte receiverMobileType;

    private String tid;

    private Integer num;

    private Byte sellerFlag;

    private String sellerMemo;

    private String status;

    private String orderState;

    private Byte channelState;

    private String tradeFrom;

    private String type;

    private String stepTradeStatus;

    private String stepPaidFee;

    private String buyerAlipayNo;

    private BigDecimal price;

    private BigDecimal discountFee;

    private BigDecimal totalFee;

    private Date created;

    private Date payTime;

    private Date modified;

    private Date consignTime;

    private Date endTime;

    private String shippingType;

    private String shippingName;

    private String shippingSid;

    private Byte shippingStatus;

    private Date shippingModified;

    private Date lastShippingUpdateTime;

    private Byte rxAuditStatus;

    private Date lastSendTime;

    private Byte platform;

    private String buyerMessage;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getChannelSellerId() {
        return channelSellerId;
    }

    public void setChannelSellerId(Long channelSellerId) {
        this.channelSellerId = channelSellerId;
    }

    public Long getChannelSellerManageId() {
        return channelSellerManageId;
    }

    public void setChannelSellerManageId(Long channelSellerManageId) {
        this.channelSellerManageId = channelSellerManageId;
    }

    public Long getShopBuyerId() {
        return shopBuyerId;
    }

    public void setShopBuyerId(Long shopBuyerId) {
        this.shopBuyerId = shopBuyerId;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public BigDecimal getReceivedPayment() {
        return receivedPayment;
    }

    public void setReceivedPayment(BigDecimal receivedPayment) {
        this.receivedPayment = receivedPayment;
    }

    public BigDecimal getPostFee() {
        return postFee;
    }

    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip == null ? null : receiverZip.trim();
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public Byte getReceiverMobileType() {
        return receiverMobileType;
    }

    public void setReceiverMobileType(Byte receiverMobileType) {
        this.receiverMobileType = receiverMobileType;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Byte getSellerFlag() {
        return sellerFlag;
    }

    public void setSellerFlag(Byte sellerFlag) {
        this.sellerFlag = sellerFlag;
    }

    public String getSellerMemo() {
        return sellerMemo;
    }

    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo == null ? null : sellerMemo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public Byte getChannelState() {
        return channelState;
    }

    public void setChannelState(Byte channelState) {
        this.channelState = channelState;
    }

    public String getTradeFrom() {
        return tradeFrom;
    }

    public void setTradeFrom(String tradeFrom) {
        this.tradeFrom = tradeFrom == null ? null : tradeFrom.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStepTradeStatus() {
        return stepTradeStatus;
    }

    public void setStepTradeStatus(String stepTradeStatus) {
        this.stepTradeStatus = stepTradeStatus == null ? null : stepTradeStatus.trim();
    }

    public String getStepPaidFee() {
        return stepPaidFee;
    }

    public void setStepPaidFee(String stepPaidFee) {
        this.stepPaidFee = stepPaidFee == null ? null : stepPaidFee.trim();
    }

    public String getBuyerAlipayNo() {
        return buyerAlipayNo;
    }

    public void setBuyerAlipayNo(String buyerAlipayNo) {
        this.buyerAlipayNo = buyerAlipayNo == null ? null : buyerAlipayNo.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType == null ? null : shippingType.trim();
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getShippingSid() {
        return shippingSid;
    }

    public void setShippingSid(String shippingSid) {
        this.shippingSid = shippingSid == null ? null : shippingSid.trim();
    }

    public Byte getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Byte shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Date getShippingModified() {
        return shippingModified;
    }

    public void setShippingModified(Date shippingModified) {
        this.shippingModified = shippingModified;
    }

    public Date getLastShippingUpdateTime() {
        return lastShippingUpdateTime;
    }

    public void setLastShippingUpdateTime(Date lastShippingUpdateTime) {
        this.lastShippingUpdateTime = lastShippingUpdateTime;
    }

    public Byte getRxAuditStatus() {
        return rxAuditStatus;
    }

    public void setRxAuditStatus(Byte rxAuditStatus) {
        this.rxAuditStatus = rxAuditStatus;
    }

    public Date getLastSendTime() {
        return lastSendTime;
    }

    public void setLastSendTime(Date lastSendTime) {
        this.lastSendTime = lastSendTime;
    }

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }
}