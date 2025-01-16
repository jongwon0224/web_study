package com.app.controller.study;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.study.RequestDTO;

@Controller
public class Request1Controller {
	
	//1번문제
	// request활용
	@GetMapping("/request1-1")
	public String request1(HttpServletRequest request) {
		System.out.println("/request1-1");
		System.out.println("category : " + request.getParameter("category") + " product : " + request.getParameter("product"));
		return "request1";
	}
	
	// PARAM활용
	@GetMapping("/request1-2")
	public String request1(@RequestParam String category, @RequestParam String product) {
		System.out.println("/request1-2");
		System.out.println("category : " + category + " product : " + product);
		return "request1";
	}
	
	// DTO객체활용
	@GetMapping("/request1-3")
	public String request1(@ModelAttribute RequestDTO requestDTO) {
		System.out.println("/request1-3");
		System.out.println("category : " + requestDTO.getCategory() + " product : " + requestDTO.getProduct());
		return "request1";
	}
	
	//Map 활용
	@GetMapping("/request1-4")
	public String request1(@RequestParam Map<String, String> paramMap) {
		System.out.println("/request1-4");
		System.out.println(paramMap.get("category"));
		System.out.println(paramMap.get("product"));
		return "request1";
	}	
}
