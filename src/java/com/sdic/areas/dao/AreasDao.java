package com.sdic.areas.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdic.common.BaseDao;
import com.sdic.areas.entity.Areas;


@Component
public class AreasDao {
	
	@Autowired
	private BaseDao baseDao;
	public List<Areas> getAreas() {
		return baseDao.findList("mapper.standard.AreasMapper.getAreas");
	}
}
