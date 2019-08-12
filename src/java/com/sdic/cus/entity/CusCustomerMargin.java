package com.sdic.cus.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CusCustomerMargin {
	
	private Integer   id;
	private String   uid;
	private String    uname;
	private String    mobile;
	private BigDecimal walletPledge;
	private BigDecimal walletPledgeFreeze;
	private Integer  usableMargin;
	private BigDecimal transferOwnershipPledge;
	private Integer status;
	private Date createTime;
	private String createUser;
	private Date updateTime;
	private String updateUser;
	private String deleteTag;
	
	private Integer freezeAmount; //保证金额
	private String orderId;
	private String memberCode = null;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public BigDecimal getWalletPledge() {
		return walletPledge;
	}
	public void setWalletPledge(BigDecimal walletPledge) {
		this.walletPledge = walletPledge;
	}
	public BigDecimal getWalletPledgeFreeze() {
		return walletPledgeFreeze;
	}
	public void setWalletPledgeFreeze(BigDecimal walletPledgeFreeze) {
		this.walletPledgeFreeze = walletPledgeFreeze;
	}
	public BigDecimal getTransferOwnershipPledge() {
		return transferOwnershipPledge;
	}
	public void setTransferOwnershipPledge(BigDecimal transferOwnershipPledge) {
		this.transferOwnershipPledge = transferOwnershipPledge;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Integer getUsableMargin() {
		return usableMargin;
	}
	public void setUsableMargin(Integer usableMargin) {
		this.usableMargin = usableMargin;
	}
	public String getDeleteTag() {
		return deleteTag;
	}
	public void setDeleteTag(String deleteTag) {
		this.deleteTag = deleteTag;
	}
	public Integer getFreezeAmount() {
		return freezeAmount;
	}
	public void setFreezeAmount(Integer freezeAmount) {
		this.freezeAmount = freezeAmount;
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
	
	
	

}
