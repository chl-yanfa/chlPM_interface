package com.sdic.cus.dto;

public class CustomerInfoDTO {
	private String memberCode;
	
	private String userName;
	private String memberName;
	private String realName;
	private String loginId;
	private String password;
	private String kaptcha;
	private String deviceType;		//设备类型1: PC, 2:安卓手机，3:苹果手机，4:安卓PAID，5:苹果PAID
	private String browser;
	private String upgradeHinted;
	private String grade;
	private String timeliness;		//0是有效数据，1是测试数据
	private String memberNum;		// 商户编号 如：1号商户 2号商户
	private String reservedField2;	// 是否为优质商户  0：优质商户   其它：普通商户  add by zhangys 2015-3-9
	private String versionNo;
	private String versionType;
	private String customerLevel;	//商户等级 L01=专业商户 L02=临时商户
	private String loginLogId;		//登录日志唯一ID
	private String resId;			//移动端极光ID
	
	public String getReservedField2() {
		return reservedField2;
	}

	public void setReservedField2(String reservedField2) {
		this.reservedField2 = reservedField2;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getKaptcha() {
		return kaptcha;
	}

	public void setKaptcha(String kaptcha) {
		this.kaptcha = kaptcha;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
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

	public String getTimeliness() {
		return timeliness;
	}

	public void setTimeliness(String timeliness) {
		this.timeliness = timeliness;
	}

	public String getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getVersionType() {
		return versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

	public String getCustomerLevel() {
		return customerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

	public String getLoginLogId() {
		return loginLogId;
	}

	public void setLoginLogId(String loginLogId) {
		this.loginLogId = loginLogId;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}
	
}
