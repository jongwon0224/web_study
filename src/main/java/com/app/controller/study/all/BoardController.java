package com.app.controller.study.all;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {

	@RequestMapping("/faq")
	public String faq() {
		System.out.println("/board/faq 경로로 요청들어옴");
		return "board/faq";
	}
	
	@GetMapping("/notice")
	public String notice() {
		System.out.println("/board/notice 경로로 요청 들어옴");
		return "board/notice/";
	}
	
	// text박스 입력값 출력메소드 (post방식)
	@PostMapping("/notice")
	public String handleNotice(@RequestParam("inputText") String inputText) {
		System.out.println("입력값 : " + inputText);
		return "board/notice";
	}
}
