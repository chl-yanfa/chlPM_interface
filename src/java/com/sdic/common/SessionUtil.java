package com.sdic.common;

import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sdic.cus.dto.CustomerInfoDTO;


public class SessionUtil {

	public static HttpSession getSession() {
		return ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest().getSession();
	}
	
	public static Object getSessionAttribute(String key){
		return getSession().getAttribute(key);
	}
	
	/**
	 * 获取用户编码
	 * @return
	 */
	public static String getMemberCode(){
		CustomerInfoDTO inof = getSessionUser();
		if(null != inof){
			return inof.getMemberCode();
		}else{
			return null;
		}
	}
	/**
	 * 获取用户真实姓名
	 * @return
	 */
	public static String getRealName(){
		CustomerInfoDTO inof = getSessionUser();
		if(null != inof){
			return inof.getRealName();
		}else{
			return "";
		}
	}
	/**
	 * 获取用户编号
	 * @return
	 */
	public static String getMemberNum(){
		CustomerInfoDTO inof = getSessionUser();
		if(null != inof){
			return inof.getMemberNum();
		}else{
			return null;
		}
	}
	/**
	 * 获取用户类型(0：正常用户，1：测试用户)
	 * @return
	 */
	public static String getTimeliness(){
		CustomerInfoDTO inof = getSessionUser();
		if(null != inof){
			return inof.getTimeliness();
		}else{
			return "0";
		}
	}
	/**
	 * 登录设备类型
	 * @return
	 */
	public static String getDeviceType(){
		CustomerInfoDTO inof = getSessionUser();
		if(null != inof){
			return inof.getDeviceType();
		}else{
			return null;
		}
	}
	
	public static CustomerInfoDTO getSessionUser(){
		return (CustomerInfoDTO)getSession().getAttribute(Constants.CUSTOMER_SESSION_INFO_NAME); 
	}
	/**
	 * 等级升级后是否已提示
	 * @return
	 */
	public static String getUpgradeHinted() {
		CustomerInfoDTO inof = getSessionUser();
		if(null != inof){
			return inof.getUpgradeHinted();
		}else{
			return null;
		}
	}
	/**
	 * 会员等级
	 * @return
	 */
	public static String getGrade() {
		CustomerInfoDTO inof = getSessionUser();
		if(null != inof){
			return inof.getGrade();
		}else{
			return null;
		}
	}
}
