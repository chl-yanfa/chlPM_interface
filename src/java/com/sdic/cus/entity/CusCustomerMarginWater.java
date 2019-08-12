package com.sdic.cus.entity;

import java.util.Date;

public class CusCustomerMarginWater{

		private String operatorType;
		private String chargeOrder;
		private String chargeSource;
		private String id;
		private String memberCode;
		private String operatorCash;
		private String memo;
		private String operatorUser;
		private Date operatorTime;
		private String deleteTag;
		private Date ts;
		private String timeliness;
		private String reservedField1;
		private String reservedField2;
		private String orderId;
		private String orderNo;
		private String carCode;

		private String carFirstImg = "";
		
		private String brand = "";
		private String model = "";
		private String color = "";
		private String countryName = "";
		private String seriesName = "";
		private String manufacturer = "";
		private String regDate = "";
		private String carInfo = "";
		private Integer operatorTimeRang;  //1、最近3天 2、最近一月 3、全部
		private Integer minus = -1; //默认-1，1：查询所有扣款记录
		private Integer balance = 0; //当前余额
		private String bidWay = "";
		private String bidType = "";		
		private String promisesType = "";	//操作类型
		private String status = "";	
		private Integer maximumPrice = 0;
		private Integer margin;
		
		
		private Integer pageNum = 1;//第一页
		private String p;//编码后的当前页
		private Integer rows = 10;	//查询10行
		private String type ;		//设备类型
		private String xmlPath;//检测报告路径
		private Integer listType;	//我的订单类型  1：待付款 2：付款完成 3：交易完成
		
		private String auctionModel;
		
		private String statusReason;
		
		public String getId(){
			return id;
		}
		public void setId(String id){
			this.id = id;
		}
		public String getMemberCode(){
			return memberCode;
		}
		public void setMemberCode(String memberCode){
			this.memberCode = memberCode;
		}
		public String getMemo(){
			return memo;
		}
		public void setMemo(String memo){
			this.memo = memo;
		}
		public String getOperatorUser(){
			return operatorUser;
		}
		public void setOperatorUser(String operatorUser){
			this.operatorUser = operatorUser;
		}
		public java.util.Date getOperatorTime(){
			return operatorTime;
		}
		public void setOperatorTime(java.util.Date operatorTime){
			this.operatorTime = operatorTime;
		}
		public String getDeleteTag(){
			return deleteTag;
		}
		public void setDeleteTag(String deleteTag){
			this.deleteTag = deleteTag;
		}
		public java.util.Date getTs(){
			return ts;
		}
		public void setTs(java.util.Date ts){
			this.ts = ts;
		}
		public String getTimeliness(){
			return timeliness;
		}
		public void setTimeliness(String timeliness){
			this.timeliness = timeliness;
		}
		public String getReservedField1(){
			return reservedField1;
		}
		public void setReservedField1(String reservedField1){
			this.reservedField1 = reservedField1;
		}
		public String getReservedField2(){
			return reservedField2;
		}
		public void setReservedField2(String reservedField2){
			this.reservedField2 = reservedField2;
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
		public String getOperatorCash() {
			return operatorCash;
		}
		public void setOperatorCash(String operatorCash) {
			this.operatorCash = operatorCash;
		}
		public String getOperatorType() {
			return operatorType;
		}
		public void setOperatorType(String operatorType) {
			this.operatorType = operatorType;
		}
		public String getChargeOrder() {
			return chargeOrder;
		}
		public void setChargeOrder(String chargeOrder) {
			this.chargeOrder = chargeOrder;
		}
		public String getChargeSource() {
			return chargeSource;
		}
		public void setChargeSource(String chargeSource) {
			this.chargeSource = chargeSource;
		}
		public String getCarFirstImg() {
			return carFirstImg;
		}
		public void setCarFirstImg(String carFirstImg) {
			this.carFirstImg = carFirstImg;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public String getSeriesName() {
			return seriesName;
		}
		public void setSeriesName(String seriesName) {
			this.seriesName = seriesName;
		}
		public Integer getOperatorTimeRang() {
			return operatorTimeRang;
		}
		public void setOperatorTimeRang(Integer operatorTimeRang) {
			this.operatorTimeRang = operatorTimeRang;
		}
		public Integer getMinus() {
			return minus;
		}
		public void setMinus(Integer minus) {
			this.minus = minus;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		
		public String getRegDate() {
			return regDate;
		}
		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}
		
		public String getCarInfo() {
			return carInfo;
		}
		public void setCarInfo(String carInfo) {
			this.carInfo = carInfo;
		}
		public Integer getBalance() {
			return balance;
		}
		public void setBalance(Integer balance) {
			this.balance = balance;
		}
		public String getBidWay() {
			return bidWay;
		}
		public void setBidWay(String bidWay) {
			this.bidWay = bidWay;
		}
		public String getBidType() {
			return bidType;
		}
		public void setBidType(String bidType) {
			this.bidType = bidType;
		}
		public Integer getMaximumPrice() {
			return maximumPrice;
		}
		public void setMaximumPrice(Integer maximumPrice) {
			this.maximumPrice = maximumPrice;
		}
		public String getPromisesType() {
			return promisesType;
		}
		public void setPromisesType(String promisesType) {
			this.promisesType = promisesType;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
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
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getP() {
			return p;
		}
		public void setP(String p) {
			this.p = p;
		}
		public Integer getMargin() {
			return margin;
		}
		public void setMargin(Integer margin) {
			this.margin = margin;
		}
		public String getXmlPath() {
			return xmlPath;
		}
		public void setXmlPath(String xmlPath) {
			this.xmlPath = xmlPath;
		}
		public Integer getListType() {
			return listType;
		}
		public void setListType(Integer listType) {
			this.listType = listType;
		}
		public String getAuctionModel() {
			return auctionModel;
		}
		public void setAuctionModel(String auctionModel) {
			this.auctionModel = auctionModel;
		}
		public String getStatusReason() {
			return statusReason;
		}
		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}
		public String getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		
		
}