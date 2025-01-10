package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@GetMapping("/product/keyboard")
	public String keyboard() {
		return "quiz/product/keyboard";
	}
	
	
}
