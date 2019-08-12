package com.sdic.cus.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.cus.entity.CustomerInfo;

@Component
public class CusCustomerInfoDao {
	
	@Autowired 
	private BaseDao baseDao;
	
	/**
	 * 根据用户账号和密码获取用户信息
	 * @param userLoginInfo
	 * @return
	 */
	public CustomerInfo getByLoginIdAndPassword(Map<String,String> userLoginInfo){
		   CustomerInfo customerInfo = baseDao.findOne("mapper.standard.CusCustomerInfoMapper.getByLoginIdAndPassword", userLoginInfo);
		return customerInfo;
	}
	
	/**
	 * 根据memberCode获取用户信息
	 * @param memberCode
	 * @return
	 */
	public CustomerInfo getCustomerByMemberCode(String memberCode){
		return  baseDao.findOne("mapper.standard.CusCustomerInfoMapper.getCustomerByMemberCode", memberCode);
	}
	
	/**
	 * 根据memberCode获取用户密码--用户修改密码校验
	 * @param userLoginInfo
	 * @return
	 */
	public String getCustomerPwd(String memberCode){
		return baseDao.findOne("mapper.standard.CusCustomerInfoMapper.getCustomerPwd", memberCode);
	}
	
	public String getCode(String newPhone){
		return baseDao.findOne("mapper.standard.CusCustomerInfoMapper.getCode", newPhone);
	}
	
	public String getMobile(String newPhone){
		return baseDao.findOne("mapper.standard.CusCustomerInfoMapper.getMobile", newPhone);
	}
	
	public String getMaxUid(){
		return baseDao.findOne("mapper.standard.CusCustomerInfoMapper.getMaxUid");
	}
	
	/**
	 * updateUserPass 用户修改密码
	 * @param map
	 * @return
	 */
	public int updateUserPass(Map<String,Object> map){
		return baseDao.update("mapper.standard.CusCustomerInfoMapper.updateUserPass", map);
	}
	
	public int updateUserPhone(Map<String,Object> map){
		return baseDao.update("mapper.standard.CusCustomerInfoMapper.updateUserPhone", map);
	}
	
	public void register(Map<String,Object> map){
		 baseDao.create("mapper.standard.CusCustomerInfoMapper.register", map);
	}
	
	public int forgetPassword(Map<String,Object> map){
		return baseDao.create("mapper.standard.CusCustomerInfoMapper.forgetPassword", map);
	}
	
	/**
	 * updateCertification 更新实名认证
	 * @param customerInfo
	 * @return
	 */
	public int updateCertification(CustomerInfo customerInfo){
		return baseDao.update("mapper.standard.CusCustomerInfoMapper.updateCertification", customerInfo);
	}
	
	/**
	 * updateCertificationAudit 更新实名认证审核结果
	 * @param customerInfo
	 * @return
	 */
	public int updateCertificationAudit(CustomerInfo customerInfo){
		return baseDao.update("mapper.standard.CusCustomerInfoMapper.updateCertificationAudit", customerInfo);
	}

}
