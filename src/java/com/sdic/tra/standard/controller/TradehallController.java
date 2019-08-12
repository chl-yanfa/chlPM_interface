package com.sdic.tra.standard.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.sdic.common.Constants;
import com.sdic.common.JSONUtil;
import com.sdic.common.ResultDTO;
import com.sdic.common.SessionUtil;
import com.sdic.follow.entity.Follow;
import com.sdic.follow.standard.service.FollowService;
import com.sdic.tra.dto.BidDto;
import com.sdic.tra.dto.TraOrderDto;
import com.sdic.tra.standard.service.BidService;
import com.sdic.tra.standard.service.TraIndentService;


/**
 * 项目名称：sdicPM_interface
 * 类名称：TradehallController
 * 类描述：交易大厅控制类
 * 创建人：刘民
 * 创建时间： 2018年11月14日 下午7:19:04
 * 修改人：刘民
 * 修改时间： 2018年11月14日 下午7:19:04
 * 修改备注： 
 * @version 
 */

@Controller
@RequestMapping(value = "/tradehall/traindent")
public class TradehallController {

	 private static Log log = LogFactory.getLog(TradehallController.class);
	 
	 @Autowired
		private TraIndentService traIndentService;
	 @Autowired
		private FollowService followService;
	@Autowired
		private BidService bidService;
	 
	 
	 /**
	  * 方法名称：queryList
	  * 方法描述：拍卖列表
	  * @param   traOrder
	  * @param   request
	  * @return
	  * @author 刘民
	  */
	 @RequestMapping(value = "/queryList", method = RequestMethod.POST)
     @ResponseBody
     public Object listPage(@RequestBody TraOrderDto traOrder, HttpServletRequest request){
		 //获取当前用户登录用户的商户ID(因为暂时没做登录 所以先空着)
		 
		 //创建返回对象 
		 ResultDTO<TraOrderDto> res = new ResultDTO<TraOrderDto>();
		 //查询列表
		 List<TraOrderDto> list = new ArrayList<TraOrderDto>();
		 try{
			 if(Constants.AUCTION_MODEL_ALL.equals(traOrder.getCarListType())){
				 traOrder.setCarListType(Constants.AUCTION_MODEL_J_C); 
				 list.addAll(traIndentService.findTraOrder(traOrder)); 
			 }else{
				 list = traIndentService.findTraOrder(traOrder);
			 }
			if (null != list && list.size() > 0) {
					res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
					res.setReturnMsg(Constants.RETURN_MSG_SUCCESS);
					res.setRows(list);
				} else {
					res.setReturnCode(Constants.RETURN_CODE_DATA_NULL);
					res.setReturnMsg(Constants.RETURN_MSG_DATA_NULL);
				}
			int total = traIndentService.findTraOrderTotal(traOrder);
			res.setTotal(total);
		 }catch(Exception e){
			    res.setReturnCode(Constants.RETURN_CODE_SYSTEM_FAIL);
				res.setReturnMsg(Constants.RETURN_MSG_SYSTEM_FAIL);
				e.printStackTrace();
		 }
		 
		 return res;
	 }
	 
	 /**
	  * 保存或者更新用户关注信息
	  */
	 @RequestMapping(value ="/attention", method = RequestMethod.POST)
	 @ResponseBody
	 public synchronized String saveOrUpdateCustomerAttention(@RequestBody Follow followw) {
		 Map<String,String> result = new HashMap<String, String>();
		 Follow newFollow;
		 try{
			 Follow data = new Follow();
			 String memberCode = followw.getMemberCode();
			 data.setMemberCode(memberCode);
			 data.setCarCode(followw.getCarCode());
			 data.setDeleteTag(Constants.DELETE_FLAG_NO);
			 data.setTimeliness(SessionUtil.getTimeliness());
			 Follow follow = followService.findFollowByCarCode(data);
			 newFollow = setFollow(follow, memberCode, followw.getOrderId(), followw.getCarCode());
			 if(follow ==null){
				 newFollow.setSource(Constants.SOURCE_ATTENTION);
				 followService.createFollow(newFollow);
				 result.put("isUnfollow", newFollow.getIsUnfollow());
			 }else{
				 followService.updateFollow(newFollow);
				 result.put("isUnfollow", newFollow.getIsUnfollow());
			 }
			 result.put("returnCode", Constants.RETURN_CODE_SUCCESS);
		 }catch(Exception e){
			 result.put("returnCode", Constants.RETURN_CODE_SYSTEM_FAIL);
		     result.put("returnMsg", Constants.RETURN_MSG_SYSTEM_FAIL);
			 result.put("isUnfollow", "");
			 e.printStackTrace();
		 }
		 return JSONUtil.toJson(result);
	 }
	 
	 
	 /**
	  * changeOrderState() 更新拍卖车辆状态
	  * @param  conditions 
	  * @return 
	  */
	 @RequestMapping(value = "/changeOrderState", method = RequestMethod.POST)
	 @ResponseBody
	 public ResultDTO<String> changeOrderState(@RequestBody Map<String, Object> conditions) {
		 return traIndentService.changeOrderState(conditions);
	 }
	 
	 /**
		 * 竞价
		 */
		@RequestMapping(value = "/quoteprice", method = RequestMethod.POST)
		@ResponseBody
		public synchronized Object quoteprice_new(@RequestBody BidDto bidDto,HttpServletRequest request,HttpServletResponse response) {
			long s = System.currentTimeMillis();
			ResultDTO<String> res = new ResultDTO<String>();
			try{
				//是否为空验证
				if(bidDto.getBidAmount() == null){
					res.setReturnCode(Constants.PRICE_NOT_NULL);
					return res;
				}
				if(bidDto.getBidType() == null){
					res.setReturnCode(Constants.QUOTEPRICE_NOT_SUPPORT);
					return res;
				}
				// 出价必须为整百数字
//				if (bidDto.getBidAmount() % 100 != 0) {
//					res.setReturnCode(Constants.PRICE_ERROR);
//					return res;
//				}
				//如果是从APP出价的，memberCode从参数里取  
				String memberCode = String.valueOf(bidDto.getMemberCode());
				String realName = SessionUtil.getRealName();
				if (memberCode == null || "".equals(memberCode)) {
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
	 
	 
	 /**
		 * 设置关注信息
		 * @param dmauCustomerAttention
		 * @param memberCode
		 * @param orderId
		 * @param carCode
		 * @return
		 */
		private Follow setFollow(Follow follow, String memberCode,String orderId, String carCode) {
			if (follow == null) {
				follow = new Follow();
				follow.setDeleteTag(Constants.DELETE_FLAG_NO);
				follow.setTimeliness(SessionUtil.getTimeliness());
				follow.setTs(new Date());
				follow.setMemberCode(memberCode);
				follow.setOrderId(orderId);
				follow.setCarCode(carCode);
			}
			if (follow.getIsUnfollow() == "" || follow.getIsUnfollow() == null
					|| follow.getIsUnfollow().equals(
							Constants.CUSTOMER_ATTENTION_NO)) {
				follow.setIsUnfollow(Constants.CUSTOMER_ATTENTION_YES);
				follow.setCreated(new Date());
			} else {
				follow.setIsUnfollow(Constants.CUSTOMER_ATTENTION_NO);
				follow.setUnfollowTime(new Date());
			}
			return follow;

		}
}
