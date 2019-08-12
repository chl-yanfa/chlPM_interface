package com.sdic.auction.standard.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdic.auction.dto.AuctionDto;
import com.sdic.auction.standard.service.AuctionService;
import com.sdic.common.Constants;
import com.sdic.common.ResultDTO;
import com.sdic.common.SessionUtil;
import com.sdic.tra.dto.BidDto;
import com.sdic.tra.standard.service.BidService;

/**
 * 项目名称：chlPM_interface
 * 类名称：TradehallController
 * 类描述：交易大厅控制类
 * 创建人：刘民
 * 创建时间： 2019年04月09日 下午7:19:04
 * 修改人：刘民
 * 修改时间： 
 * 修改备注： 
 * @version 
 */

@Controller
@RequestMapping(value = "/auction")
public class AuctionController {
	
	private static Log log	=LogFactory.getLog(AuctionController.class);
	
	@Autowired
	   private AuctionService auctionService;
	@Autowired
	private BidService bidService;
	
	
	/**
	 * 拍卖列表
	 */
   @RequestMapping(value = "/queryList", method = RequestMethod.POST)
   @ResponseBody
   public Object ListPage(@RequestBody AuctionDto auction,HttpServletRequest request){
	   ResultDTO<AuctionDto> res = new ResultDTO<AuctionDto>();
	   List<AuctionDto> list = new ArrayList<AuctionDto>();
	   try{
		   list = auctionService.findAuction(auction);
		   if (null != list && list.size() > 0) {
				res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
				res.setReturnMsg(Constants.RETURN_MSG_SUCCESS);
				res.setRows(list);
			} else {
				res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
				res.setReturnMsg(Constants.RETURN_MSG_DATA_NULL);
			}
		int total = auctionService.findAuctionTotal(auction);
		res.setTotal(total);
	   }catch(Exception e){
		    res.setReturnCode(Constants.RETURN_CODE_SYSTEM_FAIL);
			res.setReturnMsg(Constants.RETURN_MSG_SYSTEM_FAIL);
			e.printStackTrace();
	   }
	   return res;
   }
   
   
   /**
    * 拍卖详情
    */
   @RequestMapping(value = "/getAuctionInfo", method = RequestMethod.GET)
   @ResponseBody
	public ResultDTO<AuctionDto> getAuctionInfo(String id){
		return auctionService.getAuctionInfo(id);
	}
   
   /**
    * 竞价
    */
   @RequestMapping(value = "/quoteprice", method = RequestMethod.POST)
   @ResponseBody
   public synchronized Object quoteprice_new(BidDto bidDto,HttpServletRequest request,HttpServletResponse response){
	   long s = System.currentTimeMillis();
	   ResultDTO<String> res = new ResultDTO<String>();
	   try{
		   //是否为空验证
		   if(bidDto.getBidAmount()==null){ 
			   res.setReturnCode(Constants.PRICE_NOT_NULL);
			   return res;
		   }
        String memberCode = String.valueOf(bidDto.getMemberCode());
        String realName = SessionUtil.getRealName();
        if(memberCode == null || "".equals(memberCode)){
        	memberCode = request.getParameter("memberCode");
        	Object object = request.getAttribute("realName");
        	realName = (String) (object == null?"":object);
        	if (memberCode == null || "".equals(memberCode)) {
				res.setReturnCode(Constants.RETURN_CODE_PARAMETER_NULL);
				return res;
			}
        }
        bidDto.setMemberCode(memberCode);
		bidDto.setRealName(realName);
		res = bidService.bid(bidDto);    
	   }catch(Exception e){
		   log.error("出价错误："+e.toString());
		   res.setReturnCode(Constants.RETURN_CODE_SYSTEM_FAIL);// 200000系统错误
		   e.printStackTrace();
	   }
	   long e = System.currentTimeMillis();
		log.info("=================出价耗时："+(e-s)+"毫秒");
	   return res;
   }
   
}
