package com.sdic.RecoveryOrder.standard.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdic.RecoveryOrder.dto.RecoverOrderDto;
import com.sdic.RecoveryOrder.standard.service.RecoverOrderService;
import com.sdic.common.ResultDTO;

/**
 * 
 * 
 * 项目名称：chlPM_interface
 * 类名称：RecoveryOrderController
 * 类描述：
 * 创建人：刘民
 * 创建时间： 2019年5月10日 下午4:19:12
 * 修改人：刘民
 * 修改时间： 2019年5月10日 下午4:19:12
 * 修改备注： 
 * @version 
 *
 */

@Controller
@RequestMapping(value = "/recoverOrder")
public class RecoveryOrderController {

	private static Log log = LogFactory.getLog(RecoveryOrderController.class);
	
	@Autowired
	   private RecoverOrderService recoverOrderService;
	
	/*
	 * 回收件/整车订单详情
	 */
	
	   @RequestMapping(value = "/recoverOrderDetails", method = RequestMethod.GET)
	   @ResponseBody
	   public ResultDTO<RecoverOrderDto> getRecoverOrderDetails(String id){
		   return recoverOrderService.getRecoverOrderDetails(id);
	   }
	   
}
