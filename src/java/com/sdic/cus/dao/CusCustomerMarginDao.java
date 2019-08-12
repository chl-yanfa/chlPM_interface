package com.sdic.cus.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.cus.entity.CusCustomerMargin;

@Component
public class CusCustomerMarginDao{

	@Autowired 
	private BaseDao baseDao;
	
	/**
	 * 冻结保证金
	 * @param cusCustomerMargin
	 * @return
	 */
	public int freezeCusCustomerMargin(CusCustomerMargin cusCustomerMargin){
		return baseDao.update("mapper.standard.CusCustomerMarginMapper.updateCusCustomerMargin", cusCustomerMargin);
	}
	
	/**
	 * 解冻保证金
	 * @param cusCustomerMargin
	 * @return
	 */
	public int updateCusCustomerMarginUnlock(CusCustomerMargin cusCustomerMargin){
		return baseDao.update("mapper.standard.CusCustomerMarginMapper.updateCusCustomerMarginUnlock", cusCustomerMargin);
	}
	
	/**
	 * 获取我的保证金余额
	 * @param cusCustomerMargin
	 * @return  
	 */
	public CusCustomerMargin getCusCustomerMarginByMember(CusCustomerMargin cusCustomerMargin){
		cusCustomerMargin.setDeleteTag("0");
		return baseDao.findOne("mapper.standard.CusCustomerMarginMapper.getCusCustomerMarginByMember", cusCustomerMargin);
	}
}