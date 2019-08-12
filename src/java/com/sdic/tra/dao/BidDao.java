package com.sdic.tra.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.tra.dto.BidDto;
import com.sdic.tra.dto.OrderInfoDto;

@Component
public class BidDao {
	
	@Autowired 
	private BaseDao baseDao;
	
	public OrderInfoDto getOrderInfo(BidDto bidDto){
		return baseDao.findOne("mapper.standard.BidMapper.getOrderInfo", bidDto);
	}

}
