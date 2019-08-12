package com.sdic.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;



/**
 * 消息推送类
 * 
 * @author liumin
 * 
 */
public class CometUtil {
	public final static String SEND = "/send";
	public final static String CONN = "/conn";
	public final static String CHARSET = "UTF-8";
	public final static Integer TIMEOUT = 50000;
	public final static String TYPE = "type";
	public final static String CONTENT = "content";
	public final static String MSG = "content";
	//android拍卖推送url
//	public final static String ANDROID_AUCTION_URL = AuthorizationUtil.getInstance().getString("ANDROID_AUCTION_SERVICE_URL");
	private static Log log = LogFactory.getLog(CometUtil.class);

	/**
	 * 推送消息
	 * @param cometContent
	 */
	public static void pushMsg(final String type,final String cometContent){
		Thread thread = new Thread(){
			@Override
			public void run() {
				send(type, cometContent);
			//	sendAndroidAuction(type,cometContent);
			}
		};
		thread.start();
	}
	/**
	 * 处理系统发送的请求
	 * 
	 * @param dto
	 * @return 推送结果
	 */
	public static String send(String type,String content) {
		log.info(type + " commet message send start...");	
		PostMethod post = new PostMethod(AuthorizationUtil.getInstance().getString("COMET_URL") + SEND);
		NameValuePair type_tmp = new NameValuePair(TYPE, type);
		NameValuePair content_tmp = new NameValuePair(CONTENT, content);
		post.setRequestBody(new NameValuePair[] { type_tmp, content_tmp });
		log.info(type + " commet message send end!");	
		return sending(post);
	}

	/**
	 * 推送消息动作
	 * 
	 * @param httpMethod
	 * @return
	 */
	public static String sending(HttpMethod httpMethod) {
		log.info("HttpMethod start.....");
		HttpClient client = new HttpClient();
		client.getParams().setContentCharset(CHARSET);
		client.getParams().setParameter("http.socket.timeout", TIMEOUT);
		client.getHttpConnectionManager().getParams()
				.setParameter("http.socket.timeout", TIMEOUT);
		httpMethod.getParams().setParameter("http.socket.timeout", TIMEOUT);
		httpMethod.getParams().setContentCharset(CHARSET);
		String status = null;
		try {
			int httpStatusCode = client.executeMethod(httpMethod);
			if (httpStatusCode == HttpStatus.SC_OK || httpStatusCode == 301 ) {
				log.debug("推送成功！");
				status = Constants.RETURN_CODE_SUCCESS;
			} else {
				log.debug("方法执行过程中出现了错误");
				status = Constants.RETURN_CODE_SYSTEM_FAIL;
			}
		} catch (HttpException e) {
			httpMethod.releaseConnection();// 释放连接
			e.printStackTrace();
		} catch (IOException e) {
			httpMethod.releaseConnection();// 释放连接
			e.printStackTrace();
		}

		httpMethod.releaseConnection();// 释放连接
		log.info("HttpMethod ended.....");
		return status;
	}

	/**
	 * 客户端和消息推送服务器建立连接
	 * @param request
	 * @param response
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static String conn(HttpServletRequest request,
			HttpServletResponse response) throws ClientProtocolException,
			IOException {
		String params = request.getQueryString();
		StringBuffer url = new StringBuffer(AuthorizationUtil.getInstance().getString("COMET_URL"));
		url.append(CONN);
		if(params!=null){
			url.append("?");
			url.append(params);
		}
		//DefaultHttpClient httpClient = new DefaultHttpClient();
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url.toString()+"&sjs="+Math.random());
		HttpResponse transResp = httpClient.execute(httpGet);
		int status = transResp.getStatusLine().getStatusCode();
		System.out.println("================================连接推送服务器返回状态："+status);
		response.setStatus(status);
		String resp = EntityUtils.toString(transResp.getEntity());
		httpGet.abort();
		httpGet.releaseConnection();
		return resp;
	}

	/**
	 * 安卓端消息推送
	 * 
	 * @param type
	 * @param content
	 */
	public static String sendAndroidMsg(String type,String content) {
		log.info(type + " Android message send start...");	
		if (Constants.COMET_TYPE_NEWPRICE.equals(type)) {
			String contents[] = content.split("\\|");
			content = contents[9];
		}
		PostMethod post = new PostMethod(AuthorizationUtil.getInstance()
				.getString("ANDROID_URL"));
		NameValuePair type_tmp = new NameValuePair(TYPE, type);
		NameValuePair content_tmp = new NameValuePair(CONTENT, content);
		post.setRequestBody(new NameValuePair[] { type_tmp, content_tmp });
		log.info(type + " Android message send end...");
		return sending(post);

		
	}
	/**
	 * 安卓拍卖APP消息推送
	 * 
	 * @param type
	 * @param content
	 */
	public static void sendAndroidAuction(String type,String content) {
		
		/**/Map<String,String> pushData = new HashMap<String,String>();
		pushData.put(TYPE, type);
		pushData.put(CONTENT, content);
		String message = JSONUtil.toJson(pushData);
//		HttpUtil.sendMsg(ANDROID_AUCTION_URL, "", type, message, "Y");
		
		//往百度云推送
//		BaiDuPush.androidPush(message);
		
		/*GeTui tui = new GeTui(type, content);
		Thread t = new Thread(tui);
		t.start();*/
		
	}

	
	public static void main(String args[]) {
		/*Integer waterSize = 5;
		Integer size = Integer.parseInt(AuthorizationUtil.getInstance().getString("BID_TIMES"));
		System.out.println(size);
		System.out.println(waterSize>=size);
		System.out.println(waterSize>=Integer.parseInt(AuthorizationUtil.getInstance().getString("BID_TIMES")));
		*///CometUtil.send("newprice","我的|汽车|哈哈我的|汽车|哈哈我的|汽哈|汽车|哈哈我的|汽车|哈哈");
		//sendAndroidAuction("affirming","交易中...");

		CometUtil.send("pause","|0|||张QX1234456789||123456789|||||||||");
		
		
	}
}
