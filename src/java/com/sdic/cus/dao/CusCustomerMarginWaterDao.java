package com.sdic.cus.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.common.Identities;
import com.sdic.cus.entity.CusCustomerMarginWater;

@Component
public class CusCustomerMarginWaterDao{

	@Autowired 
	private BaseDao baseDao;

	/**
	 * 创建保证金流水
	 * @param cusCustomerMarginWater
	 * @return
	 */
	public int createCusCustomerMarginWater(CusCustomerMarginWater cusCustomerMarginWater){
		cusCustomerMarginWater.setId(Identities.uuid2());
		return baseDao.create("mapper.standard.CusCustomerMarginWaterMapper.insertCusCustomerMarginWater", cusCustomerMarginWater);
	}	
	
	public List<CusCustomerMarginWater> findCusCustomerMarginWaterByMember(Map<String,Object> data){
		return baseDao.findList("mapper.standard.CusCustomerMarginWaterMapper.findCusCustomerMarginWaterByMember", data);
	}
	/**
	 * 功能描述：会员中心-获取我的流水记录-总数
	 * 输入参数： memberCode：用户编号  operatorType:操作类型
	 * 返 回 值：TraHighestBid
	 * 创 建 人： 
	 * 日    期：
	 * 修 改 人： 
	 * 日    期：
	 * 修 改描述：
	 **/
	public Integer findCusCustomerMarginWaterByMemberCount(Map<String,Object> data){
		return baseDao.findOne("mapper.standard.CusCustomerMarginWaterMapper.findCusCustomerMarginWaterByMemberCount", data);
	}
	
	
	
	public List<CusCustomerMarginWater> findCusCustomerMarginWater(CusCustomerMarginWater cusCustomerMarginWater){
		return baseDao.findList("mapper.standard.CusCustomerMarginWaterMapper.findCusCustomerMarginWater", cusCustomerMarginWater);
	}
}