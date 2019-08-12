package com.sdic.tra.dto;

import java.util.Date;

public class BidDto {

	private String id;
	private String memberCode;
	private String memberNum;// 商户编号 如：1号商户 2号商户
	private String orderId;
	private String orderNo;
	private String promisesType;
	private Integer bidAmount = 0;
	private Date bidTime;
	private String bidWay;
	private String deleteTag;
	private Date ts;
	private String timeliness;
	private Integer addExtent = 0;
	private Integer margin = 0;//扣除保证金 
	private boolean waterSize = true;//竞价时是否计算竞价次数，false：不计算，true：计算
	
	private String bidType; //0：竞价，1：报价，2:一口价  3：智能竞价
	private String carCode; //车辆code
	private String license; //车牌号
	private Date sysDate;	//数据库当前时间
	

	private Integer delaySecond;	//xx秒内出价，订单结束时间自动延长到还剩xx秒 
	private Integer endsecond;		//最后剩余时间秒
	private Integer freezeAmount;	//保证金扣除额度
	private String realName;		//出价用户的真实姓名
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPromisesType() {
		return promisesType;
	}
	public void setPromisesType(String promisesType) {
		this.promisesType = promisesType;
	}
	public Integer getBidAmount() {
		return bidAmount;
	}
	public void setBidAmount(Integer bidAmount) {
		this.bidAmount = bidAmount;
	}
	public Date getBidTime() {
		return bidTime;
	}
	public void setBidTime(Date bidTime) {
		this.bidTime = bidTime;
	}
	public String getBidWay() {
		return bidWay;
	}
	public void setBidWay(String bidWay) {
		this.bidWay = bidWay;
	}
	public String getDeleteTag() {
		return deleteTag;
	}
	public void setDeleteTag(String deleteTag) {
		this.deleteTag = deleteTag;
	}
	public Date getTs() {
		return ts;
	}
	public void setTs(Date ts) {
		this.ts = ts;
	}
	public String getTimeliness() {
		return timeliness;
	}
	public void setTimeliness(String timeliness) {
		this.timeliness = timeliness;
	}
	public Integer getAddExtent() {
		return addExtent;
	}
	public void setAddExtent(Integer addExtent) {
		this.addExtent = addExtent;
	}
	public Integer getMargin() {
		return margin;
	}
	public void setMargin(Integer margin) {
		this.margin = margin;
	}
	public boolean isWaterSize() {
		return waterSize;
	}
	public void setWaterSize(boolean waterSize) {
		this.waterSize = waterSize;
	}
	public String getBidType() {
		return bidType;
	}
	public void setBidType(String bidType) {
		this.bidType = bidType;
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
	public Date getSysDate() {
		return sysDate;
	}
	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}
	public Integer getDelaySecond() {
		return delaySecond;
	}
	public void setDelaySecond(Integer delaySecond) {
		this.delaySecond = delaySecond;
	}
	public Integer getEndsecond() {
		return endsecond;
	}
	public void setEndsecond(Integer endsecond) {
		this.endsecond = endsecond;
	}
	public Integer getFreezeAmount() {
		return freezeAmount;
	}
	public void setFreezeAmount(Integer freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
}
