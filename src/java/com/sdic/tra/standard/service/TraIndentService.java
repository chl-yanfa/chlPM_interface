package com.sdic.tra.standard.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdic.common.Constants;
import com.sdic.common.ResultDTO;
import com.sdic.tra.dao.TraIndentDao;
import com.sdic.tra.dto.TraOrderDto;


@Service
public class TraIndentService {

	
	@Autowired
	private TraIndentDao traIndentDao;
	
	
	/**
	 * 正在拍卖的数据列表
	 */
	public List<TraOrderDto>findTraOrder(TraOrderDto traOrder){
		List<TraOrderDto> result = traIndentDao.findTraOrder(traOrder);
		for (TraOrderDto traOrderDto : result) {
			/**
			 * 当前最高价
			 */
			if(traOrderDto.getHighestPrice()==null) {
				traOrderDto.setHighestPrice(traOrderDto.getStartingPrice());
			}
			/** 
			 * 合手价
			 */
			BigDecimal totalPrice = new BigDecimal("0");
			BigDecimal highestPrice = traOrderDto.getHighestPrice();
			BigDecimal commission = traOrderDto.getCommission()==null?new BigDecimal("0"):traOrderDto.getCommission();
			String commissionIsDiscount = traOrderDto.getCommissionIsDiscount();
			if(StringUtils.isNotBlank(commissionIsDiscount)) {
				if("是".equals(commissionIsDiscount)) {
					String commissionPercentType = traOrderDto.getCommissionPercentType();
					BigDecimal commissionDiscountValue = traOrderDto.getCommissionDiscountValue();
					if(StringUtils.isNotBlank(commissionPercentType)&&null!=commissionDiscountValue) {
						if("固定值".equals(commissionPercentType)) {
							commission=commission.subtract(commissionDiscountValue);
						}else {
							commission=commission.multiply(commissionDiscountValue).movePointLeft(2);
						}
					}
				}
			}
			BigDecimal rescueCost = traOrderDto.getRescueCost()==null?new BigDecimal("0"):traOrderDto.getRescueCost();
			BigDecimal otherCost = traOrderDto.getOtherCost()==null?new BigDecimal("0"):traOrderDto.getOtherCost();
			totalPrice=totalPrice.add(highestPrice)
					.add(commission)
					.add(rescueCost)
					.add(otherCost);
			traOrderDto.setCommission(commission);
			traOrderDto.setRescueCost(rescueCost);
			traOrderDto.setOtherCost(otherCost);
			traOrderDto.setTotalPrice(totalPrice);
		}
		return result;
	}
	public int findTraOrderTotal(TraOrderDto traOrder){
		int result = traIndentDao.findTraOrderTotal(traOrder);
		return result;
	}
	
	public List<TraOrderDto> findMyOrderList(Map<String, Object> data) {
		return traIndentDao.findMyOrderList(data);
	}
	
	public Integer getMyOrdersCount(Map<String, Object> data) {
		return traIndentDao.getMyOrdersCount(data);
	}
	
	/**
	 * changeOrderState   更新拍卖车辆状态
	 * @param conditions
	 */
	@Transactional
	public ResultDTO<String> changeOrderState(Map<String, Object> conditions){
		ResultDTO<String> res = new ResultDTO<String>();
		if(null==conditions||null==conditions.get("orderId")
				||null==conditions.get("state")) {
			res.setReturnCode(Constants.RETURN_CODE_PARAMETER_NULL);
			res.setReturnMsg("参数为空");
			return res;
		}
		String orderId = conditions.get("orderId").toString();
		Integer state = (Integer)conditions.get("state");
		TraOrderDto traOrder = traIndentDao.getTraOrderById(orderId);
		if(null==traOrder) {
			res.setReturnCode(Constants.RETURN_CODE_PARAMETER_NULL);
			res.setReturnMsg("参数无效");
			return res;
		}
		Map<String, Object> param =new HashMap<String, Object>();
		param.put("orderId", orderId);
		if(state==0) {
			//未开始->开始
			if(!traOrder.getState().equals("10")){
				res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
				res.setReturnMsg("条件不符");
				return res;
			}
			Date auctionStartTime = traOrder.getAuctionStartTime();
			long time = new Date().getTime();
			if(null==auctionStartTime||auctionStartTime.getTime()>time) {
				res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
				res.setReturnMsg("条件不符");
				return res;
			}
			param.put("orderState", "20");
			res.setReturnMsg("此车已开拍");
		}else {
			//进行中->结束
			if(!traOrder.getState().equals("20")){
				res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
				res.setReturnMsg("条件不符");
				return res;
			}
			Date auctionFinishTime = traOrder.getAuctionFinishTime();
			long time = new Date().getTime();
			if(null==auctionFinishTime||auctionFinishTime.getTime()>time) {
				res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
				res.setReturnMsg("条件不符");
				return res;
			}
			param.put("orderState", "30");
			res.setReturnMsg("此车已结束");
		}
		traIndentDao.updateTraOrderState(param);
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		return res;
	}
}
