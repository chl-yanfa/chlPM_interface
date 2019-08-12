package com.sdic.follow.standard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdic.follow.dao.FollowDao;
import com.sdic.follow.entity.Follow;


/**
 * 
 * 
 * 项目名称：sdicPM_interface
 * 类名称：FollowService
 * 类描述：会员关注
 * 创建人：刘民
 * 创建时间： 2018年11月20日 下午6:46:07
 * 修改人：刘民
 * 修改时间： 2018年11月20日 下午6:46:07
 * 修改备注： 
 * @version 
 */
@Service
public class FollowService {
	
	@Autowired 
	private FollowDao  followDao;
	
	/**
	 * 根据车辆编号获取关注记录
	 * @param follow
	 */
	public Follow findFollowByCarCode(Follow follow){
		return followDao.findFollowByCarCode(follow);
	}
	
	/**
	 * 新增关注
	 * @param follow
	 */
	public int createFollow(Follow follow){
		return followDao.createFollow(follow);
	}
	
	/**
	 * 更新关注
	 * @param dmauCustomerAttention
	 */
	public int updateFollow(Follow follow){
		return followDao.updateFollow(follow);
	}
}
