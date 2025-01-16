package com.app.controller.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Request01Controller {

	/*
	 * @RequestMapping("/")
	 * public String home() { 
	 * //return "/WEB-INF/views/url/home.jsp"; 
	 * //return "/WEB-INF/views/mainpage.jsp";
	 * 
	 * //--ViewResolver 설정 이후 return "home"; }
	 */

	// 요청 주소별로 맵핑
	@RequestMapping("/url1") // 괄호안에 명시된 주소로 요청이 왔을때 실행
	public String url() {
		return "url1";
	}

	@RequestMapping("/url2")
	public String url2() {
		return "home";
	}

	@RequestMapping("/url3")
	public String url3() {
		return "url1";
	}
	
	//mapping -> "/WEB_INF/view
	//return "/WEB-INF/views/url/url4.jsp"; 폴더안에 파일있기때문에
	@RequestMapping("/url4")
	public String url4() {
		return "url/url4"; // url폴더안에 url4가 있음 -> url/url4
	}
	
	// HTTP 통신 Method = GET / POST / DELETE / PUT / PATCH
	@RequestMapping(value = "/url5", method = RequestMethod.GET) // get만 받음
	public String url5() {
		return "url/url4";
	}
	
	@RequestMapping(value = "url6", method = RequestMethod.POST) // post만 받음
	public String url6() {
		return "url/url4";
	}
	
	@GetMapping("/url7")
	public String url7() {
		return "url/url4";
	}
	
	@PostMapping("/url8")
	public String url8() {
		return "url/url4";
	}
}
