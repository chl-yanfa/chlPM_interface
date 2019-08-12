package com.sdic.offwater.entity;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.sdic.common.JsonDateSerializer;

/**
 * 项目名称： sdicPM_interface
 * 类名称：     OfferWater
 * 类描述：     出价流水
 * 创建人：     zhangwanxin
 * 创建时间： 2018年11月29日 下午1:45:16
 */
public class OfferWaterInfo {
    private String id;			//
    private String orderId;
    private String memberCode;	//出价人id
    private String nickname;	//出价人
    private Date bidTime;		//出价时间
    private String bidAmount;	//出价金额
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
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getBidTime() {
		return bidTime;
	}
	public void setBidTime(Date bidTime) {
		this.bidTime = bidTime;
	}
	public String getBidAmount() {
		return bidAmount;
	}
	public void setBidAmount(String bidAmount) {
		this.bidAmount = bidAmount;
	}
}