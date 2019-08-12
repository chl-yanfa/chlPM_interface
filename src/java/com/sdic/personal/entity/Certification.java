package com.sdic.personal.entity;

import java.util.Date;

/**
 * 项目名称：sdicPM_interface
 * 类名称：Certification
 * 类描述：
 * 创建人：zhangwanxin
 * 创建时间： 2018年12月3日 下午7:12:19
 */
public class Certification {
	private Integer type;				//证件类型 0-身份证
	private String realName;			//真实名字
	private String fax;					//身份证号码
	private Date validityDate;
	private Long validity;				//身份证有效期
	private String frontIdcard;
	private String backIdcard;
	private String handIdcard;
	private Integer authentication;		//审核状态  0：未实名；1：正在审核； 2：已实名；-3：证件已过期（30天）；-2：证件过期；-1：审核驳回
	private Date examMemberDate;		//审核时间
	private String aidName;				//审核人
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Date getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}
	public Long getValidity() {
		return validity;
	}
	public void setValidity(Long validity) {
		this.validity = validity;
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
