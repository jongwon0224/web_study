package com.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.DrinkItem;

@Controller
public class Practice01Controller {
	
	// request로 받기
	@RequestMapping("/prac01/request1-1")
	public String request1(HttpServletRequest request) {
		
		System.out.println("/request1");
		System.out.println(request.getParameter("item"));
		System.out.println(request.getParameter("type"));
		
		return "prac01/request1";
	}
	// requestParam으로 받기
	@RequestMapping("/prac01/request1-2")
	public String requestParam(@RequestParam String item, @RequestParam String type) {
		
		System.out.println("/requestParam");
		System.out.println(item);
		System.out.println(type);
		
		return "prac01/request1";
	}
	// requestMap으로 받기
	@RequestMapping("/prac01/request1-3")
	public String requestParamMap(@RequestParam Map<String, String>paramMap) {
		System.out.println("/paramMap");
		System.out.println(paramMap.keySet());
		System.out.println(paramMap.get("item"));
		System.out.println(paramMap.get("type"));
		
		return "prac01/request1";
	}
	
	//ModelAttribute로 객체넘기기
	@RequestMapping("/prac01/request1-4")
	public String requestDTO(@ModelAttribute DrinkItem drinkItem) {
		System.out.println(drinkItem.getName());
		System.out.println(drinkItem.getType());
		
		return "prac01/request1";
	}
	
	// 화면전달하기 request방식
	@RequestMapping("/prac01/viewData1-1")
	public String viewData1(HttpServletRequest request) {

		request.setAttribute("name", "americano");
		request.setAttribute("type", "coffee");

		return "prac01/viewData1";
	}
	
	// 화면전달하기 객체방식
	@RequestMapping("/prac01/viewData1-2")
	public String viewData1(Model model) {
		
		model.addAttribute("name", "americano");
		model.addAttribute("type", "coffee");
				
		return "prac01/viewData1";
	}
	
	// 화면전달하기 ModelAndView방식
	@RequestMapping("/prac01/viewData1-3")
	public ModelAndView viewDataMV() {
		// modelAndView객체 생성
		ModelAndView mav = new ModelAndView();
		mav.setViewName("prac01/viewData1");

		mav.addObject("name", "americano");
		mav.addObject("type", "coffee");

		return mav;
	}
	
	// 화면전달하기 Model에 객체단위로 전달방식
	@RequestMapping("/prac01/viewData1-4")
	public String viewDataMV14(Model model) {
		
		model.addAttribute("name", "americano");
		model.addAttribute("type", "coffee");
		
		DrinkItem d1 = new DrinkItem();
		d1.setName("americano");
		d1.setType("coffee");

		model.addAttribute("drinkItem", d1);
		
		return "prac01/viewData1";
	}
	
	
	
}
