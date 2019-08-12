package com.sdic.cus.entity;

import java.util.Date;

public class CustomerInfo {
	
	private String memberName = "";
	private String memberProp = "";
	private String channelManager = "";
	private String telephone = "";
	private String otherPhone = "";
	private String busiMode = "";
	private String provinceName = "";
	private String userEmail = "";
	private String locked = "";
	private String buyerLevel = "";
	private String sellerLevel = "";
	private String utag = "";
	private String memo = "";
	private Date createdDate;
	private Date audotDate;
	private String auditUserName = "";
	private String smsChecked = "";
	private String sendTag = "";
	private String userStatus = "";
	private String birthday = "";
	private String gender = "";
	private String cityName = "";
	private String age = "";
	private String areaId = "";
	private String deleteTag = "";
	private Date ts;
	private String timeliness = "";
	private String reservedField1 = "";
	private String reservedField2 = "";
	private String reservedField3 = "";
	private String reservedField4 = "";
	private String reservedField5 = "";
	private String memberCode = "";
	private String memberNum = "";	//商户编号 如：1号商户 2号商户
	private String userType = "";
	private String userName = "";
	private String userPass = "";
	private String contactType = "";
	private String contactCode = "";
	private String isCompany = "";
	private String companyName = "";
	private String companyTel = "";
	private String companyAddr = "";
	private String realName = "";
	private String userMobile = "";
	private String userImg = "";	//用户头像名称
	
	
	private String buyerMoney = "";
	private String buyerFreeze = "";
	private String usableMargin = "";
	private String oldPass = "";
	private String newPass = "";
	
	private String operatorType = "";
	private Integer pageNum;
	private Integer menu;
	private String showId = "";//默认打开公告的ID
	private String operatorTimeRang = "";//时间范围
	//等级升级后是否已提示
	private String upgradeHinted = "";
	private String grade = "";
	private String customerLevel = "";	//商户等级 L01=专业商户 L02=临时商户
	private String resId = "";			//移动端极光ID
	
