package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.ResponseItem;

@Controller
public class ResponseController {

	@GetMapping("/response1-1")
	public String response1(HttpServletRequest request) {
		request.setAttribute("response001", "message");
		
		return "response1";
	}
	
	@GetMapping("/response1-2")
	public String response2( Model model) {
		model.addAttribute("response002", "모델입니다");
		
		return "response1";
	}
	
	@GetMapping("/response1-3")
	public ModelAndView response3() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("response1");
		mav.addObject("response003", "MaV입니다");

		return mav;
	}
	
	@GetMapping("/response1-4")
	public String response4(@ModelAttribute ResponseItem responseItem, Model model) {
		
		responseItem.setResponse001("001");
		responseItem.setResponse009("009");
		
		model.addAttribute("responseItem", responseItem);
		
//		System.out.println(responseItem.getResponse001());
//		System.out.println(responseItem.getResponse009());
		
		return "response1";
	}
	
	
	
	
	
	
	
}
