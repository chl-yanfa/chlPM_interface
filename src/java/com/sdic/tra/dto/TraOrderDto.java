package com.sdic.tra.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.sdic.common.JsonDateSerializerYMD;
import com.sdic.common.PaginationEntity;
import com.sdic.tra.entity.CarPhoto;

/**
 * 
 * 
 * 项目名称：sdicPM_interface
 * 类名称：TraOrderDto
 * 类描述：交易大厅实体类
 * 创建人：刘民
 * 创建时间： 2018年11月15日 上午9:34:46
 * 修改人：刘民
 * 修改时间： 2018年11月15日 上午9:34:46
 * 修改备注： 
 * @version 
 *
 */
public class TraOrderDto extends PaginationEntity{
	private String id ;
	private Integer pageNum = 1;                //页数
	private Integer rows = 200;                 //每页显示行数
	private Integer startRow;					//分页开始
	private Integer endRow;						//分页结束
	private String carListType;					//列表类型：参拍模式 0即时拍+长时拍、1即时拍、2长时拍、3现场拍
	private String carInfo;                     //车辆基本信息
	private String drivingBrand;                //品牌
	private String drivingModel;                //车型
	private String drivingSystem;               //车系
	private int auctionType;                    //拍品类型
	private String state;                       //状态
	private BigDecimal startingPrice;           //起拍价
	private BigDecimal priceIncrease;           //加价幅度
	private Date registerDate;                  //初登日期
	private String parkAddress;                 //车辆停放地
	private String transferDate;                //过户期限
	private BigDecimal auctionCashDeposit;      //参拍保证金
	private BigDecimal commission;              //佣金
	private String commissionIsDiscount;		//佣金打折：是否
    private String commissionPercentType;		//佣金打折百分比选项：固定值|百分比
    private BigDecimal commissionDiscountValue;	//佣金打折百分比值
    private BigDecimal rescueCost;				//施救费
    private BigDecimal otherCost;				//其他费用
	private Date auctionStartTime;              //拍卖开始时间
	private Date auctionFinishTime;             //拍卖结束时间
	private Integer intervalTime;				//延时时间（S）
	private String vehicleName;                 //车辆名头
	private String  drivingVin;                 //车辆VIN码/车架号
	private String carCard;                     //车牌数
	private String key1;                         //正常钥匙
	private String spareKey;                    //备用钥匙
	private String strongRiskDate;                //交强险截止日期
	private String annualSurveyDate;              //年检有效期
	private String displacement;                //排量
	private String gearboxType;                 //变速箱类型
	private String drivingType;                 //事故类型
	private String carRemark;                   //详情描述
	private List<CarPhoto>  picList;            //车辆图片
	private String licenseNumber;               //车牌号
	private String drivingNo;                   //车辆编号
	private String drivingNo1;  
	private String dismantlingPart;             //拆解情况
	private String memberCode;
	private String isUnfollow;              
	private String orderId = "";
	private Integer delaySecond = 0;			//系统延时秒数 
	
