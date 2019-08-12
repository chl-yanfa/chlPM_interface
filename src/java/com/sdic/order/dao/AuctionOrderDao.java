package com.sdic.order.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.auction.dto.AuctionDto;
import com.sdic.common.BaseDao;
import com.sdic.order.dto.OrderDTO;
import com.sdic.order.entity.AuctionOrder;

@Component
public class AuctionOrderDao {
	
	@Autowired 
	private BaseDao baseDao;
	
	public List<AuctionOrder> getOrderList(OrderDTO params){
		Integer pageNum = 1;
		Integer rows = 10;
		if(params!=null&&params.getPageNum()!=null) {
			pageNum = params.getPageNum();
		}
		if(params!=null&&params.getRows()!=null) {
			rows = params.getRows();
		}
		return baseDao.findList("mapper.standard.AuctionOrderMapper.getOrderList", params,pageNum,rows);
	}
	public int getOrderListTotal(OrderDTO params){
		return baseDao.findOne("mapper.standard.AuctionOrderMapper.getOrderListTotal", params);
	}
	
	public List<AuctionDto> getMyOrderList(AuctionDto auction){
		Integer pageNum = 1;
		Integer rows = 10;
		if(auction!=null&&auction.getPageNum()!=null) {
			pageNum = auction.getPageNum();
		}
		if(auction!=null&&auction.getRows()!=null) {
			rows = auction.getRows();
		}
		if(auction.getType()==0){
			return baseDao.findList("mapper.standard.AuctionOrderMapper.getMyOrderList", auction,pageNum,rows);
		}else{
			return baseDao.findList("mapper.standard.AuctionOrderMapper.getMyOrder2List", auction,pageNum,rows);
		}
	}
	
	public int getMyOrderListTotal(AuctionDto auction){
		if(auction.getType()==0){
			return baseDao.findOne("mapper.standard.AuctionOrderMapper.getMyOrderListTotal", auction);
		}else{
			return baseDao.findOne("mapper.standard.AuctionOrderMapper.getMyOrderList2Total", auction);
		}
		
	}
	
	public List<Map<String, String>> getOrderListTab(OrderDTO params){
		return baseDao.findList("mapper.standard.AuctionOrderMapper.getOrderListTab",params);
	}

}
