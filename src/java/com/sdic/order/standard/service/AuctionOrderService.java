package com.sdic.order.standard.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sdic.auction.dto.AuctionDto;
import com.sdic.common.Constants;
import com.sdic.common.ResultDTO;
import com.sdic.cus.dto.CustomerInfoDTO;
import com.sdic.order.dao.AuctionOrderDao;
import com.sdic.order.dto.OrderDTO;
import com.sdic.order.entity.AuctionOrder;


/**
 * 项目名称：	sdicPM_interface
 * 类名称：	AuctionOrderService
 * 类描述：
 * 创建人：	zhangwanxin
 * 创建时间： 	2018年12月16日 上午11:43:36
 */
@Service
public class AuctionOrderService {
	
	@Autowired 
	private AuctionOrderDao auctionOrderDao;
	
	/**
	 * 查询订单
	 * @param 
	 */
	public ResultDTO<AuctionOrder> getOrderList(OrderDTO params,HttpServletRequest request){
		ResultDTO<AuctionOrder> res = new ResultDTO<AuctionOrder>();
		CustomerInfoDTO customerInfo = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
		if(customerInfo==null) {
			res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
			res.setReturnMsg("未检测到登陆信息");
			return res;
		}
		String memberCode = customerInfo.getMemberCode();
		if(null == params) {
			params = new OrderDTO();
		}
		params.setMemberCode(memberCode);
		List<AuctionOrder> list = auctionOrderDao.getOrderList(params);
		int total = auctionOrderDao.getOrderListTotal(params);
		res.setRows(list);
		res.setTotal(total);
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg("成功");
		return res;
	}
	
	public ResultDTO<AuctionDto>getMyOrderList(AuctionDto auction,HttpServletRequest request){
		ResultDTO<AuctionDto> res = new ResultDTO<AuctionDto>();
		if(auction.getDealMid() == null){
			res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
			res.setReturnMsg("未检测到登陆信息");
			return res;
		}
		List<AuctionDto> list = auctionOrderDao.getMyOrderList(auction); 
		int total = auctionOrderDao.getMyOrderListTotal(auction);
		res.setRows(list);
		res.setTotal(total);
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg(Constants.RETURN_MSG_SUCCESS);
		return res;
	}
	
	/**
	 * 查询订单
	 * @param 
	 */
	public ResultDTO<Map<String, String>> getOrderListTab(HttpServletRequest request){
		ResultDTO<Map<String, String>> res = new ResultDTO<Map<String, String>>();
		CustomerInfoDTO customerInfo = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
		if(customerInfo==null) {
			res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
			res.setReturnMsg("未检测到登陆信息");
			return res;
		}
		String memberCode = customerInfo.getMemberCode();
		OrderDTO params = new OrderDTO();
		params.setMemberCode(memberCode);
		List<Map<String, String>> orderListTab = auctionOrderDao.getOrderListTab(params);
		res.setRows(orderListTab);
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg("成功");
		return res;
	}
	
}
