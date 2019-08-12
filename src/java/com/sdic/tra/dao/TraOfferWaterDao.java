package com.sdic.tra.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.common.Identities;
import com.sdic.tra.dto.TraOfferWaterDto;
import com.sdic.tra.dto.TraOrderDto;

@Component
public class TraOfferWaterDao {

	@Autowired
	private BaseDao baseDao;

	/**
	 * 保存出价记录
	 * @param waterDto
	 * @return
	 */
	public String createTraOfferWater(TraOfferWaterDto waterDto) {
		waterDto.setId(Identities.uuid2());
		baseDao.create("mapper.standard.TraOfferWaterMapper.insertTraOfferWater",waterDto);
		return waterDto.getId();
	}
	/**
	 * 获取我对某个订单的最高价 -不区分报价和竞价
	 * @param traOrder
	 * @return
	 */
	public int getMaxBidAmountByUser(TraOrderDto traOrder) {
		return baseDao.findOne("mapper.standard.TraOfferWaterMapper.getMaxBidAmountByUser",traOrder);
	}
	/**
	 * 通过订单编号获取我的报价列表
	 * @param traOrder
	 * @return
	 */
	public List<TraOfferWaterDto> getMyBidAmountListByCarCode(TraOrderDto traOrder) {
		return baseDao.findList("mapper.standard.TraOfferWaterMapper.findComAmountByUser",traOrder);
	}
	/**
	 * 查询用户对某个订单的出价金额
	 * @param traOrder
	 * @return
	 */
	public List<TraOfferWaterDto> findBidAmountByUser(TraOrderDto traOrder) {
		return baseDao.findList(
				"mapper.standard.TraOfferWaterMapper.findBidAmountByUser",
				traOrder);
	}

	/**
	 * 查询用户对某个订单的竟价金额
	 * @param traOrder
	 * @return
	 */
	public List<TraOrderDto> findComAmountByUser(TraOrderDto traOrder) {
		return baseDao.findList(
				"mapper.standard.TraOfferWaterMapper.findComAmountByUser",
				traOrder);
	}

	/**
	 * 查询会员报价车辆列表
	 * @param traOrder
	 * @return
	 */
	public List<TraOfferWaterDto> findOfferWaterByMember(TraOrderDto traOrder) {
		return baseDao.findList(
				"mapper.standard.TraOfferWaterMapper.findOfferWaterByMember",
				traOrder);
	}

	/**
	 * 通过订单号查询流水信息
	 * @param orderId
	 * @return
	 */
	public List<TraOfferWaterDto> findTraOfferWaterByOrderId(String orderId) {
		return baseDao.findList("mapper.standard.TraOfferWaterMapper.findTraOfferWaterByOrderId",orderId);
	}

	/**
	 * 车辆出价列表
	 * @param data
	 * @return
	 */
	public List<TraOfferWaterDto> findPriceList(Map<String, Object> data) {
		return baseDao.findList(
				"mapper.standard.TraOfferWaterMapper.findPriceList", data);
	}
	/**
	 * 获取当前商户出过价的车辆总数
	 * @param TraOfferWaterDto
	 * @return
	 */
	public Integer getMeberBidTotal(TraOfferWaterDto data) {
		return baseDao.findOne("mapper.standard.TraOfferWaterMapper.getMeberBidTotal", data);
	}
	/**
	 * 查询用户对某个  车辆 的最高报价和竞价
	 * @param TraOfferWaterDto
	 * @return
	 */
	public List<TraOfferWaterDto> getQuoteAndBidByCarCode(TraOfferWaterDto data) {
		return baseDao.findList("mapper.standard.TraOfferWaterMapper.getQuoteAndBidByCarCode", data);
	}
	
	

	/**
	 * 功能描述：车辆出价列表(优质车辆使用)
	 * @param orderId	订单编号
	 * @return List<TraOrder>
	 * 创 建 人：
	 * 日    期：
	 * 修 改 人： 
	 * 日    期：
	 * 修 改描述：
	 */
	public List<TraOfferWaterDto> findPriceList2(Map<String, Object> data) {
		return baseDao.findList(
				"mapper.standard.TraOfferWaterMapper.findPriceList2", data);
	}
	

	/**
	 * 功能描述在流水表中获取我对某一辆车的报价列表
	 * @param traOrder
	 * @return List<TraOfferWaterDto>
	 */
	public List<TraOfferWaterDto> getMyCarQuotation(TraOrderDto traOrder) {
		return baseDao.findList(
				"mapper.standard.TraOfferWaterMapper.getMyCarQuotation",
				traOrder);
	}
	
	/**
	 * 功能描述：出价前判断当前会员出价次数 
	 * 输入参数： memberCode 会员code 
	 * 创 建 人：
	 * 日 期：
	 * 改 人： 
	 * 日 期： 
	 * 修 改描述：
	 **/
	public Integer getQuotePriceSize(TraOfferWaterDto waterDto) {
		return baseDao.findList(
				"mapper.standard.TraOfferWaterMapper.getQuotePriceSize",
				waterDto).size();
	}
	
	/**
	 * @findPriceListLook(查询最高价)
	 * @param data
	 * @return List<TraOfferWaterDto>
	 * @since  1.0.0
	 */
	public List<TraOfferWaterDto> findPriceListLook(Map<String, Object> data) {
		return baseDao.findList(
				"mapper.standard.TraOfferWaterMapper.findPriceListLook", data);
	}
	
}