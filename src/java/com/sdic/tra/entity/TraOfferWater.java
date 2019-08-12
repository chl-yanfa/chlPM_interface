package com.sdic.tra.entity;

public class TraOfferWater{

		private String id = null;
		private String memberCode = null;
		private String carId = null;
		private String orderId = null;
		private Integer bidAmount = null;
		private java.util.Date bidTime = null;
		private String promisesType;
		private String bidWay = null;
		private String deleteTag = null;
		private java.util.Date ts = null;
		private String timeliness = null;
		private String reservedField1 = null;
		private String reservedField2 = null;
	
		public String getId(){
			return id;
		}
		public void setId(String id){
			this.id = id;
		}
		public String getMemberCode() {
			return memberCode;
		}
		public void setMemberCode(String memberCode) {
			this.memberCode = memberCode;
		}
		public String getCarId(){
			return carId;
		}
		public void setCarId(String carId){
			this.carId = carId;
		}
		public String getOrderId(){
			return orderId;
		}
		public void setOrderId(String orderId){
			this.orderId = orderId;
		}
		public Integer getBidAmount(){
			return bidAmount;
		}
		public void setBidAmount(Integer bidAmount){
			this.bidAmount = bidAmount;
		}
		public java.util.Date getBidTime(){
			return bidTime;
		}
		public void setBidTime(java.util.Date bidTime){
			this.bidTime = bidTime;
		}
		public String getBidWay(){
			return bidWay;
		}
		public void setBidWay(String bidWay){
			this.bidWay = bidWay;
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
		public String getPromisesType() {
			return promisesType;
		}
		public void setPromisesType(String promisesType) {
			this.promisesType = promisesType;
		}
}