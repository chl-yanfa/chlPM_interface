package com.sdic.tra.entity;

import java.util.Date;

public class CarPhoto {
	
	private String id ;
	private int order1 ;
	private String drivingNo;
	private String imgPath;
	private int  imgType;
	private int isDelete;
	private Date createTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getOrder1() {
		return order1;
	}
	public void setOrder1(int order1) {
		this.order1 = order1;
	}
	public String getDrivingNo() {
		return drivingNo;
	}
	public void setDrivingNo(String drivingNo) {
		this.drivingNo = drivingNo;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public int getImgType() {
		return imgType;
	}
	public void setImgType(int imgType) {
		this.imgType = imgType;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	

}
