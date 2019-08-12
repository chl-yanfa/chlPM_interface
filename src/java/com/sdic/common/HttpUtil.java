package com.sdic.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
/**
 * 拍卖app推送
 * @author liumin
 *
 */
public class HttpUtil {
	public static void sendMsg(String url, String username, String title, String message,String broadcast) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("username", username));
		nvps.add(new BasicNameValuePair("broadcast", broadcast));
		nvps.add(new BasicNameValuePair("title", title));
		nvps.add(new BasicNameValuePair("message", message));
		nvps.add(new BasicNameValuePair("uri", ""));
		nvps.add(new BasicNameValuePair("remindType", ""));
		CloseableHttpResponse httppHttpResponse = null;
		try {
			httpPost.setEntity(new UrlEncodedFormEntity(nvps,"UTF-8"));
			httppHttpResponse = httpClient.execute(httpPost);
			 System.out.println(httppHttpResponse.getStatusLine());
			String resp = EntityUtils.toString(httppHttpResponse
					.getEntity());
			System.out.println(resp);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				httppHttpResponse.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			httpClient.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String sendMsg(String url) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		CloseableHttpResponse httppHttpResponse = null;
		String resp = null;
		try {
			httpPost.setEntity(new UrlEncodedFormEntity(nvps,"UTF-8"));
			httppHttpResponse = httpClient.execute(httpPost);
			resp = EntityUtils.toString(httppHttpResponse
					.getEntity());
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				httppHttpResponse.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			httpClient.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resp;
	}
	public static void main(String[] args) {
		String url = "http://103.233.130.152:7070/notification.do?action=send";
		String username = "";
		String title = "test";
		String message = "测试试试";
		sendMsg(url,username,title,message,"Y");
	}
}
