package com.sdic.personal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.personal.entity.Account;
import com.sdic.personal.entity.PersonalInfo;

@Component
public class PersonalDao {
	
	@Autowired 
	private BaseDao baseDao;
	
	/**
	 * 根据memberCode获取用户信息
	 * @param uid
	 * @return
	 */
	public Account getAccountByUid(String uid){
		return baseDao.findOne("mapper.standard.PersonalMapper.getAccountByUid", uid);
	}
	
	/**
	 * 根据memberCode获取用户信息
	 * @param uid
	 * @return
	 */
	public PersonalInfo getPersonalInfo(String uid){
		return baseDao.findOne("mapper.standard.PersonalMapper.getPersonalInfo", uid);
	}

}
