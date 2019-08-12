package com.sdic.auction.standard.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdic.auction.dao.AuctionDao;
import com.sdic.auction.dto.AuctionDto;
import com.sdic.common.Constants;
import com.sdic.common.ResultDTO;
import com.sdic.personal.entity.PersonalInfo;

@Service
public class AuctionService {
	
	
	@Autowired
	private AuctionDao auctionDao;
	
	
	public List<AuctionDto>findAuction(AuctionDto auctionDto){
		List<AuctionDto> result = auctionDao.findAuction(auctionDto);
		return  result;
	}
	
	public int findAuctionTotal(AuctionDto auctionDto){
		int result = auctionDao.findAuctionTotal(auctionDto);
		return result;
	}
	
	public ResultDTO<AuctionDto>getAuctionInfo(String id){
		ResultDTO<AuctionDto> res = new ResultDTO<AuctionDto>();
		AuctionDto auctionDto = auctionDao.getAuctionInfo(id);
		if(auctionDto.getHighestPrice()==null){
			auctionDto.setHighestPrice(auctionDto.getHighestPrice());
		}
		BigDecimal totalPrice = new BigDecimal("0");
		BigDecimal highestPrice = auctionDto.getHighestPrice()==null?new BigDecimal("0"):auctionDto.getHighestPrice();
		BigDecimal commission = auctionDto.getCommission()==null?new BigDecimal("0"):auctionDto.getCommission();
		BigDecimal otherPrice = auctionDto.getOtherPrice()==null?new BigDecimal("0"):auctionDto.getOtherPrice();
		totalPrice=totalPrice.add(highestPrice)
				.add(commission)
				.add(otherPrice);
		auctionDto.setCommission(commission);
		auctionDto.setOtherPrice(otherPrice);
		auctionDto.setTotalPrice(totalPrice);
		res.setEntity(auctionDto);
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg(Constants.RETURN_MSG_SUCCESS);
		return res;
	}

}
