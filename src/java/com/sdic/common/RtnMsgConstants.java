package com.sdic.common;

public class RtnMsgConstants {
	/**
	 * 成功
	 */
	public final static String RETURN_CODE_SUCCESS = "000000";
	public final static String RETURN_MESG_SUCCESS = "成功";
	/**
	 * 参数为空(输入参数数据)
	 */
	public final static String RETURN_CODE_PARAMETER_NULL = "100000";
	public final static String RETURN_MESG_PARAMETER_NULL = "参数为空";
	/**
	 * 参数有错(输入参数数据)
	 */
	public final static String RETURN_CODE_PARAMETER_ERROR = "100001";
	public final static String RETURN_MESG_PARAMETER_ERROR = "参数有错";
	/**
	 * 状态有错(输入参数数据)
	 */
	public final static String RETURN_CODE_STATUS_ERROR = "100002";
	public final static String RETURN_MESG_STATUS_ERROR = "状态错误";

	public final static String UNABLE_EDIT = "100003";//不可编辑

	public final static String WARNING = "100004";//只提示
	/**
	 * 系统报错
	 */
	public final static String RETURN_CODE_SYSTEM_FAIL = "200000";
	public final static String RETURN_MESG_SYSTEM_FAIL = "系统报错";
	/**
	 * 数据已经存在
	 */
	public final static String RETURN_CODE_DATA_EXIST = "300000";
	public final static String RETURN_MESG_DATA_EXIST = "数据已经存在.";
	public final static String RETURN_MESG_DATA_EXIST_PLATFORM = "工具名称重复.";
	/**
	 * 数据为空
	 */
	public final static String RETURN_CODE_DATA_NULL = "400000";
	public final static String RETURN_MESG_DATA_NULL = "数据为空";
	/**
	 * 连接超时
	 */
	public final static String RETURN_CODE_SESSION_NULL = "500000";
	public final static String RETURN_MESG_SESSION_NULL = "连接超时";
	/**
	 * Excel数据错误
	 */
	public final static String RETURN_CODE_EXCEL_FAIL = "500000";
	public final static String RETURN_MESG_EXCEL_FAIL = "EXCEL数据错误";
	/**
	 * 验证码不正确
	 */
	public final static String RETURN_CODE_LOGIN_KAPTCHA = "L00000";
	/**
	 * 用户名或密码错误
	 */
	public final static String RETURN_CODE_LOGIN_NULL = "L00001";
	/**
	 * 用户还未启用
	 */
	public final static String RETURN_CODE_LOGIN_ENABLE = "L00002";
	/**
	 * 没有后台平台权限
	 */
	public final static String RETURN_CODE_LOGIN_PLATFORM = "L00003";
	/**
	 * 调用接口成功
	 */
	public final static String JSON_RETURN_CODE_SUCCESS = "10000";

}
