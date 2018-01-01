package com.cq.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public ModelAndView defaultIndex(Model model){
		ModelAndView mv = new ModelAndView("/pages/index");
		return mv;
	}
		
	@RequestMapping("/cq/indexOld")
	public ModelAndView list(Model model){
		ModelAndView mv = new ModelAndView("/index");
		return mv;
	}
	
	
	@RequestMapping("/cq/index")
	public ModelAndView indexNew(Model model){
		ModelAndView mv = new ModelAndView("/indexNew");
		return mv;
	}
		
		

}
