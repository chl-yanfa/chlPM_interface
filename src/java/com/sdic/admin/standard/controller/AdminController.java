package com.sdic.admin.standard.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sdic.admin.entity.MemberExam;
import com.sdic.admin.standard.service.AdminService;
import com.sdic.common.BaseController;
import com.sdic.common.Constants;
import com.sdic.common.ResultDTO;
import com.sdic.common.RtnMsgConstants;

/**
 * 项目名称：	sdicPM_interface
 * 类名称：	AdminController
 * 类描述：	
 * 创建人：	zhangwanxin
 * 创建时间： 	2018年12月6日17:08:55
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController extends BaseController{
	private static final Logger logger = Logger.getLogger(AdminController.class);
	@Autowired
	private AdminService adminService;
	
	
	/**
	 * auditCertification() 审核用户实名认证
	 * @param  request
	 * @return 
	 */
	@RequestMapping(value = "/auditCertification", method = RequestMethod.POST)
    @ResponseBody
    public ResultDTO<String> auditCertification(@RequestBody MemberExam memberExam,HttpServletRequest request){
		return adminService.auditCertification(memberExam,request);
	}
	
	/**
	 * uploadImage() 上传图片--实名认证
	 * @param  request
	 * @return 
	 */
	public static ResourceBundle CONFIG = ResourceBundle.getBundle("application");
	private static String fileRoot = CONFIG.getString("customer.certification.imgpath");
	
	@RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
	@ResponseBody
	public ResultDTO<String> uploadImage(@RequestParam("file") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		ResultDTO<String> res = new ResultDTO<String>();
		response.setCharacterEncoding("utf-8");
		logger.info("开始调用上传图片-uploadImage-接口");
		try {
			String name = file.getOriginalFilename();
			String suffix = name.substring(name.lastIndexOf("."));
			String formatName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" + (new Random().nextInt(900) + 100);
			String fullName = formatName + suffix;
			String filedir=fileRoot;
			File fullFile = new File(filedir, fullName);
			if (!fullFile.exists()) {
				fullFile.getParentFile().mkdirs();
				System.out.println(fullFile.getParentFile().mkdirs());
				try {
					fullFile.createNewFile();
					System.out.println(fullFile.createNewFile());
					file.transferTo(fullFile);
					logger.info("上传文件的全路径=======["+fullName+"]=======上传文件的全路径");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			//返回一个文件全名
			res.setEntity(fullName);
			res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
			res.setReturnMsg("上传成功");
		} catch (Exception e) {
			res.setReturnMsg("upload error");
			res.setReturnCode(RtnMsgConstants.RETURN_CODE_SYSTEM_FAIL);
			e.printStackTrace();
		}
		logger.info("结束调用上传图片-uploadImage-接口");
		return res;
	}
}
