package com.sdic.cus.standard.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdic.cus.dao.CusCustomerInfoDao;
import com.sdic.cus.entity.CustomerInfo;



@Service
public class CusCustomerLoginService {
	
	@Autowired
	private CusCustomerInfoDao cusCustomerInfoDao;

	
	/**
	 * 根据登录账户和密码获取用户信息
	 * @param user MAP类型，2个key，一个loginId 一个password
	 * @return
	 */
	public CustomerInfo getByLoginIdAndPassword(Map<String,String> userLoginInfo){
		return cusCustomerInfoDao.getByLoginIdAndPassword(userLoginInfo);
	}

}
