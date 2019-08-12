package com.sdic.tra.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.tra.dto.TraOrderDto;


@Component
public class TraIndentDao {

	@Autowired 
	private BaseDao baseDao;
	
	
	/**
	 * 分页查询交易大厅列表数据
	 */
	public List<TraOrderDto> findTraOrder(TraOrderDto traOrder) {
		if(traOrder.getPageNum()==null)
			traOrder.setPageNum(1);
		if(traOrder.getRows()==null)
			traOrder.setRows(10);
		return baseDao.findList("mapper.standard.TraIndentMapper.findTraOrder", traOrder,traOrder.getPageNum(),traOrder.getRows());
	}
	public Integer findTraOrderTotal(TraOrderDto traOrder) {
		return baseDao.findOne("mapper.standard.TraIndentMapper.findTraOrderTotal", traOrder);
	}
	
	public List<TraOrderDto> findMyOrderList(Map<String,Object> data) {
		return baseDao.findList("mapper.standard.TraIndentMapper.findMyOrderList",data);
	}
	
	public Integer getMyOrdersCount(Map<String,Object> data) {
		return baseDao.findOne("mapper.standard.TraIndentMapper.getMyOrdersCount", data);
	}
	
	/**
	 * 将时间延长到还剩30秒
	 * @param traOrder
	 */
	public Integer updateTraIndentMinutes(TraOrderDto traOrder) {
		return baseDao.findOne("mapper.standard.TraIndentMapper.updateTraIndentMinutes", traOrder);
	}
	/**
	 * getTraOrderById() 根据id获取拍卖车辆
	 * @param  
	 * @return 
	 */
	public TraOrderDto getTraOrderById(String id) {
		return baseDao.findOne("mapper.standard.TraIndentMapper.getTraOrderById", id);
	}
	/**
	 * updateTraOrderState 更新拍卖车辆状态
	 * @param traOrder
	 */
	public Integer updateTraOrderState(Map<String, Object> conditions) {
		return baseDao.update("mapper.standard.TraIndentMapper.updateTraOrderState", conditions);
	}
}
