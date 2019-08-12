package com.sdic.follow.entity;

import java.util.Date;

public class Follow {
	
	private String id ;
	private String memberCode;
	private String orderId;
	private String carCode;
	private Date  created;
	private String deleteTag;
	private String isUnfollow;
	private Date ts;
	private String timeliness;
	private Date unfollowTime;
	private String source;
	private String reservedField1;
	private String reservedField2;
	
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
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getDeleteTag() {
		return deleteTag;
	}
	public void setDeleteTag(String deleteTag) {
		this.deleteTag = deleteTag;
	}
	public String getIsUnfollow() {
		return isUnfollow;
	}
	public void setIsUnfollow(String isUnfollow) {
		this.isUnfollow = isUnfollow;
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
	public Date getUnfollowTime() {
		return unfollowTime;
	}
	public void setUnfollowTime(Date unfollowTime) {
		this.unfollowTime = unfollowTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getReservedField1() {
		return reservedField1;
	}
	public void setReservedField1(String reservedField1) {
		this.reservedField1 = reservedField1;
	}
	public String getReservedField2() {
		return reservedField2;
	}
	public void setReservedField2(String reservedField2) {
		this.reservedField2 = reservedField2;
	}
	
	
	

}
