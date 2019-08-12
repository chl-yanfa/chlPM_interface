package com.sdic.tra.entity;


public class TraHighestBid{

		private String reservedField2 = null;
		private String id = null;
		private String orderId = null;
		private String orderNo = null;
		private String carCode = null;
		private String memberCode = null;
		private Integer maximumPrice = null;
		private String bidWay = null;
		private String bidType = null;
		private String deleteTag = null;
		private java.util.Date ts = null;
		private String timeliness = null;
		private String reservedField1 = null;
		private String promisesType;
		private String carFirstImg;
		private String brand;
		private String model;
		private String color;
		private String countryName;
		private String seriesName;
		private String carInfo;		//车辆名称
		private String regDate;
		private String manufacturer;
		private String status;
		private Integer margin;//扣除保证金 
		private String isThird="0";//是否是第三方0否1是 
		private String xmlPath;//检测报告路径
		private String auctionModel; //拍卖类型
		
		public String getIsThird() {
			return isThird;
		}
		public void setIsThird(String isThird) {
			this.isThird = isThird;
		}
		public Integer getMargin() {
			return margin;
		}
		public void setMargin(Integer margin) {
			this.margin = margin;
		}
		public String getReservedField2(){
			return reservedField2;
		}
		public void setReservedField2(String reservedField2){
			this.reservedField2 = reservedField2;
		}
		public String getId(){
			return id;
		}
		public void setId(String id){
			this.id = id;
		}
		public String getOrderId(){
			return orderId;
		}
		public void setOrderId(String orderId){
			this.orderId = orderId;
		}
		public String getCarCode(){
			return carCode;
		}
		public void setCarCode(String carCode){
			this.carCode = carCode;
		}
		public String getMemberCode() {
			return memberCode;
		}
		public void setMemberCode(String memberCode) {
			this.memberCode = memberCode;
		}
		public Integer getMaximumPrice(){
			return maximumPrice;
		}
		public void setMaximumPrice(Integer maximumPrice){
			this.maximumPrice = maximumPrice;
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
		public String getPromisesType() {
			return promisesType;
		}
		public void setPromisesType(String promisesType) {
			this.promisesType = promisesType;
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
		public String getCarInfo() {
			return carInfo;
		}
		public void setCarInfo(String carInfo) {
			this.carInfo = carInfo;
		}
		public String getRegDate() {
			return regDate;
		}
		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getXmlPath() {
			return xmlPath;
		}
		public void setXmlPath(String xmlPath) {
			this.xmlPath = xmlPath;
		}
		public String getAuctionModel() {
			return auctionModel;
		}
		public void setAuctionModel(String auctionModel) {
			this.auctionModel = auctionModel;
		}
		public String getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		
		
}