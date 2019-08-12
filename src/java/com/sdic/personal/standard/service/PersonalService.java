package com.sdic.personal.standard.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdic.common.Constants;
import com.sdic.common.ResultDTO;
import com.sdic.cus.dao.CusCustomerInfoDao;
import com.sdic.cus.dto.CustomerInfoDTO;
import com.sdic.cus.entity.CustomerInfo;
import com.sdic.personal.dao.PersonalDao;
import com.sdic.personal.dao.TradeDao;
import com.sdic.personal.dto.TradeDTO;
import com.sdic.personal.entity.Account;
import com.sdic.personal.entity.Certification;
import com.sdic.personal.entity.PersonalInfo;
import com.sdic.personal.entity.TradeFlow;

/**
 * 项目名称：	sdicPM_interface
 * 类名称：	PersonalService
 * 类描述：	个人中心逻辑层
 * 创建人：	zhangwanxin
 * 创建时间：	2018年12月3日 下午6:35:13
 */
@Service
public class PersonalService {
	
	@Autowired
	PersonalDao personalDao;
	@Autowired
	CusCustomerInfoDao cusCustomerInfoDao;
	@Autowired
	TradeDao tradeDao;
	
	public ResultDTO<Account> myAccount(HttpServletRequest request){
		ResultDTO<Account> res = new ResultDTO<Account>();
		CustomerInfoDTO customerInfo = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
		if(customerInfo==null) {
			res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
			res.setReturnMsg("未检测到登陆信息");
			return res;
		}
		String memberCode = customerInfo.getMemberCode();
		Account account = personalDao.getAccountByUid(memberCode);
		res.setEntity(account);
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg("成功");
		return res;
	}
	
	public ResultDTO<PersonalInfo> getPersonalInfo(HttpServletRequest request){
		ResultDTO<PersonalInfo> res = new ResultDTO<PersonalInfo>();
		CustomerInfoDTO customerInfo = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
		if(customerInfo==null) {
			res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
			res.setReturnMsg("未检测到登陆信息");
			return res;
		}
		String memberCode = customerInfo.getMemberCode();
		PersonalInfo personalInfo = personalDao.getPersonalInfo(memberCode);
		res.setEntity(personalInfo);
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg("成功");
		return res;
	}
	
	@Transactional
	public ResultDTO<String> changeOnesPwd(Map<String, String> conditions,HttpServletRequest request,HttpServletResponse response){
		ResultDTO<String> res = new ResultDTO<String>();
		String index = String.valueOf(conditions.get("index"));
		if(index.equals("0")){
			if(null==conditions||StringUtils.isBlank(conditions.get("oldPwd"))
					||StringUtils.isBlank(conditions.get("newPwd"))
					||StringUtils.isBlank(conditions.get("newPwd2"))
					||StringUtils.isBlank(index)) {
				res.setReturnCode(Constants.RETURN_CODE_PARAMETER_NULL);
				res.setReturnMsg("参数不足");
				return res;
			}
			
			String oldPwd = conditions.get("oldPwd");
			String newPwd = conditions.get("newPwd");
			String newPwd2 = conditions.get("newPwd2");
			if(!newPwd.equals(newPwd2)) {
				res.setReturnCode("000001");
				res.setReturnMsg("两次密码不一致");
				return res;
			}
			CustomerInfoDTO customerInfo = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
			if(customerInfo==null) {
				res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
				res.setReturnMsg("未检测到登陆信息");
				return res;
			}
			String customerPwd = cusCustomerInfoDao.getCustomerPwd(customerInfo.getMemberCode());
			if (oldPwd.equals(customerPwd)) {
				//修改
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("memberCode", customerInfo.getMemberCode());
				map.put("newPwd", newPwd);
				cusCustomerInfoDao.updateUserPass(map);
				
				if(customerInfo != null){
					
					request.getSession().removeAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
				}
				request.getSession().invalidate();
				Cookie cookie = new Cookie(Constants.CUSTOMER_SESSION_INFO_NAME_COOKIE, null);
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
				
				res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
				res.setReturnMsg("修改密码成功");
				return res;
			}else {
				res.setReturnCode(Constants.RETURN_CODE_PASS_ERROR);
				res.setReturnMsg("密码错误");
				return res;
			}
		}else if(index.equals("1")){
			   
			if(null==conditions||StringUtils.isBlank(conditions.get("newPhone"))
					||StringUtils.isBlank(conditions.get("messageCode"))
					||StringUtils.isBlank(index)) {
				res.setReturnCode(Constants.RETURN_CODE_PARAMETER_NULL);
				res.setReturnMsg("参数不足");
				return res;
			}
			CustomerInfoDTO customerInfo = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
			if(customerInfo==null) {
				res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
				res.setReturnMsg("未检测到登陆信息");
				return res;
			}
			String code = cusCustomerInfoDao.getCode(conditions.get("newPhone"));
			if(code==null || "".equals(code) || code==""){
				res.setReturnCode(Constants.RETURN_CODE_CODE_ERROR);
				res.setReturnMsg("验证码无效");
				return res;
			}else if(conditions.get("messageCode").equals(code)){
				Map<String,Object> map = new HashMap<String, Object>();
				map.put("newPhone", conditions.get("newPhone"));
				map.put("memberCode", customerInfo.getMemberCode());
				cusCustomerInfoDao.updateUserPhone(map);
				if(customerInfo != null){					
					request.getSession().removeAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
				}
				request.getSession().invalidate();
				Cookie cookie = new Cookie(Constants.CUSTOMER_SESSION_INFO_NAME_COOKIE, null);
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
				
				res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
				res.setReturnMsg("修改手机号成功");
			}else{
				res.setReturnCode(Constants.RETURN_CODE_CODE_ERROR);
				res.setReturnMsg("验证码无效");
				return res;
			}	
			   return res;
		}
		return  res;
		
	}
	
