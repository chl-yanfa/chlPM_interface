package com.sdic.tra.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.common.Identities;
import com.sdic.tra.entity.TraHighestBid;

@Component
public class TraHighestBidDao{

	@Autowired 
	private BaseDao baseDao;
	
	/**
	 * 获取当前车辆的最高价
	 * @param traHighestBid
	 * @return
	 */
	public TraHighestBid getTraHighestBidByCar(TraHighestBid traHighestBid){
		return baseDao.findOne("mapper.standard.TraHighestBidMapper.getTraHighestBidByCar", traHighestBid);
	}
	/**
	 * 更改车辆的最高价
	 * @param parentOrderTraHighest
	 * @return
	 */
	public synchronized int updateTraHighestBidByCar(TraHighestBid parentOrderTraHighest){
		return baseDao.update("mapper.standard.TraHighestBidMapper.updateTraHighestBidByCar", parentOrderTraHighest);
	}
	/**
	 * 保存当前订单的最高价
	 * @param traHighestBid
	 * @return
	 */
	public synchronized int createTraHighestBid(TraHighestBid traHighestBid){
		traHighestBid.setId(Identities.uuid2());
		return baseDao.create("mapper.standard.TraHighestBidMapper.insertTraHighestBid", traHighestBid);
	}	
	/**
	 * 会员中心-获取我未解冻保证金及相关信息
	 * @param traHighestBid
	 * @return
	 */
	public List<TraHighestBid> getNotThaw(Map<String,Object> data){
		return baseDao.findList("mapper.standard.TraHighestBidMapper.getNotThaw", data);
	}
	/**
	 * 会员中心-获取我未解冻保证金及相关信息-总数
	 * @param traHighestBid
	 * @return
	 */
	public Integer getNotThawCount(Map<String,Object> data){
		return baseDao.findOne("mapper.standard.TraHighestBidMapper.getNotThawCount", data);
	}

}