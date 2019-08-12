package com.sdic.areas.standard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdic.areas.dao.AreasDao;
import com.sdic.areas.entity.Areas;

@Service
public class AreasService {
	
	@Autowired
	private AreasDao areasDao;

	public List<Areas> getAreas(){
		List<Areas> areasList = areasDao.getAreas();
		return areasList;
	}

}
