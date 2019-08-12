package com.sdic.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ResultDTO<T> {
	


	private String returnCode;
	
	private String returnMsg;
	
	
	private List<T> rows = new ArrayList<T>();
	
	private List<T> rows1 = new ArrayList<T>();
	
	private List<T> rows2 = new ArrayList<T>();
	
	private int price;				  //当前订单价格
	private String memberCode = "";		 //当前订单最高价用户
	
	private int total;
	
	private T entity = (T) new String("");
	
	private String flag = "";

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		if (null == entity) {
			entity = (T) new String("");
		}
		this.entity = entity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public List<T> getRows1() {
		return rows1;
	}

	public void setRows1(List<T> rows1) {
		this.rows1 = rows1;
	}

	public List<T> getRows2() {
		return rows2;
	}

	public void setRows2(List<T> rows2) {
		this.rows2 = rows2;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	

}
