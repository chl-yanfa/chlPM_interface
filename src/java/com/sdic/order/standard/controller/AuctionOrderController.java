package com.sdic.order.standard.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdic.auction.dto.AuctionDto;
import com.sdic.common.ResultDTO;
import com.sdic.order.dto.OrderDTO;
import com.sdic.order.entity.AuctionOrder;
import com.sdic.order.standard.service.AuctionOrderService;



/**
 * 项目名称：	clhPM_interface
 * 类名称：	AuctionOrderController
 * 类描述：
 * 创建人：	liumin
 * 创建时间： 	2019年04月18日 上午11:42:12
 */
@Controller
@RequestMapping(value = "/myOrder")
public class AuctionOrderController {
	
	@Autowired
	private AuctionOrderService auctionOrderService;

	
	@RequestMapping(value = "/getOrderList", method = RequestMethod.POST)
	@ResponseBody
	public ResultDTO<AuctionOrder> getOrderList(@RequestBody OrderDTO params,HttpServletRequest request){
		return auctionOrderService.getOrderList(params,request);
	}
	@RequestMapping(value = "/getOrderListTab", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO<Map<String, String>> getOrderListTab(HttpServletRequest request){
		return auctionOrderService.getOrderListTab(request);
	}
	
	/**
	 * 我的订单
	 */

	@RequestMapping(value = "/getMyOrderList", method = RequestMethod.POST)
	@ResponseBody
	public ResultDTO<AuctionDto> getMyOrderList(@RequestBody AuctionDto auction,HttpServletRequest request){
		return auctionOrderService.getMyOrderList(auction,request);
	}
	

}