	private BigDecimal highestPrice;			//当前出价最高价
	private BigDecimal totalPrice;				//当前合手价
	private Date sysDate;
	private String pmhName;						//拍卖会名称
	private Integer pmhType;					//拍卖会类型 0-国投互联 1-中拍协
	private String auctionPlatform;				//拍卖平台
	private String goodsAccessory;				//物资附件
	private String fullName;					//物资名称
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
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getEndRow() {
		return endRow;
	}
	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}
	public String getCarListType() {
		return carListType;
	}
	public void setCarListType(String carListType) {
		this.carListType = carListType;
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
	public int getAuctionType() {
		return auctionType;
	}
	public void setAuctionType(int auctionType) {
		this.auctionType = auctionType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public BigDecimal getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(BigDecimal startingPrice) {
		this.startingPrice = startingPrice;
	}
	public BigDecimal getPriceIncrease() {
		return priceIncrease;
	}
	public void setPriceIncrease(BigDecimal priceIncrease) {
		this.priceIncrease = priceIncrease;
	}
	@JsonSerialize(using=JsonDateSerializerYMD.class)
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getParkAddress() {
		return parkAddress;
	}
	public void setParkAddress(String parkAddress) {
		this.parkAddress = parkAddress;
	}
	public String getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}
	public BigDecimal getAuctionCashDeposit() {
		return auctionCashDeposit;
	}
	public void setAuctionCashDeposit(BigDecimal auctionCashDeposit) {
		this.auctionCashDeposit = auctionCashDeposit;
	}
	public BigDecimal getCommission() {
		return commission;
	}
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}
	public String getCommissionIsDiscount() {
		return commissionIsDiscount;
	}
	public void setCommissionIsDiscount(String commissionIsDiscount) {
		this.commissionIsDiscount = commissionIsDiscount;
	}
	public String getCommissionPercentType() {
		return commissionPercentType;
	}
	public void setCommissionPercentType(String commissionPercentType) {
		this.commissionPercentType = commissionPercentType;
	}
	public BigDecimal getCommissionDiscountValue() {
		return commissionDiscountValue;
	}
	public void setCommissionDiscountValue(BigDecimal commissionDiscountValue) {
		this.commissionDiscountValue = commissionDiscountValue;
	}
	public BigDecimal getRescueCost() {
		return rescueCost;
	}
	public void setRescueCost(BigDecimal rescueCost) {
		this.rescueCost = rescueCost;
	}
	public BigDecimal getOtherCost() {
		return otherCost;
	}
	public void setOtherCost(BigDecimal otherCost) {
		this.otherCost = otherCost;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getDrivingVin() {
		return drivingVin;
	}
	public void setDrivingVin(String drivingVin) {
		this.drivingVin = drivingVin;
	}
	public String getCarCard() {
		return carCard;
	}
	public void setCarCard(String carCard) {
		this.carCard = carCard;
	}
    
	public String getKey1() {
		return key1;
	}
	public void setKey1(String key1) {
		this.key1 = key1;
	}
	public String getSpareKey() {
		return spareKey;
	}
	public void setSpareKey(String spareKey) {
		this.spareKey = spareKey;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public Date getAuctionStartTime() {
		return auctionStartTime;
	}
	public void setAuctionStartTime(Date auctionStartTime) {
		this.auctionStartTime = auctionStartTime;
	}
	public Date getAuctionFinishTime() {
		return auctionFinishTime;
	}
	public void setAuctionFinishTime(Date auctionFinishTime) {
		this.auctionFinishTime = auctionFinishTime;
	}
	public Integer getIntervalTime() {
		return intervalTime;
	}
	public void setIntervalTime(Integer intervalTime) {
		this.intervalTime = intervalTime;
	}
	public String getStrongRiskDate() {
		return strongRiskDate;
	}
	public void setStrongRiskDate(String strongRiskDate) {
		this.strongRiskDate = strongRiskDate;
	}
	public String getAnnualSurveyDate() {
		return annualSurveyDate;
	}
	public void setAnnualSurveyDate(String annualSurveyDate) {
		this.annualSurveyDate = annualSurveyDate;
	}
	public String getCarInfo() {
		return carInfo;
	}
	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
	public String getGearboxType() {
		return gearboxType;
	}
	public void setGearboxType(String gearboxType) {
		this.gearboxType = gearboxType;
	}
	public String getDrivingType() {
		return drivingType;
	}
	public void setDrivingType(String drivingType) {
		this.drivingType = drivingType;
	}
	public String getCarRemark() {
		return carRemark;
	}
	public void setCarRemark(String carRemark) {
		this.carRemark = carRemark;
	}
	public List<CarPhoto> getPicList() {
		return picList;
	}
	public void setPicList(List<CarPhoto> picList) {
		this.picList = picList;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDrivingNo() {
		return drivingNo;
	}
	public void setDrivingNo(String drivingNo) {
		this.drivingNo = drivingNo;
	}
	public String getDismantlingPart() {
		return dismantlingPart;
	}
	public void setDismantlingPart(String dismantlingPart) {
		this.dismantlingPart = dismantlingPart;
	}
	public String getDrivingNo1() {
		return drivingNo1;
	}
	public void setDrivingNo1(String drivingNo1) {
		this.drivingNo1 = drivingNo1;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getIsUnfollow() {
		return isUnfollow;
	}
	public void setIsUnfollow(String isUnfollow) {
		this.isUnfollow = isUnfollow;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getDelaySecond() {
		return delaySecond;
	}
	public void setDelaySecond(Integer delaySecond) {
		this.delaySecond = delaySecond;
	}
	public BigDecimal getHighestPrice() {
		return highestPrice;
	}
	public void setHighestPrice(BigDecimal highestPrice) {
		this.highestPrice = highestPrice;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getSysDate() {
		return sysDate;
	}
	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}
	public String getPmhName() {
		return pmhName;
	}
	public void setPmhName(String pmhName) {
		this.pmhName = pmhName;
	}
	public Integer getPmhType() {
		return pmhType;
	}
	public void setPmhType(Integer pmhType) {
		this.pmhType = pmhType;
	}
	public String getAuctionPlatform() {
		return auctionPlatform;
	}
	public void setAuctionPlatform(String auctionPlatform) {
		this.auctionPlatform = auctionPlatform;
	}
	public String getGoodsAccessory() {
		return goodsAccessory;
	}
	public void setGoodsAccessory(String goodsAccessory) {
		this.goodsAccessory = goodsAccessory;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
