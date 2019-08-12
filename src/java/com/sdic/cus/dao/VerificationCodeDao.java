package com.sdic.cus.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;


@Component
public class VerificationCodeDao {
	
	@Autowired 
	private BaseDao baseDao;
	
	public void addVerificationCode(Map<String,Object> map) {
		baseDao.create("mapper.standard.VerCodeMapper.addVerificationCode", map);
	}

}
