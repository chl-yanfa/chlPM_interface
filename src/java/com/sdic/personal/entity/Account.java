package com.sdic.personal.entity;

import java.math.BigDecimal;

/**
 * 项目名称：sdicPM_interface
 * 类名称：Account
 * 类描述：
 * 创建人：zhangwanxin
 * 创建时间： 2018年12月3日 下午6:48:30
 */
public class Account {
	private String memberCode;					//会员码
	private String memberNo;					//会员编号
	private Integer toPayCount;					//待支付总数
	private Integer toTakeCarCount;				//待提车总数
	private Integer toTransferCount;			//待过户总数
	private Integer transferedCount;			//已过户总数
	private BigDecimal walletPledgeTotal;		//总资产
	private BigDecimal walletPledge;			//可用余额
	private BigDecimal walletPledgeFreeze;		//冻结保证金
	private BigDecimal transferOwnershipPledge;	//冻结保证金
	
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public Integer getToPayCount() {
		return toPayCount;
	}
	public void setToPayCount(Integer toPayCount) {
		this.toPayCount = toPayCount;
	}
	public Integer getToTakeCarCount() {
		return toTakeCarCount;
	}
	public void setToTakeCarCount(Integer toTakeCarCount) {
		this.toTakeCarCount = toTakeCarCount;
	}
	public Integer getToTransferCount() {
		return toTransferCount;
	}
	public void setToTransferCount(Integer toTransferCount) {
		this.toTransferCount = toTransferCount;
	}
	public Integer getTransferedCount() {
		return transferedCount;
	}
	public void setTransferedCount(Integer transferedCount) {
		this.transferedCount = transferedCount;
	}
	public BigDecimal getWalletPledgeTotal() {
		return walletPledgeTotal;
	}
	public void setWalletPledgeTotal(BigDecimal walletPledgeTotal) {
		this.walletPledgeTotal = walletPledgeTotal;
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
}
