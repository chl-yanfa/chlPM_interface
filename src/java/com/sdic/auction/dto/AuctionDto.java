package com.sdic.auction.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class AuctionDto {
    private String id;
    private String dealMid;             //商户id
    private String orderId;             //订单ID
    private String orderNo;             //订单编号
    private Date dealTime;              //成交时间
    private Date payTime;               //付款时间
    private Date takeCarTime;           //提货时间
    private Integer auctionType;		//拍品类型(0:全车配件,1:高价值配件,2:大宗物资)
    private String auctionTypeS;
    private String auctionNo;			//拍品编号
    private String vin;					//车架号
    private String fullName;			//拍品名称
    private String licenseNumber;		//车牌号
    private String lotAreas;			//所在地区
    private Integer lotAreasId;			//所在地区
    private List<Integer> lotAreasArr;
    private List<Integer> auctionTypeArr;
    private Date productionDate;		//出厂日期
    private String isHasKey;			//是否有钥匙 0-没有,1-有
    private String description;			//描述
    private String buyRequirement;		//购买要求
    private String lookContacts;		//看货联系人
    private String lookContactNumber;	//看货联系人手机号
    private String lookAddress;			//看货地址
    private String lookCoordinate;		//看货地址经纬度
    private String bidNotice;			//竞价须知
    private String specialNotice;		//特别提示
    private Integer isDelete;			//是否删除(0:有效,1:删除)
    private Date createTime;			//创建时间
    private String createUser;
    private BigDecimal startingPrice;     //起拍价
    private String orderState;           //订单状态id
    private String orderStateS;          //订单状态名称
    private BigDecimal commission;		//佣金
    private BigDecimal otherPrice;        //其他费用
    private List<AuctionFileDto> auctionFileList;    //图片集合
    private String imgPath;				//列表头像
	private Integer pageNum;                //页数
	private Integer rows;                 //每页显示行数
	private Date auctionStartTime;            //拍卖开始时间
	private Date auctionEndTime;              //拍卖结束时间
	private int type;
	private Integer lotPartsCount;   //新增拍品数量
    private String partsWeight;   //重量
    
	public Date getAuctionEndTime() {
		return auctionEndTime;
	}
	public void setAuctionEndTime(Date auctionEndTime) {
		this.auctionEndTime = auctionEndTime;
	}
	private Integer delaySecond = 0;			//系统延时秒数 
	private BigDecimal highestPrice;			//当前出价最高价
	private BigDecimal totalPrice;				//当前合手价
	private List<CarScrapOrderAutopartsDto> autopartsList;    //配件列表
	private Date  sysDate;
	
	private String carNumber;                 //车牌号
	private Integer partsCount;              //配件数量
	private BigDecimal orderAmount;          //订单金额
	private Date recoveryTime;               //回收时间
	private Date settlementTime;             //结算时间
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getAuctionType() {
		return auctionType;
	}
	public void setAuctionType(Integer auctionType) {
		this.auctionType = auctionType;
	}
	public String getAuctionTypeS() {
		return auctionTypeS;
	}
	public void setAuctionTypeS(String auctionTypeS) {
		this.auctionTypeS = auctionTypeS;
	}
	public String getAuctionNo() {
		return auctionNo;
	}
	public void setAuctionNo(String auctionNo) {
		this.auctionNo = auctionNo;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getLotAreas() {
		return lotAreas;
	}
	public void setLotAreas(String lotAreas) {
		this.lotAreas = lotAreas;
	}
	public Integer getLotAreasId() {
		return lotAreasId;
	}
	public void setLotAreasId(Integer lotAreasId) {
		this.lotAreasId = lotAreasId;
	}
	public Date getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	public String getIsHasKey() {
		return isHasKey;
	}
	public void setIsHasKey(String isHasKey) {
		this.isHasKey = isHasKey;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBuyRequirement() {
		return buyRequirement;
	}
	public void setBuyRequirement(String buyRequirement) {
		this.buyRequirement = buyRequirement;
	}
	public String getLookContacts() {
		return lookContacts;
	}
	public void setLookContacts(String lookContacts) {
		this.lookContacts = lookContacts;
	}
	public String getLookContactNumber() {
		return lookContactNumber;
	}
	public void setLookContactNumber(String lookContactNumber) {
		this.lookContactNumber = lookContactNumber;
	}
	public String getLookAddress() {
		return lookAddress;
	}
	public void setLookAddress(String lookAddress) {
		this.lookAddress = lookAddress;
	}
	public String getLookCoordinate() {
		return lookCoordinate;
	}
	public void setLookCoordinate(String lookCoordinate) {
		this.lookCoordinate = lookCoordinate;
	}
	public String getBidNotice() {
		return bidNotice;
	}
	public void setBidNotice(String bidNotice) {
		this.bidNotice = bidNotice;
	}
	public String getSpecialNotice() {
		return specialNotice;
	}
	public void setSpecialNotice(String specialNotice) {
		this.specialNotice = specialNotice;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public BigDecimal getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(BigDecimal startingPrice) {
		this.startingPrice = startingPrice;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public String getOrderStateS() {
		return orderStateS;
	}
	public void setOrderStateS(String orderStateS) {
		this.orderStateS = orderStateS;
	}
	public BigDecimal getCommission() {
		return commission;
	}
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}
	
	public BigDecimal getOtherPrice() {
		return otherPrice;
	}
	public void setOtherPrice(BigDecimal otherPrice) {
		this.otherPrice = otherPrice;
	}
	public List<AuctionFileDto> getAuctionFileList() {
		return auctionFileList;
	}
	public void setAuctionFileList(List<AuctionFileDto> auctionFileList) {
		this.auctionFileList = auctionFileList;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
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
	public Date getAuctionStartTime() {
		return auctionStartTime;
	}
	public void setAuctionStartTime(Date auctionStartTime) {
		this.auctionStartTime = auctionStartTime;
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
	public List<CarScrapOrderAutopartsDto> getAutopartsList() {
		return autopartsList;
	}
	public void setAutopartsList(List<CarScrapOrderAutopartsDto> autopartsList) {
		this.autopartsList = autopartsList;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getSysDate() {
		return sysDate;
	}
	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getDealTime() {
		return dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getTakeCarTime() {
		return takeCarTime;
	}
	public void setTakeCarTime(Date takeCarTime) {
		this.takeCarTime = takeCarTime;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDealMid() {
		return dealMid;
	}
	public void setDealMid(String dealMid) {
		this.dealMid = dealMid;
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
	public List<Integer> getLotAreasArr() {
		return lotAreasArr;
	}
	public void setLotAreasArr(List<Integer> lotAreasArr) {
		this.lotAreasArr = lotAreasArr;
	}
	public List<Integer> getAuctionTypeArr() {
		return auctionTypeArr;
	}
	public void setAuctionTypeArr(List<Integer> auctionTypeArr) {
		this.auctionTypeArr = auctionTypeArr;
	}
	public Integer getLotPartsCount() {
		return lotPartsCount;
	}
	public void setLotPartsCount(Integer lotPartsCount) {
		this.lotPartsCount = lotPartsCount;
	}
	public String getPartsWeight() {
		return partsWeight;
	}
	public void setPartsWeight(String partsWeight) {
		this.partsWeight = partsWeight;
	}
	
}