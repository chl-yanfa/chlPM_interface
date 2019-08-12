package com.sdic.auction.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.auction.dto.AuctionDto;
import com.sdic.common.BaseDao;

@Component
public class AuctionDao {

	@Autowired 
	private BaseDao baseDao;
	
	public List<AuctionDto> findAuction (AuctionDto auctionDto){
		if(auctionDto.getPageNum()==null)
			auctionDto.setPageNum(1);
		if(auctionDto.getRows()==null)
			auctionDto.setRows(100);
		return baseDao.findList("mapper.standard.AuctionHMapper.findAuction", auctionDto,auctionDto.getPageNum(),auctionDto.getRows());
	}
	
	public Integer findAuctionTotal(AuctionDto auctionDto){
		return baseDao.findOne("mapper.standard.AuctionHMapper.findAuctionTotal", auctionDto);
	}
	
	public AuctionDto getAuctionInfo(String id){
		return baseDao.findOne("mapper.standard.AuctionHMapper.getAuctionInfo", id);
	}
	   
}
