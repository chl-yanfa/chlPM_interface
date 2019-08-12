package com.sdic.personal.dto;

/**
 * 项目名称：	sdicPM_interface
 * 类名称：	TradeFlow
 * 类描述：	交易明细
 * 创建人：	zhangwanxin
 * 创建时间： 	2018年12月5日 上午10:36:22
 */
public class TradeDTO {
	private String operatorType;				//交易状态
	private String memberCode;					//订单状态
	private Integer pageNum;
	private Integer rows;
	public String getOperatorType() {
		return operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
}
