package com.sdic.common;

public class Constants {
	
	
	public final static String RETURN_CODE_SYSTEM_FAIL       = "200000";// 系统错误
	public final static String RETURN_MSG_SYSTEM_FAIL    = "操作失败";
	public final static String RETURN_CODE_SUCCESS           = "000000";// 成功
	public final static String RETURN_CODE_SUCCESS1           = "000001";// 成功
	public final static String RETURN_MSG_SUCCESS        = "操作成功";// 成功
	public final static String RETURN_CODE_DATA_NULL         = "400000";// 数据为空
	public final static String RETURN_MSG_DATA_NULL      = "数据为空";//数据为空
	public final static String RETURN_CODE_PASS_ERROR        = "000002";// 账号或密码错误
	public final static String RETURN_CODE_CODE_ERROR        = "000004";// 
	public final static String RETURN_CODE_PHONE_ERROR        = "000005";
	public final static String RETURN_CODE_KAPTCHA_ERROR     = "000003";// 验证码错误
	/** 正常登录  */
	public final static String  MERCHANTS_FORCE_LOGIN_NORMAL = "0";
	
	
	public final static String DELETE_YES = "1";//删除
	public final static String DELETE_NO = "0";//未删除
	
	
	
	/** 参拍模式-所有参拍模式*/
	public final static String AUCTION_MODEL_ALL = "1234";
	/** 参拍模式-即时拍+长时拍 */
	public final static String AUCTION_MODEL_J_C = "0";
	
	
	
	//删除标示
	public final static String DELETE_FLAG_YES = "1";//已删除
	public final static String DELETE_FLAG_NO = "0";//未删除
	
	/** 关注 */
	public final static String CUSTOMER_ATTENTION_YES = "1";
	/** 取消关注 */
	public final static String CUSTOMER_ATTENTION_NO = "0";
	/** 关注来源-关注 */
	public final static String SOURCE_ATTENTION = "0"; //关注
	
	/** 存储会员信息的session名称 */
	public final static String  CUSTOMER_SESSION_INFO_NAME = "customerInfo";
	/** 存储会员信息的cookie名称 */
	public final static String  CUSTOMER_SESSION_INFO_NAME_COOKIE = "customerInfo_C";
	public final static String  CUSTOMER_SESSION_INFO_NAME_COOKIE2 = "customerInfo_N";
	
	/** 登录设备-PC  */
	public final static String  DEVICE_TYPE_PC = "1";
	
	/** 您的出价金额不能为空。 */
	public final static String PRICE_NOT_NULL="800020";
	/** 当前订单状态，不支持此次出价方式 */
	public final static String QUOTEPRICE_NOT_SUPPORT = "800010";
	/** 您的出价不合法。 */
	public final static String PRICE_ERROR="800030";
	public final static String RETURN_CODE_PARAMETER_NULL    = "100000";// 参数为空（输入参数数据）
	
	/** 您的保证金余额不足，请充值。 */
	public final static String MARGIN_LESS="800080";
	
	/** 出价类型-竞价*/
	public final static String BID_TYPE_BIDDING = "0";
	
	public final static String ORDER_STATUS_AUCTIONING   =  "20"; //竞拍中
	
	/** 承诺类型-不限 */
	public final static String  PROMISES_TYPE_UNLIMITED = "2";
	
	/** 当前报价过低 */
	public final static String PRICE_VERY_LOW="800130";
	
	/** 未达到最小加价幅度 */
	public final static String NOT_SMALLEST_INCREASE ="800180";
	
	/** 报价或竞价未开始*/
	public final static String NOT_START = "800060";
	/** 报价或竞价已结束*/
	public final static String ENDED = "800070";
	
	/** 流水操作类型-冻结保证金*/
	public final static String MARGIN_WATER_OPERATOR_TYPE_MARGIN = "1";
	/** 流水操作类型 -解冻保证金*/
	public final static String MARGIN_WATER_OPERATOR_TYPE_UNMARGIN = "2";
	/** 流水操作类型 -违约扣除*/
	public final static String MARGIN_WATER_OPERATOR_TYPE_DEDUCTION = "3";
	/** 流水操作类型 -财务退款*/
	public final static String MARGIN_WATER_OPERATOR_TYPE_FINANCIAL_REFUNDS = "5";
	/** 流水操作类型 -财务扣款*/
	public final static String MARGIN_WATER_OPERATOR_TYPE_FINANCIAL_AFFAIRS = "6";
	/** 流水操作类型 -冻结+违约扣除*/
	public final static String MARGIN_WATER_OPERATOR_TYPE_FROZEN_DEDUCTION = "13";
	
	/** 出价-推送时使用 */
	public final static String COMET_TYPE_NEWPRICE = "newprice";

}
