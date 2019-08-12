package com.sdic.personal.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.sdic.common.JsonDateSerializer;

/**
 * 项目名称：	sdicPM_interface
 * 类名称：	Customer
 * 类描述：
 * 创建人：	zhangwanxin
 * 创建时间：	2018年12月3日 下午7:09:47
 */
public class PersonalInfo {
	private String memberCode;
	private String memberName;
	private String memberNo;
	private String mobile;
	private Integer type;				//证件类型 0-身份证
	private String realName;			//真实名字
	private String fax;					//身份证号码
	private Long validity;				//身份证有效期
	private String frontIdcard;
	private String backIdcard;
	private String handIdcard;
	private Integer authentication;		//审核状态  0：未实名；1：正在审核； 2：已实名；-3：证件已过期（30天）；-2：证件过期；-1：审核驳回
	private Date examMemberDate;		//审核时间
	private String aidName;				//审核人
	
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
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
	public Long getValidity() {
		return validity;
	}
	public void setValidity(Long validity) {
		this.validity = validity;
	}
	public String getValidityDate() {
		if(validity==null)
			return null;
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(validity));
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
	@JsonSerialize(using = JsonDateSerializer.class)
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
