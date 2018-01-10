package com.cq.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cq.model.CqPrd;
import com.cq.model.CqPrdPic;
import com.cq.service.CqPrdPicService;
import com.cq.service.CqPrdService;
import com.cq.util.Consts;

@Controller
public class ProductController {
	
	@Autowired
	private CqPrdService cqPrdService;
	
	@Autowired
	private CqPrdPicService cqPrdPicService;
	
	@RequestMapping("/groupList/{moduleNo}")
	public ModelAndView defaultIndex(Model model,
			@PathVariable("moduleNo") String moduleNo){
		ModelAndView mv = new ModelAndView("/product/prdList");
		return mv;
	}
	
	@RequestMapping("/prd/getPrdList")
	@ResponseBody
	public Map<String,Object> getPrdList(HttpServletResponse response){
		Map<String,Object> model = new HashMap<>();
		model.put("result", Consts.RET_SUCCESS);
		
	    setResponseHeader(response);  
		
		List<CqPrd> cqPrdList = this.cqPrdService.getPrdList();
		if(CollectionUtils.isEmpty(cqPrdList)){
			model.put("result", Consts.RET_FAILURE);
			return model;
		}
		model.put("cqPrdList", cqPrdList);
		return model;
	}

	@RequestMapping("/prd/getPrdPicList")
	@ResponseBody
	public Map<String,Object> getPrdPicList(HttpServletResponse response,String prdId){
		Map<String,Object> model = new HashMap<>();
		model.put("result", Consts.RET_SUCCESS);
		
	    setResponseHeader(response);  
		
		this.cqPrdPicService.getPrdPicList(prdId,model);
//		List<Map<String,Object>> cqPrdPicList = this.cqPrdPicService.getPrdPicList("1455245a-f370-11e7-aed5-00163e0a61be");
		
		return model;
	}
	
	private void setResponseHeader(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");  
        response.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");  
        response.setHeader("X-Powered-By"," 3.2.1");
	}
}
