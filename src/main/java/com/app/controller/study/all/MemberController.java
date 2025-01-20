package com.app.controller.study.all;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("/member/signup")
	public String signup() {
		System.out.println("/member/signup 경로 들어옴");
		return "member/signup";
	}
}
