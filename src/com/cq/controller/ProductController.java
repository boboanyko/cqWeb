package com.cq.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@RequestMapping("/list")
	public ModelAndView defaultIndex(Model model){
		ModelAndView mv = new ModelAndView("/product/prdList");
		return mv;
	}
}
