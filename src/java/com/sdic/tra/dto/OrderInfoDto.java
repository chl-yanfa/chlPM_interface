package com.sdic.tra.dto;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfoDto {

	private Date sysDate;
	private String id;
	private String orderId;
	private String orderNo;
	private String carCode;
	private String license;
	private Integer holdpriceIn = 0;
	private Integer holdpriceOut = 0;
	private Integer auctionPriceIn = 0;
	private Integer auctionPriceOut = 0;
	private Date tenderTime;
	private Date tenderOverTime;
	private Date competeTime;
	private Date competeOverTime;
	private String orderStatus;
	private String upsetPriceShow;
	private String areaLimit;
	private String isSubsidy;
	private String parentOrderId;
	private String isHistory;
	private String auctionModel;
	private Integer platformCosta = 0;
	private Integer bidMaxpriceIn = 0;
	private Integer bidMaxpriceOut = 0;
	private Integer bidMaxpriceUnlimited = 0;
	private String bidMaxpriceInStr;
	private String bidMaxpriceOutStr;
	private String bidMaxpriceUnlimitedStr;
	private String promisesType;
	private Integer bidTimes = 0;
	private Integer surplusTime = 0;	//订单剩余秒数
	private String roundState;
	private String memberCode;
	private Integer myQuotePrice = 0;	//我的最高报价
	private BigDecimal auctionCashDeposit ;
	
	
	
	
	private String[] maxPrice(String str){
		if (null == str) {
			return null;
		}
		String[] result = new String[2];
		String[] s = null;
		String ucode = "U";
		if (str.indexOf("U") != -1) {
			s = str.split("U");
		}else{
			ucode = "B";
			s = str.split("B");
		}
		if(s.length < 2){
			result[0] = s[0];
			result[1] = "";
		}else{
			result[0] = s[0];
		//	result[1] = s[1];
			result[1] = ucode+s[1];
		}
		return result;
	}
	
	public Date getSysDate() {
		return sysDate;
	}
	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCarCode() {
		return carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public Integer getHoldpriceIn() {
		return holdpriceIn;
	}
	public void setHoldpriceIn(Integer holdpriceIn) {
		this.holdpriceIn = holdpriceIn;
	}
	public Integer getHoldpriceOut() {
		return holdpriceOut;
	}
	public void setHoldpriceOut(Integer holdpriceOut) {
		this.holdpriceOut = holdpriceOut;
	}
	
	public Integer getAuctionPriceIn() {
		return auctionPriceIn;
	}
	public void setAuctionPriceIn(Integer auctionPriceIn) {
		this.auctionPriceIn = auctionPriceIn;
	}
	public Integer getAuctionPriceOut() {
		return auctionPriceOut;
	}
	public void setAuctionPriceOut(Integer auctionPriceOut) {
		this.auctionPriceOut = auctionPriceOut;
	}
	public Date getTenderTime() {
		return tenderTime;
	}
	public void setTenderTime(Date tenderTime) {
		this.tenderTime = tenderTime;
	}
	public Date getTenderOverTime() {
		return tenderOverTime;
	}
	public void setTenderOverTime(Date tenderOverTime) {
		this.tenderOverTime = tenderOverTime;
	}
	public Date getCompeteTime() {
		return competeTime;
	}
	public void setCompeteTime(Date competeTime) {
		this.competeTime = competeTime;
	}
	public Date getCompeteOverTime() {
		return competeOverTime;
	}
	public void setCompeteOverTime(Date competeOverTime) {
		this.competeOverTime = competeOverTime;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getUpsetPriceShow() {
		return upsetPriceShow;
	}
	public void setUpsetPriceShow(String upsetPriceShow) {
		this.upsetPriceShow = upsetPriceShow;
	}
	public String getAreaLimit() {
		return areaLimit;
	}
	public void setAreaLimit(String areaLimit) {
		this.areaLimit = areaLimit;
	}
	public String getIsSubsidy() {
		return isSubsidy;
	}
	public void setIsSubsidy(String isSubsidy) {
		this.isSubsidy = isSubsidy;
	}
	public String getParentOrderId() {
		return parentOrderId;
	}
	public void setParentOrderId(String parentOrderId) {
		this.parentOrderId = parentOrderId;
	}
	public String getIsHistory() {
		return isHistory;
	}
	public void setIsHistory(String isHistory) {
		this.isHistory = isHistory;
	}
	public String getAuctionModel() {
		return auctionModel;
	}
	public void setAuctionModel(String auctionModel) {
		this.auctionModel = auctionModel;
	}
	public Integer getPlatformCosta() {
		return platformCosta;
	}
	public void setPlatformCosta(Integer platformCosta) {
		this.platformCosta = platformCosta;
	}
	public Integer getBidMaxpriceIn() {
		return bidMaxpriceIn;
	}
	public void setBidMaxpriceIn(Integer bidMaxpriceIn) {
		this.bidMaxpriceIn = bidMaxpriceIn;
	}
	public Integer getBidMaxpriceOut() {
		return bidMaxpriceOut;
	}
	public void setBidMaxpriceOut(Integer bidMaxpriceOut) {
		this.bidMaxpriceOut = bidMaxpriceOut;
	}
	public Integer getBidMaxpriceUnlimited() {
		return bidMaxpriceUnlimited;
	}
	public void setBidMaxpriceUnlimited(Integer bidMaxpriceUnlimited) {
		this.bidMaxpriceUnlimited = bidMaxpriceUnlimited;
	}
	
	public String getBidMaxpriceInStr() {
		return bidMaxpriceInStr;
	}
	public void setBidMaxpriceInStr(String bidMaxpriceInStr) {
		String[] mp = maxPrice(bidMaxpriceInStr);
		if (null != mp) {
			this.bidMaxpriceIn = Integer.valueOf(mp[0]);
			this.memberCode = mp[1];
		}
		this.bidMaxpriceInStr = bidMaxpriceInStr;
	}
	public String getBidMaxpriceOutStr() {
		return bidMaxpriceOutStr;
	}
	public void setBidMaxpriceOutStr(String bidMaxpriceOutStr) {
		String[] mp = maxPrice(bidMaxpriceOutStr);
		if (null != mp) {
			this.bidMaxpriceOut = Integer.valueOf(mp[0]);
			this.memberCode = mp[1];
		}
		this.bidMaxpriceOutStr = bidMaxpriceOutStr;
	}
	public String getBidMaxpriceUnlimitedStr() {
		return bidMaxpriceUnlimitedStr;
	}
	public void setBidMaxpriceUnlimitedStr(String bidMaxpriceUnlimitedStr) {
		if(bidMaxpriceUnlimitedStr ==null || bidMaxpriceUnlimitedStr.equals("")){
			this.bidMaxpriceUnlimited =0;
			this.memberCode = "";
		}else{
			String[] mp = maxPrice(bidMaxpriceUnlimitedStr);
				this.bidMaxpriceUnlimited = Integer.valueOf(mp[0]);
				this.memberCode = mp[1];
		}
		this.bidMaxpriceUnlimitedStr = bidMaxpriceUnlimitedStr;
	}
	public String getPromisesType() {
		return promisesType;
	}
	public void setPromisesType(String promisesType) {
		this.promisesType = promisesType;
	}
	public Integer getBidTimes() {
		return bidTimes;
	}
	public void setBidTimes(Integer bidTimes) {
		this.bidTimes = bidTimes;
	}
	public Integer getSurplusTime() {
		return surplusTime;
	}
	public void setSurplusTime(Integer surplusTime) {
		this.surplusTime = surplusTime;
	}
	public String getRoundState() {
		return roundState;
	}
	public void setRoundState(String roundState) {
		this.roundState = roundState;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public Integer getMyQuotePrice() {
		return myQuotePrice;
	}

	public void setMyQuotePrice(Integer myQuotePrice) {
		this.myQuotePrice = myQuotePrice;
	}

	public BigDecimal getAuctionCashDeposit() {
		return auctionCashDeposit;
	}

	public void setAuctionCashDeposit(BigDecimal auctionCashDeposit) {
		this.auctionCashDeposit = auctionCashDeposit;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
}
