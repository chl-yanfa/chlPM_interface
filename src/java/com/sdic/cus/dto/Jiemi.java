package com.sdic.cus.dto;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;
 
public class Jiemi extends DruidDataSource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	@Override
	public void setUsername(String username) {
		try {
			username = ConfigTools.decrypt(username);
			System.out.println(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.setUsername(username);
	}
	
	@Override
	public void setPassword(String password) {
		try {
			password = ConfigTools.decrypt(password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.setPassword(password);
	}
	
	public static void main(String[] args) {
		Jiemi jm = new Jiemi();
		jm.setUsername("Sm/4o8Z0Hgg4uatpnH4qgJ8MIHvbCJpa+D76HN7PFJ89eOeHHiDQuUQDM61797MWRtkunFOo2KIxj1AnAFp/gg==");
	}
}
