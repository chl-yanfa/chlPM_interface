package com.sdic.common;

import java.io.IOException;
import java.util.Properties;

import com.opensymphony.util.TextUtils;



public class AuthorizationUtil {
	private static AuthorizationUtil me;
	public static String  COMET_URL = "";

	public static AuthorizationUtil getInstance() {
		if (me == null) {
			me = new AuthorizationUtil();
		}
		return me;
	}

	private Properties command = new Properties();
	private long lastLoaded;

	private long refreshInterval;

	public AuthorizationUtil() {
		init();
	}

	/**
	 * 读取属性值
	 * 
	 * @param key
	 * @return
	 */
	public synchronized String getString(String key) {
		if (System.currentTimeMillis() - lastLoaded >= refreshInterval) {
			init();
		}

		return command.getProperty(key);
	}

	/**
	 * 装载command属性信息
	 */
	private synchronized void init() {
		try {
			command.clear();
			command.load(getClass().getResource("/command.properties").openStream());
			lastLoaded = System.currentTimeMillis();
			refreshInterval = TextUtils.parseLong(command.getProperty("refresh.interval"));
			COMET_URL = command.getProperty("COMET_URL");//推送服务器连接地址
			if (refreshInterval == 0L) {
				/** 默认十分钟 */
				refreshInterval = 10 * 60 * 1000;
			}
		} catch (IOException ex) {
		}
	}

	/**
	 * 读取key值
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("unused")
	private String getKeyValue(String key) {
		return command.getProperty(key);
	}
}
