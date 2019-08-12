package com.sdic.cus.standard.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdic.common.ResultDTO;
import com.sdic.cus.standard.service.VerificationCodeService;


/**
 * 
 * 
 * 项目名称：sdicPM_interface
 * 类名称：VerificationCodeController
 * 类描述：
 * 创建人：刘民
 * 创建时间： 2018年12月15日 下午10:47:48
 * 修改人：刘民
 * 修改时间： 2018年12月15日 下午10:47:48
 * 修改备注： 
 * @version 
 *
 */

@Controller
@RequestMapping(value = "/VerificationCode")
public class VerificationCodeController {
	
	@Autowired
	private VerificationCodeService  verificationCodeService;
	
	
	@RequestMapping(value="/getVerificationCode", method = RequestMethod.POST)
	@ResponseBody
	public ResultDTO<String> getVerificationCode(HttpServletRequest request,@RequestBody Map<String, String> conditions){
		return verificationCodeService.getVerificationCode(request,conditions);     
	}

}
