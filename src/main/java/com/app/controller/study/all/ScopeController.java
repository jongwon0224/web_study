package com.app.controller.study.all;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScopeController {

	
	@GetMapping("/scope1")
	public String scope1(Model model) {
		
		model.addAttribute("requestMsg", "request scope 메시지");
		
		return "scope/scope1";
	}
	
	@GetMapping("/scope2")
	public String scope2(HttpServletRequest request) {
		//request활용
		request.setAttribute("requestMsg", "request scope 메시지");
		
		//session활용 => 같은 주소로 리턴하면 기존 저장되어있는 데이터 보여줌
		HttpSession session = request.getSession();
		session.setAttribute("sessionMsg", "session scope 메시지");
		
//		application영역 => 앱전체
		ServletContext app = request.getServletContext();
		app.setAttribute("applicationMsg", "application scope 메시지");
//		app.removeAttribute("aplicationMsg"); 삭제
		
		return "scope/scope2";
	}
	
	
	@GetMapping("/scope3")
	public String scope3() {
		return "scope/scope3";
	}
	
	
	@GetMapping("/scope4")
	public String scope4(HttpSession session) {
		// 매개변수로 HttpSession session을 넣으면 session에 바로 접근할수있음
//		HttpSession session = request.getSession();
//		session.setAttribute("sessionMsg", "session scope 메시지");
		
		session.setAttribute("sessionMsg", "/scope4 session scope 메시지"); // scope3에 있는 세션 오버라이딩
		session.removeAttribute("sessionMsg"); // session삭제하는법 => removeAttribute("키값")
		session.invalidate(); // session영역에 저장된 모든 속성 삭제 (초기화)
				
		return "scope/scope3";
	}
	
	
	
	
	
	
	
}
