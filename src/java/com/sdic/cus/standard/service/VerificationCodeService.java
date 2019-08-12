package com.sdic.cus.standard.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sdic.common.ResultDTO;
import com.sdic.common.SmsSender;
import com.sdic.cus.dao.VerificationCodeDao;


@Service
public class VerificationCodeService {
	
	@Autowired
	private VerificationCodeDao  verificationCodeDao;
	
	public ResultDTO<String> getVerificationCode(HttpServletRequest request, Map<String, String> conditions){
		ResultDTO<String> res = new ResultDTO<String>();
		
		String sources ="0123456789";
		Random rand = new Random();
		StringBuffer flag = new StringBuffer();
		for(int j=0;j<6;j++){
			flag.append(sources.charAt(rand.nextInt(9))+"");
		}
		System.out.println(flag.toString());
		String code =flag.toString();
		String phone = conditions.get("phone");
		try{
			
		    SmsSender.sendSms(phone, SmsSender.formatmag, SmsSender.PUBLICCODE,code); 
		}catch (Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			Thread.sleep(3000L);
		}catch (InterruptedException e){
			// TODO Auto-generated catch block
						e.printStackTrace();
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("type", 0);
		map.put("code", code);
		map.put("phone", phone);
		verificationCodeDao.addVerificationCode(map);  
		
		return res;
	}

}
