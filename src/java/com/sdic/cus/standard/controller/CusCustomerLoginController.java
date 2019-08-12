package com.sdic.cus.standard.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdic.common.Constants;
import com.sdic.common.IpUtil;
import com.sdic.common.JSONUtil;
import com.sdic.common.SessionUtil;
import com.sdic.cus.dto.CustomerInfoDTO;
import com.sdic.cus.entity.CustomerInfo;
import com.sdic.cus.standard.service.CusCustomerLoginService;


/**
 * 项目名称：sdicPM_interface
 * 类名称：CusCustomerLoginController
 * 类描述：会员登录、退出控制类
 * 创建人：刘民
 * 创建时间： 2018年11月20日 下午11:17:14
 * 修改人：刘民
 * 修改时间： 2018年11月20日 下午11:17:14
 * 修改备注： 
 * @version 
 *
 */

@Controller
@RequestMapping(value = "/customerloginlogout")
public class CusCustomerLoginController {
	
	private static Log log = LogFactory.getLog(CusCustomerLoginController.class);
	@Autowired
	private CusCustomerLoginService cusCustomerLoginService;

	
	/**
	 * 会员登录
	 * @param loginId	会员账号
	 * @param password	密码
	 * @param kaptcha	验证码
	 * @param request
	 * @return 成功返回首页
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public synchronized Object login(@RequestBody CustomerInfoDTO info,HttpServletRequest request,HttpServletResponse response){
		String loginId = info.getLoginId();
		String password = info.getPassword();
		String deviceType = info.getDeviceType();
		String browser = info.getBrowser();
		Map<String,Object> result = new HashMap<String,Object>();
		String sessionId = request.getSession().getId();
		CustomerInfoDTO user = (CustomerInfoDTO) request .getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
		result.put("returnCode",  Constants.RETURN_CODE_SUCCESS);
		Map<String,Object> entity = new HashMap<String, Object>();
		//已登录直接返回首页
		if(user !=null){
			result.put("memberCode", SessionUtil.getMemberCode());
			result.put("returncode", Constants.RETURN_CODE_SUCCESS);
			return result;
		}
		Map<String,String> userLoginInfo = new HashMap<String,String>();
		userLoginInfo.put("loginId", loginId);
		userLoginInfo.put("password", password);
		CustomerInfo customerInfo = new CustomerInfo();
		try{
			customerInfo = cusCustomerLoginService.getByLoginIdAndPassword(userLoginInfo);
			if(customerInfo == null){ //账号密码不正确
				result.put("returnCode", Constants.RETURN_CODE_PASS_ERROR);
				return result;
			}
		}catch(Exception e1){
			e1.printStackTrace();
			result.put("returnCode", Constants.RETURN_CODE_SYSTEM_FAIL);
			return result;
		}
		String memberCode = customerInfo.getMemberCode();
		String forceLogin = Constants.MERCHANTS_FORCE_LOGIN_NORMAL;//正常登录
		entity.put("memberCode",memberCode);
		entity.put("customerLevel", customerInfo.getCustomerLevel());
		entity.put("nickName", customerInfo.getUserName());
		result.put("entity", entity);
		//存入session里的会员信息
		CustomerInfoDTO customerInfoDTO = new CustomerInfoDTO();
		customerInfoDTO.setMemberCode(customerInfo.getMemberCode());
		customerInfoDTO.setUserName(customerInfo.getUserName());
		customerInfoDTO.setRealName(customerInfo.getRealName());
		customerInfoDTO.setCustomerLevel(customerInfo.getCustomerLevel());
		request.getSession().setAttribute(Constants.CUSTOMER_SESSION_INFO_NAME, customerInfoDTO);
		//存入cookie中
		Cookie cookie = new Cookie(Constants.CUSTOMER_SESSION_INFO_NAME_COOKIE ,customerInfo.getMemberCode());
		cookie.setMaxAge(24 * 60 * 60);
		cookie.setPath("/");
        response.addCookie(cookie);
		//返回客户端信息
		returnToClient(response,JSONUtil.toJson(result));
		
		String ip = IpUtil.getIpAddr(request);
		//会员登录日志 （后面完善）
				
		return null;  //登录成功
	}
	
	
	/**
	 * 退出登录
	 * @param request
	 * @return 已安全退出页面
	 */
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	@ResponseBody
	public Object logout(HttpServletRequest request,HttpServletResponse response){
		Map<String,Object> result = new HashMap<String,Object>();
		CustomerInfoDTO user = (CustomerInfoDTO) request.getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
		String sessionId  = request.getSession().getId();
		if(user != null){
			
			request.getSession().removeAttribute(Constants.CUSTOMER_SESSION_INFO_NAME);
		}
		request.getSession().invalidate();
		Cookie cookie = new Cookie(Constants.CUSTOMER_SESSION_INFO_NAME_COOKIE, null);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
		result.put("returnCode", Constants.RETURN_CODE_SUCCESS);
		return result;
	}
	

	/**
	 * 返回客户端信息
	 * @param response
	 */
	public static void returnToClient(HttpServletResponse response,String msg){
		try {
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(msg);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
