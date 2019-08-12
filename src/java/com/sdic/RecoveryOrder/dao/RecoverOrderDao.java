package com.sdic.RecoveryOrder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.RecoveryOrder.dto.RecoverOrderDto;
import com.sdic.common.BaseDao;

@Component
public class RecoverOrderDao {
	
	@Autowired 
	private BaseDao baseDao;
	
	public RecoverOrderDto getRecoverOrderDetails(String id){
		return baseDao.findOne("mapper.standard.RecoverOrderMapper.getRecoverOrderDetails", id);
	}

}
