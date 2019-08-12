package com.sdic.tra.dto;

import java.util.Date;

import com.sdic.tra.entity.TraHighestBid;


/**
*Description：订单流水信息
* @use 主要用于订单流水信息
**/
public class TraOfferWaterDto{

		private String id;
		private String memberCode;
		private String memberNum;// 商户编号 如：1号商户 2号商户
		private String orderId;
		private String orderNo;
		private String promisesType;
		private Integer bidAmount;
		private Date bidTime;
		private String bidWay;
		private String deleteTag;
		private Date ts;
		private String timeliness;
		private String reservedField1;
		private String reservedField2;
		private Integer addExtent;
		private Integer margin;//扣除保证金 
		private boolean waterSize = true;//竞价时是否计算竞价次数，false：不计算，true：计算

		private String bidType; //0：竞价，1：报价，2:一口价  3：智能竞价
		private String carCode; //车辆code
		private Date sysDate;	//数据库当前时间
		

		private Integer delaySecond;	//xx秒内出价，订单结束时间自动延长到还剩xx秒 
		private Integer endsecond;//最后剩余时间秒
		/**
		 * 根据OrderId查询当前车辆的最高价,本外区分，不区分出价类型
		 */
		private TraHighestBid traHighestBidByOrderId;
		/**
		 * 根据carCode查询当前车辆的最高价,本外区分，不区分出价类型
		 */
		private TraHighestBid traHighestBidByCar;
		
		/**
		 * 根据carCode查询当前车辆的最高价,本外区分，区分出价类型
		 */
		private TraHighestBid traHighestBidByCarAndBidType;
		
		/**
		 * 当前订单信息
		 */
		private TraOrderDto orderDto;
		/**车牌号**/
		private String  license;
		
		public Integer getMargin() {
			return margin;
		}
		public void setMargin(Integer margin) {
			this.margin = margin;
		}
		public Date getSysDate() {
			return sysDate;
		}
		public void setSysDate(Date sysDate) {
			this.sysDate = sysDate;
		}
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
		public String getOrderId(){
			return orderId;
		}
		public void setOrderId(String orderId){
			this.orderId = orderId;
		}
		public String getPromisesType() {
			return promisesType;
		}
		public void setPromisesType(String promisesType) {
			this.promisesType = promisesType;
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
		public String getBidType() {
			return bidType;
		}
		public void setBidType(String bidType) {
			this.bidType = bidType;
		}
		public String getCarCode() {
			return carCode;
		}
		public void setCarCode(String carCode) {
			this.carCode = carCode;
		}
		public String getDeleteTag() {
			return deleteTag;
		}
		public void setDeleteTag(String deleteTag) {
			this.deleteTag = deleteTag;
		}
		public Date getTs() {
			return ts;
		}
		public void setTs(Date ts) {
			this.ts = ts;
		}
		public String getTimeliness() {
			return timeliness;
		}
		public void setTimeliness(String timeliness) {
			this.timeliness = timeliness;
		}
		public String getReservedField1() {
			return reservedField1;
		}
		public void setReservedField1(String reservedField1) {
			this.reservedField1 = reservedField1;
		}
		public String getReservedField2() {
			return reservedField2;
		}
		public void setReservedField2(String reservedField2) {
			this.reservedField2 = reservedField2;
		}
		public Integer getAddExtent() {
			return addExtent;
		}
		public void setAddExtent(Integer addExtent) {
			this.addExtent = addExtent;
		}
		public boolean isWaterSize() {
			return waterSize;
		}
		public void setWaterSize(boolean waterSize) {
			this.waterSize = waterSize;
		}
		public TraHighestBid getTraHighestBidByCar() {
			return traHighestBidByCar;
		}
		public void setTraHighestBidByCar(TraHighestBid traHighestBidByCar) {
			this.traHighestBidByCar = traHighestBidByCar;
		}
		/**
		 * 查询当前车辆的最高价,本外区分，区分出价类型
		 */
		public TraHighestBid getTraHighestBidByCarAndBidType() {
			return traHighestBidByCarAndBidType;
		}
		public void setTraHighestBidByCarAndBidType(
				TraHighestBid traHighestBidByCarAndBidType) {
			this.traHighestBidByCarAndBidType = traHighestBidByCarAndBidType;
		}
		public TraHighestBid getTraHighestBidByOrderId() {
			return traHighestBidByOrderId;
		}
		public void setTraHighestBidByOrderId(TraHighestBid traHighestBidByOrderId) {
			this.traHighestBidByOrderId = traHighestBidByOrderId;
		}
		public TraOrderDto getOrderDto() {
			return orderDto;
		}
		public void setOrderDto(TraOrderDto orderDto) {
			this.orderDto = orderDto;
		}
		public Integer getDelaySecond() {
			return delaySecond;
		}
		public void setDelaySecond(Integer delaySecond) {
			this.delaySecond = delaySecond;
		}

		public Integer getEndsecond() {
			return endsecond;
		}
		public void setEndsecond(Integer endsecond) {
			this.endsecond = endsecond;
		}
		public String getMemberNum() {
			return memberNum;
		}
		public void setMemberNum(String memberNum) {
			this.memberNum = memberNum;
		}
		public String getLicense() {
			return license;
		}
		public void setLicense(String license) {
			this.license = license;
		}
		public String getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		
		
}