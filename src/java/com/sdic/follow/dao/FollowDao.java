package com.sdic.follow.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.common.Identities;
import com.sdic.follow.entity.Follow;


@Component
public class FollowDao {

	@Autowired 
	private BaseDao baseDao;
	
	
	/**
	 * 根据车辆编号获取关注记录
	 * @param follow
	 * @return
	 * @author 
	 */
	public Follow findFollowByCarCode(Follow follow) {
		 return baseDao.findOne("mapper.standard.FollowMapper.findFollowByCarCode", follow);
	}
	
	/**
	 * 保存关注
	 * @param follow
	 * @return
	 * @author 
	 */
	public int createFollow(Follow follow){
		follow.setId(Identities.uuid2());
		return baseDao.create("mapper.standard.FollowMapper.createFollow", follow);
	}
	
	/**
	 * 更新关注
	 * @param follow
	 */
	public int updateFollow(Follow follow){
		return baseDao.update("mapper.standard.FollowMapper.updateFollow", follow);
	}
}
