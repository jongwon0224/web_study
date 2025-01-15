package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Quiz07Controller {

	
	@GetMapping("/scopeCheck/{var}")
	public String scopeFirst(@PathVariable String var, HttpSession session, Model model) {
		
		if(var.equals("first")) {
			if(session.getAttribute("accessUrl") != null) {
				session.getAttribute("accessUrl");
			} else {
				model.addAttribute("accessUrl", var);
			}
		}
		
		if(var.equals("firsthide1"))
			model.addAttribute("accessUrl", var);
		
		if(var.equals("firsthide2")) {
			session.setAttribute("accessUrl", "firsthide2");			
			return "redirect:/scopeCheck/first";
		}
		
		return "quiz07/targetPage";
	}
}