	@SuppressWarnings("unused")
	public  ResultDTO<String> registerAndforgetPassword(Map<String, String> conditions,HttpServletRequest request,HttpServletResponse response){
		ResultDTO<String> res = new ResultDTO<String>();
		String index = String.valueOf(conditions.get("index"));
		if(null==conditions||StringUtils.isBlank(conditions.get("phone"))
				||StringUtils.isBlank(conditions.get("password"))
				||StringUtils.isBlank(conditions.get("verCode"))
				||StringUtils.isBlank(index)) {
			res.setReturnCode(Constants.RETURN_CODE_PARAMETER_NULL);
			res.setReturnMsg("参数不足");
			return res;
		}
		String verCode = cusCustomerInfoDao.getCode(conditions.get("phone"));
		if(verCode==null || "".equals(verCode) || verCode==""){
			res.setReturnCode(Constants.RETURN_CODE_CODE_ERROR);
			res.setReturnMsg("验证码无效");
			return res;
		}else if(conditions.get("verCode").equals(verCode)){
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("phone", conditions.get("phone"));
			map.put("password",conditions.get("password"));
			CustomerInfoDTO customerInfo = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
			if(index.equals("0")){
				String mobile = cusCustomerInfoDao.getMobile(conditions.get("phone"));
				String maxUid = cusCustomerInfoDao.getMaxUid()!=null?cusCustomerInfoDao.getMaxUid():"00001";
				if(mobile != null){
					res.setReturnCode(Constants.RETURN_CODE_PHONE_ERROR);
					res.setReturnMsg("该手机号已注册");
					return res;
				}
				   map.put("nickname", "gthl"+maxUid);
					cusCustomerInfoDao.register(map);
					res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
					res.setReturnMsg("注册成功");
					
					if(customerInfo != null){	
						request.getSession().removeAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
					}
					request.getSession().invalidate();
					Cookie cookie = new Cookie(Constants.CUSTOMER_SESSION_INFO_NAME_COOKIE, null);
					cookie.setMaxAge(0);
					cookie.setPath("/");
					response.addCookie(cookie);
					
			}else if(index.equals("1")){
				cusCustomerInfoDao.forgetPassword(map);
				res.setReturnCode(Constants.RETURN_CODE_SUCCESS1);
				res.setReturnMsg("密码重置成功");
			}
			
		}else{
			res.setReturnCode(Constants.RETURN_CODE_CODE_ERROR);
			res.setReturnMsg("验证码无效");
			return res;
		}
		return res;
	}
	
	public ResultDTO<TradeFlow> getTradeFlow(TradeDTO params,HttpServletRequest request){
		ResultDTO<TradeFlow> res = new ResultDTO<TradeFlow>();
		CustomerInfoDTO customerInfo = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
		if(customerInfo==null) {
			res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
			res.setReturnMsg("未检测到登陆信息");
			return res;
		}
		String memberCode = customerInfo.getMemberCode();
		if(null == params) {
			params = new TradeDTO();
		}
		params.setMemberCode(memberCode);
		List<TradeFlow> tradeFlow = tradeDao.getTradeFlow(params);
		int total = tradeDao.getTradeFlowTotal(params);
		res.setRows(tradeFlow);
		res.setTotal(total);
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg("成功");
		return res;
	}
	@Transactional
	public ResultDTO<String> applyCertification(Certification param,HttpServletRequest request){
		ResultDTO<String> res = new ResultDTO<String>();
		if(null==param||null==param.getType()
				||StringUtils.isBlank(param.getRealName())
				||StringUtils.isBlank(param.getFax())
				||null==param.getValidity()
				||StringUtils.isBlank(param.getFrontIdcard())
				||StringUtils.isBlank(param.getBackIdcard())
				||StringUtils.isBlank(param.getHandIdcard())) {
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
		CustomerInfo customer = cusCustomerInfoDao.getCustomerByMemberCode(dto.getMemberCode());
		/*Integer authentication = customer.getAuthentication();
		if(authentication==2) {
			res.setReturnCode("100001");
			res.setReturnMsg("已实名");
			return res;
		}*/
		//更新实名认证
		BeanUtils.copyProperties(param, customer);
		customer.setAuthentication(1);
		cusCustomerInfoDao.updateCertification(customer);
		
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg("提交成功");
		return res;
	}
}
