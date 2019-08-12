package com.sdic.areas.standard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdic.areas.entity.Areas;
import com.sdic.areas.standard.service.AreasService;


@Controller
@RequestMapping(value = "/areas")
public class AreasController{
	@Autowired
	private AreasService areasService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Areas> getAreas(){
		return areasService.getAreas();			
	}
	
}
