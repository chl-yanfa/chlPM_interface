package com.sdic.order.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.sdic.common.JsonDateSerializer;

/**
 * 项目名称：	sdicPM_interface
 * 类名称：	AuctionOrder
 * 类描述：	订单
 * 创建人：	zhangwanxin
 * 创建时间： 	2018年12月16日 上午11:33:08
 */
public class AuctionOrder {
	private String orderId;
	private String orderNo;
	private String carNumber;
	private Integer  partsCount;                //旧件个数
	private String drivingBrand;                //品牌
	private String drivingModel;                //车型
	private String drivingSystem;               //车系
	private String fullName;               		//车辆名称
	private String displacement;                //排量
	private String gearboxType;                 //变速箱类型
	private String orderNumber;					//订单编号
	private BigDecimal jointPrice;				//合手价
	private BigDecimal orderAmount;				//订单金额
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public Integer getPartsCount() {
		return partsCount;
	}
	public void setPartsCount(Integer partsCount) {
		this.partsCount = partsCount;
	}
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	private String dealType;					//成交类型
	private String dealTypeS;					//成交类型
	private Date dealDate;						//成交时间
	private String orderState;					//订单状态
	private Date recoveryTime;                  //回收时间
	private Date settlementTime;                //结算时间
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDrivingBrand() {
		return drivingBrand;
	}
	public void setDrivingBrand(String drivingBrand) {
		this.drivingBrand = drivingBrand;
	}
	public String getDrivingModel() {
		return drivingModel;
	}
	public void setDrivingModel(String drivingModel) {
		this.drivingModel = drivingModel;
	}
	public String getDrivingSystem() {
		return drivingSystem;
	}
	public void setDrivingSystem(String drivingSystem) {
		this.drivingSystem = drivingSystem;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public String getGearboxType() {
		return gearboxType;
	}
	public void setGearboxType(String gearboxType) {
		this.gearboxType = gearboxType;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public BigDecimal getJointPrice() {
		return jointPrice;
	}
	public void setJointPrice(BigDecimal jointPrice) {
		this.jointPrice = jointPrice;
	}
	public String getDealType() {
		return dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}
	public String getDealTypeS() {
		return dealTypeS;
	}
	public void setDealTypeS(String dealTypeS) {
		this.dealTypeS = dealTypeS;
	}
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getDealDate() {
		return dealDate;
	}
	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public Date getRecoveryTime() {
		return recoveryTime;
	}
	public void setRecoveryTime(Date recoveryTime) {
		this.recoveryTime = recoveryTime;
	}
	public Date getSettlementTime() {
		return settlementTime;
	}
	public void setSettlementTime(Date settlementTime) {
		this.settlementTime = settlementTime;
	}
}
