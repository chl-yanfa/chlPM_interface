package com.sdic.admin.standard.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdic.admin.dao.MemberExamDao;
import com.sdic.admin.entity.MemberExam;
import com.sdic.common.Constants;
import com.sdic.common.ResultDTO;
import com.sdic.cus.dao.CusCustomerInfoDao;
import com.sdic.cus.dto.CustomerInfoDTO;
import com.sdic.cus.entity.CustomerInfo;
import com.sdic.personal.dao.PersonalDao;
import com.sdic.personal.entity.PersonalInfo;

/**
 * 项目名称：	sdicPM_interface
 * 类名称：	AdminService
 * 类描述：	逻辑层
 * 创建人：	zhangwanxin
 * 创建时间：	2018年12月6日17:11:19
 */
@Service
public class AdminService {
	
	@Autowired
	PersonalDao personalDao;
	@Autowired
	CusCustomerInfoDao cusCustomerInfoDao;
	@Autowired
	MemberExamDao memberExamDao;
	@Transactional
	public ResultDTO<String> auditCertification(MemberExam param,HttpServletRequest request){
		ResultDTO<String> res = new ResultDTO<String>();
		if(null==param||null==param.getUid()||null==param.getAuthentication()) {
			res.setReturnCode(Constants.RETURN_CODE_PARAMETER_NULL);
			res.setReturnMsg("参数不足");
			return res;
		}
		CustomerInfoDTO dto = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
		if(dto==null) {
			res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
			res.setReturnMsg("未检测到登陆信息");
			return res;
		}
		String memberCode = dto.getMemberCode();
		CustomerInfo customer = cusCustomerInfoDao.getCustomerByMemberCode(memberCode);
		PersonalInfo personal = personalDao.getPersonalInfo(param.getUid()+"");
		
		//更新实名认证审核
		CustomerInfo updateParam = new CustomerInfo();
		updateParam.setMemberCode(personal.getMemberCode());
		updateParam.setAuthentication(param.getAuthentication());
		updateParam.setAidName(customer.getMemberName());
		cusCustomerInfoDao.updateCertificationAudit(updateParam);
		//新增实名认证审核记录
		param.setId(memberExamDao.getMemberExamId());
		param.setAidName(customer.getMemberName());
		memberExamDao.addMemberExam(param);
		
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg("审核成功");
		return res;
	}
}
