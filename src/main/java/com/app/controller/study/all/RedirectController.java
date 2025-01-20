package com.app.controller.study.all;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

	
	@GetMapping("/re/re1")
	public String re1() {
		return "re/re1";
	}
	
	@GetMapping("/re/re2")
	public String re2(HttpServletRequest request) {
		System.out.println(request.getParameter("msg"));
		request.setAttribute("msg", "re2 직접넣은 msg");
		return "re/re2";
	}
	
	// re3.jsp에 <script>location함수 사용 => re2로 요청이감 => url주소도 re/re2/로 바뀜 (redirect)
	// re2로직은 실해안됨 => view경로만 바뀐거임.
	@GetMapping("/re/re3")
	public String re3(HttpServletRequest request) {
		
		System.out.println(request.getParameter("msg"));
		System.out.println("re3");
		return "re/re2"; //요청 re3 => view re2
//		return "re/re3"; //요청 re3 => view re3 (location함수 redirect) => re2메소드 실행 => re2 출력
	}
	
	// redirect 방식 => url주소도 바뀜 & re2로직 실행함 & re5메소드 요청도 같이 넘어감
	// 매개변수를 넘길려면 RedirectAttributes를 사용해서 넘겨야됨
	@GetMapping("/re/re4")
	public String re4(HttpServletRequest request, RedirectAttributes ra) {
		System.out.println(request.getParameter("msg"));
		System.out.println("re4");
		
		request.setAttribute("msg", "re4 redirect msg"); //redirect시 안넘어감
		ra.addAttribute("msg", "re4 ra msg");
		
//		return "re/re2"; // view경로 리턴 => /re2.jsp
//		return "redirect:/re/re2?msg=re4 redirect msg";
		return "redirect:/re/re2"; //경로로 요청 => /re/re2
	}
	
	// forward 방식 => url주소는 그대로 re5임 & re2로직 실행함 & re5메소드 요청도 같이 넘어감
	@GetMapping("/re/re5")
	public String re5(HttpServletRequest request) {
		System.out.println(request.getParameter("msg"));
		request.setAttribute("msg", "re5 forward msg");
		return "forward:/re/re2";
	}
	
	
	// redirect, forward 연습문제
	// listTest뒤 경로는 인자로 보냄 => ListTestController에서 @PathVariable을 사용해서 매개변수를 받음
	// redirect => 경로가 바뀜 => http://localhost:8080/jstl/listTest/str
	// str => 경로는 안바뀜 => http://localhost:8080/re/listTest?type=member
	@GetMapping("/re/listTest")
	public String listTest(@RequestParam String type) {
		
		if(type.equals("str")) {
			return "redirect:/jstl/listTest/str";
		} else {
			return "forward:/jstl/listTest/member";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
