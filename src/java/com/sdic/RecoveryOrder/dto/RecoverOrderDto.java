package com.sdic.RecoveryOrder.dto;

import java.util.List;


public class RecoverOrderDto {
	
	private String id;
    private String orderNo;              //订单号
    private String orderType;            //订单类型（1:整车，2:旧件）
    private String oe;                   //OE号
    private String carBrand;             //车标
    private String carModelNumber;       //车辆型号
    private String carFrameNumber;       //车架号
    private String carNumber;            //车牌号
    private String partsName;            //配件名称
    private String partsStandardName;    //标准名称
    private String quality;              //品质
    private String condition;            //品相
    private String carOwner;             //车主
    private String address;              //地址
    private String drivingMileage;       //里程
    private String description;          //描述
    private String headImgUrl;           //头图
    private Integer isremove;            //是否删除
    private String carAge;               //车龄
    private List<RecoverOrderBO> attachmentList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOe() {
		return oe;
	}
	public void setOe(String oe) {
		this.oe = oe;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarModelNumber() {
		return carModelNumber;
	}
	public void setCarModelNumber(String carModelNumber) {
		this.carModelNumber = carModelNumber;
	}
	public String getCarFrameNumber() {
		return carFrameNumber;
	}
	public void setCarFrameNumber(String carFrameNumber) {
		this.carFrameNumber = carFrameNumber;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getPartsName() {
		return partsName;
	}
	public void setPartsName(String partsName) {
		this.partsName = partsName;
	}
	public String getPartsStandardName() {
		return partsStandardName;
	}
	public void setPartsStandardName(String partsStandardName) {
		this.partsStandardName = partsStandardName;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDrivingMileage() {
		return drivingMileage;
	}
	public void setDrivingMileage(String drivingMileage) {
		this.drivingMileage = drivingMileage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHeadImgUrl() {
		return headImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	public Integer getIsremove() {
		return isremove;
	}
	public void setIsremove(Integer isremove) {
		this.isremove = isremove;
	}
	public List<RecoverOrderBO> getAttachmentList() {
		return attachmentList;
	}
	public void setAttachmentList(List<RecoverOrderBO> attachmentList) {
		this.attachmentList = attachmentList;
	}
	public String getCarAge() {
		return carAge;
	}
	public void setCarAge(String carAge) {
		this.carAge = carAge;
	}
    

}
