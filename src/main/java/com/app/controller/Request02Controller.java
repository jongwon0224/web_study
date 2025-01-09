package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request02") // requestMapping에 request02를 넣을경우 -> http://localhost:8080/request02/url03로 불러야됨
public class Request02Controller {
	
	@RequestMapping("/url02")
	public String url02() {
		return "url1";
	}
	
	@RequestMapping("/url03")
	public String url03() {
		return "url1";
	}
	

}
