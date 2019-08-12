package com.sdic.cus.standard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdic.common.Constants;
import com.sdic.cus.entity.CusCustomerMarginWater;
import com.sdic.tra.dto.TraOrderDto;
import com.sdic.tra.standard.service.TraIndentService;

/**
 * 
 * 
 * 项目名称：sdicPM_interface
 * 类名称：CusCustomerInfoController
 * 类描述：
 * 创建人：刘民
 * 创建时间： 2018年12月3日 下午1:47:52
 * 修改人：刘民
 * 修改时间： 2018年12月3日 下午1:47:52
 * 修改备注： 
 * @version 
 *
 */

@Controller
@RequestMapping(value = "/cuscenter")
public class CusCustomerInfoController {
	
	@Autowired
	private TraIndentService traIndentService;
	
	
	/**
	 * 获取已成交车辆信息
	 */
	@RequestMapping(value = "/myorders", method = RequestMethod.POST)
	@ResponseBody
     public Map<String,Object> myorders(@RequestBody CusCustomerMarginWater water,HttpServletRequest request){
		int pageNum = water.getPageNum();
		int rows = water.getRows();
		Map<String,Object> data = new HashMap<String, Object>();
		data.put("memberCode", water.getMemberCode());
		data.put("startRow", (pageNum-1)*rows);
		data.put("endRow", rows);
		data.put("deleteTag", Constants.DELETE_NO);
		data.put("listType", water.getListType());
		List<TraOrderDto> list = traIndentService.findMyOrderList(data);
		Integer count = traIndentService.getMyOrdersCount(data);
		Map<String,Object>result =  new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		if(list !=null && list.size()>0){
			result.put("returnCode", Constants.RETURN_CODE_SUCCESS);
		}else{
			result.put("returnCode", Constants.RETURN_CODE_DATA_NULL);
		}
		return result;
	}

}
