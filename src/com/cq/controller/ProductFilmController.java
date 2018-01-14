package com.cq.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cq.model.CqPrdFilm;
import com.cq.service.CqPrdFilmService;
import com.cq.util.Consts;

@Controller
public class ProductFilmController {
	
	@Autowired
	private CqPrdFilmService cqPrdFilmService;
	
	
	@RequestMapping("/prd/getPrdFilmList")
	@ResponseBody
	public Map<String,Object> getPrdFilmList(HttpServletResponse response){
		Map<String,Object> model = new HashMap<>();
		model.put("result", Consts.RET_SUCCESS);
		
	    setResponseHeader(response);  
		
		List<CqPrdFilm> cqPrdFilmList = this.cqPrdFilmService.getPrdFilmList();
		model.put("cqPrdFilmList", cqPrdFilmList);
		return model;
	}

	
	private void setResponseHeader(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");  
        response.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");  
        response.setHeader("X-Powered-By"," 3.2.1");
	}
}
