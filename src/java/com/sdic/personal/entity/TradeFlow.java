package com.sdic.personal.entity;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.sdic.common.JsonDateSerializer;

/**
 * 项目名称：	sdicPM_interface
 * 类名称：	TradeFlow
 * 类描述：	交易明细
 * 创建人：	zhangwanxin
 * 创建时间： 	2018年12月5日 上午10:36:22
 */
public class TradeFlow {
	private String tradeId;		//流水id
	private String flowNo;		//流水号
	private String amount;	//交易金额
	private String tradeState;	//交易状态
	private String tradeStateS;	//交易状态
	private String summary;		//摘要
	private Date tradeTime;		//交易时间
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getFlowNo() {
		return flowNo;
	}
	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTradeState() {
		return tradeState;
	}
	public void setTradeState(String tradeState) {
		this.tradeState = tradeState;
	}
	public String getTradeStateS() {
		return tradeStateS;
	}
	public void setTradeStateS(String tradeStateS) {
		this.tradeStateS = tradeStateS;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}
	
}
