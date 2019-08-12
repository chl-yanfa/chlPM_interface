package com.sdic.admin.entity;

import java.util.Date;

/**
 * 项目名称：	sdicPM_interface
 * 类名称：	MemberExam
 * 类描述：
 * 创建人：	zhangwanxin
 * 创建时间： 	2018年12月6日 下午5:23:26
 */
public class MemberExam {
	private Integer id;					//审核id
    private Integer uid;				//用户id
    private Date examMemberDate;		//审核日期
    private String aidName;				//审核人
    private Integer authentication;		//审核状态  0：未实名；1：正在审核； 2：已实名；-3：证件已过期（30天）；-2：证件过期；-1：审核驳回
    private String authenticationReason;//备注
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
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
	public Integer getAuthentication() {
		return authentication;
	}
	public void setAuthentication(Integer authentication) {
		this.authentication = authentication;
	}
	public String getAuthenticationReason() {
		return authenticationReason;
	}
	public void setAuthenticationReason(String authenticationReason) {
		this.authenticationReason = authenticationReason;
	}
	
}
