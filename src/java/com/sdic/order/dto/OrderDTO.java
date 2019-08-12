package com.sdic.order.dto;

/**
 * 项目名称：	sdicPM_interface
 * 类名称：	OrderDTO
 * 类描述：
 * 创建人：	zhangwanxin
 * 创建时间： 	2018年12月16日 下午1:38:01
 */
public class OrderDTO {
	private String orderState;					//订单状态
	private String memberCode;					//订单状态
	private Integer pageNum;
	private Integer rows;
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
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
