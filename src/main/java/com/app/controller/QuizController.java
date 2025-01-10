package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	
	@GetMapping("/main")
	public String main() {
		return "quiz/main";
	}
	
	@GetMapping("/product/mouse")
	public String product() {
		return "quiz/product/mouse";
	}
	
	@GetMapping("/req1")
	public String req1() {
		System.out.println("/quiz/req1 Get요청");
		return "quiz/req1";
	}
	
	@PostMapping("/req1")
	public String req1Post() {
		System.out.println("/quiz/req1 Post요청");
		return "quiz/req1";
	}
	
//	@RequestMapping("/req2") -> requestMapping은 Get, post둘다 받아줌
//	@GetMapping("/req2")
//	public ModelAndView req2(ModelAndView mav) {
//		System.out.println("/quiz/req2 Get요청");
//		
//		mav.setViewName("quiz/req1");
//
//		mav.addObject("data1", "data1");
//		mav.addObject("data2", "data2");
//		
//		return mav;
//	}
	
	@GetMapping("/req2")
	public String req2(HttpServletRequest request) {
			
		System.out.println(request.getParameter("data1"));
		System.out.println(request.getParameter("data2"));
		
		request.setAttribute("data1", request.getParameter("data1"));
		request.setAttribute("data2", request.getParameter("data2"));
		
		return "quiz/req1";
	}
	
}
