package com.app.controller.study.all;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Quiz08Controller {
	
	// post방식이여서 get방식으로 리턴값으로 지정
	@GetMapping("/quiz/session/login")
	public String login() {
		return "quiz/session/login";
	}
	
	// Post방식 => 파라미터값 session에 저장 & 리다이렉트로 카운트 보내기 
	@PostMapping("quiz/session/login")
	public String handleLogin(@RequestParam("id") String id, @RequestParam("pw") String pw, HttpSession session) {	
		
		String existId = (String) session.getAttribute("id");
		String existPw = (String) session.getAttribute("pw");
		
		if(existId != null && existId.equals(id) && existPw != null && existPw.equals(pw)) {
			return "redirect:/quiz/session/count";
		}
		
		session.setAttribute("id", id);
		session.setAttribute("count", 0);
		session.setAttribute("pw", pw);
		
		return "redirect:/quiz/session/count";
	} 
	
	// 로그인페이지에서 id,count값 세션에서 가져오기
	// 세션값 아이디, 카운트 모델로 보냄
	@GetMapping("/quiz/session/count")
	public String showCountPage(HttpSession session, Model model) {
		String loginId = (String) session.getAttribute("id");
		Integer count = (Integer) session.getAttribute("count");
		
		if(loginId == null) {
			loginId = "로그인 정보없음";
			count = 0;
		} else {
			count += 1;
			session.setAttribute("count", count);
		}
		
		model.addAttribute("loginId", loginId);
		model.addAttribute("count", count);
		
		return "quiz/session/count";
	}
	
	// 로그아웃시 초기화
	@GetMapping("/quiz/session/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/quiz/session/count";
	}
	
	@PostMapping("/quiz/session/logout")
	public String hadleLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/quiz/session/count";
	}
	
	
}
