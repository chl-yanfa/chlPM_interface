package com.sdic.admin.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.admin.entity.MemberExam;
import com.sdic.common.BaseDao;

@Component
public class MemberExamDao {
	
	@Autowired 
	private BaseDao baseDao;
	
	public int getMemberExamId(){
		return baseDao.findOne("mapper.standard.MemberExamMapper.getMemberExamId");
	}
	/**
	 * 根据id获取审核信息
	 * @param id
	 * @return
	 */
	public MemberExam getMemberExamById(String id){
		return baseDao.findOne("mapper.standard.MemberExamMapper.getMemberExamById", id);
	}
	
	public int addMemberExam(MemberExam memberExam){
		return baseDao.create("mapper.standard.MemberExamMapper.addMemberExam", memberExam);
	}

}
