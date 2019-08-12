package com.sdic.personal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.personal.dto.TradeDTO;
import com.sdic.personal.entity.TradeFlow;

@Component
public class TradeDao {
	
	@Autowired 
	private BaseDao baseDao;
	
	/**
	 * getTradeFlow 交易明细
	 * @param params
	 * @return
	 */
	public List<TradeFlow> getTradeFlow(TradeDTO params){
		Integer pageNum = 1;
		Integer rows = 10;
		if(params!=null&&params.getPageNum()!=null) {
			pageNum = params.getPageNum();
		}
		if(params!=null&&params.getRows()!=null) {
			rows = params.getRows();
		}
		return baseDao.findList("mapper.standard.TradeMapper.getTradeFlow", params,pageNum,rows);
	}
	
	/**
	 * getTradeFlowTotal 交易明细总条数
	 * @param params
	 * @return
	 */
	public int getTradeFlowTotal(TradeDTO params){
		return baseDao.findOne("mapper.standard.TradeMapper.getTradeFlowTotal", params);
	}

}