	private Integer type;				//身份证类型
	private String fax;					//身份证号码
	private String frontIdcard;			//身份证前照
	private String backIdcard;			//身份证后照
	private String handIdcard;			//手持身份证
	private Integer authentication;		//审核状态  0：未实名；1：正在审核； 2：已实名；-3：证件已过期（30天）；-2：证件过期；-1：审核驳回
	private Long validity;				//身份证有效期
	private Date examMemberDate;		//审核时间
	private String aidName;				//审核人
	public String getMemberCode(){
		return memberCode;
	}
	public void setMemberCode(String memberCode){
		this.memberCode = memberCode;
	}
	public String getUserType(){
		return userType;
	}
	public void setUserType(String userType){
		this.userType = userType;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserPass(){
		return userPass;
	}
	public void setUserPass(String userPass){
		this.userPass = userPass;
	}
	public String getContactType(){
		return contactType;
	}
	public void setContactType(String contactType){
		this.contactType = contactType;
	}
	public String getContactCode(){
		return contactCode;
	}
	public void setContactCode(String contactCode){
		this.contactCode = contactCode;
	}
	public String getIsCompany(){
		return isCompany;
	}
	public void setIsCompany(String isCompany){
		this.isCompany = isCompany;
	}
	public String getCompanyName(){
		return companyName;
	}
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	public String getCompanyTel(){
		return companyTel;
	}
	public void setCompanyTel(String companyTel){
		this.companyTel = companyTel;
	}
	public String getCompanyAddr(){
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr){
		this.companyAddr = companyAddr;
	}
	public String getRealName(){
		return realName;
	}
	public void setRealName(String realName){
		this.realName = realName;
	}
	public String getUserMobile(){
		return userMobile;
	}
	public void setUserMobile(String userMobile){
		this.userMobile = userMobile;
	}
	public String getUserEmail(){
		return userEmail;
	}
	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}
	public String getLocked(){
		return locked;
	}
	public void setLocked(String locked){
		this.locked = locked;
	}
	public String getBuyerLevel(){
		return buyerLevel;
	}
	public void setBuyerLevel(String buyerLevel){
		this.buyerLevel = buyerLevel;
	}
	public String getSellerLevel(){
		return sellerLevel;
	}
	public void setSellerLevel(String sellerLevel){
		this.sellerLevel = sellerLevel;
	}
	public String getUtag(){
		return utag;
	}
	public void setUtag(String utag){
		this.utag = utag;
	}
	public String getMemo(){
		return memo;
	}
	public void setMemo(String memo){
		this.memo = memo;
	}
	public java.util.Date getCreatedDate(){
		return createdDate;
	}
	public void setCreatedDate(java.util.Date createdDate){
		this.createdDate = createdDate;
	}
	public java.util.Date getAudotDate(){
		return audotDate;
	}
	public void setAudotDate(java.util.Date audotDate){
		this.audotDate = audotDate;
	}
	public String getAuditUserName(){
		return auditUserName;
	}
	public void setAuditUserName(String auditUserName){
		this.auditUserName = auditUserName;
	}
	public String getSmsChecked(){
		return smsChecked;
	}
	public void setSmsChecked(String smsChecked){
		this.smsChecked = smsChecked;
	}
	public String getSendTag(){
		return sendTag;
	}
	public void setSendTag(String sendTag){
		this.sendTag = sendTag;
	}
	public String getUserStatus(){
		return userStatus;
	}
	public void setUserStatus(String userStatus){
		this.userStatus = userStatus;
	}
	public String getBirthday(){
		return birthday;
	}
	public void setBirthday(String birthday){
		this.birthday = birthday;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAge(){
		return age;
	}
	public void setAge(String age){
		this.age = age;
	}
	public String getAreaId(){
		return areaId;
	}
	public void setAreaId(String areaId){
		this.areaId = areaId;
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
	public String getReservedField3(){
		return reservedField3;
	}
	public void setReservedField3(String reservedField3){
		this.reservedField3 = reservedField3;
	}
	public String getReservedField4(){
		return reservedField4;
	}
	public void setReservedField4(String reservedField4){
		this.reservedField4 = reservedField4;
	}
	public String getReservedField5(){
		return reservedField5;
	}
	public void setReservedField5(String reservedField5){
		this.reservedField5 = reservedField5;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberProp() {
		return memberProp;
	}
	public void setMemberProp(String memberProp) {
		this.memberProp = memberProp;
	}
	public String getChannelManager() {
		return channelManager;
	}
	public void setChannelManager(String channelManager) {
		this.channelManager = channelManager;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getOtherPhone() {
		return otherPhone;
	}
	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}
	public String getBusiMode() {
		return busiMode;
	}
	public void setBusiMode(String busiMode) {
		this.busiMode = busiMode;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getBuyerMoney() {
		return buyerMoney;
	}
	public void setBuyerMoney(String buyerMoney) {
		this.buyerMoney = buyerMoney;
	}
	public String getBuyerFreeze() {
		return buyerFreeze;
	}
	public void setBuyerFreeze(String buyerFreeze) {
		this.buyerFreeze = buyerFreeze;
	}
	public String getUsableMargin() {
		return usableMargin;
	}
	public void setUsableMargin(String usableMargin) {
		this.usableMargin = usableMargin;
	}
	public String getOldPass() {
		return oldPass;
	}
	public void setOldPass(String oldPass) {
		this.oldPass = oldPass;
	}
	public String getNewPass() {
		return newPass;
	}
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}
	public String getOperatorType() {
		return operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getMenu() {
		return menu;
	}
	public void setMenu(Integer menu) {
		this.menu = menu;
	}
	public String getShowId() {
		return showId;
	}
	public void setShowId(String showId) {
		this.showId = showId;
	}
	public String getOperatorTimeRang() {
		return operatorTimeRang;
	}
	public void setOperatorTimeRang(String operatorTimeRang) {
		this.operatorTimeRang = operatorTimeRang;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public String getUpgradeHinted() {
		return upgradeHinted;
	}
	public void setUpgradeHinted(String upgradeHinted) {
		this.upgradeHinted = upgradeHinted;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}
	public String getResId() {
		return resId;
	}
	public void setResId(String resId) {
		this.resId = resId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getFrontIdcard() {
		return frontIdcard;
	}
	public void setFrontIdcard(String frontIdcard) {
		this.frontIdcard = frontIdcard;
	}
	public String getBackIdcard() {
		return backIdcard;
	}
	public void setBackIdcard(String backIdcard) {
		this.backIdcard = backIdcard;
	}
	public String getHandIdcard() {
		return handIdcard;
	}
	public void setHandIdcard(String handIdcard) {
		this.handIdcard = handIdcard;
	}
	public Integer getAuthentication() {
		return authentication;
	}
	public void setAuthentication(Integer authentication) {
		this.authentication = authentication;
	}
	public Long getValidity() {
		return validity;
	}
	public void setValidity(Long validity) {
		this.validity = validity;
	}
	public Date getExamMemberDate() {
		return examMemberDate;
	}
	public void setExamMemberDate(Date examMemberDate) {
		this.examMemberDate = examMemberDate;
	}
	public String getAidName() {
		return aidName;
	}
	public void setAidName(String aidName) {
		this.aidName = aidName;
	}

	
}
