package com.sdic.offwater.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.offwater.entity.OfferWaterInfo;

@Component
public class OfferWaterDao {
	
	@Autowired 
	private BaseDao baseDao;
	
	public List<OfferWaterInfo> getOfferWaterListByOrderId(String orderId){
		return baseDao.findList("mapper.standard.OfferWaterMapper.getOfferWaterListByOrderId", orderId);
	}
	public int getOfferWaterTotalByOrderId(String orderId){
		return baseDao.findOne("mapper.standard.OfferWaterMapper.getOfferWaterTotalByOrderId", orderId);
	}

}
