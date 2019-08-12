package com.sdic.offwater.standard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdic.common.ResultDTO;
import com.sdic.offwater.entity.OfferWaterInfo;
import com.sdic.offwater.standard.service.OfferWaterService;



@Controller
@RequestMapping(value = "/offerwater")
public class OfferWaterController {
	
	@Autowired
	private OfferWaterService offerWaterService;

	
	@RequestMapping(value = "/getOfferWaterList", method = RequestMethod.POST)
	@ResponseBody
	public ResultDTO<OfferWaterInfo> getOfferWaterList(@RequestBody OfferWaterInfo info){
		return offerWaterService.getOfferWaterListByOrderId(info);
	}

}
