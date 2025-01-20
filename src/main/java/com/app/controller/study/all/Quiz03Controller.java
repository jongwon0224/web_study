package com.app.controller.study.all;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Quiz03Controller {

	@RequestMapping("/quiz03/pathA")
	public String pathA() {
		System.out.println("quiz03/pathA");
		return "/quiz03/pathA";
	}
	
	@RequestMapping("/quiz03/pathB")
	public String pathB() {
		System.out.println("quiz03/pathB");
		return "/quiz03/pathB";
	} 
	
	@RequestMapping("/quiz03/pathCommon/A")
	public String pathCommonA() {
		System.out.println("quiz03/pathCommon/A");
		return "/quiz03/pathCommon/A";
	}
	
	@RequestMapping("/quiz03/pathCommon/B")
	public String pathCommonB() {
		System.out.println("quiz03/pathCommon/B");
		return "/quiz03/pathCommon/B";
	}
}
