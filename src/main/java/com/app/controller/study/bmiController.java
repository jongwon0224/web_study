package com.app.controller.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.study.Bmi;

@Controller
public class bmiController {

	
	@RequestMapping("/quiz04/ask-bmi")
	public String askBmi() {
		System.out.println("/quiz04/ask-bmi 경로로 요청들어옴");
		return "/quiz04/ask-bmi";
	}
	
	@PostMapping("/quiz04/result-bmi")
	public String resultBmi(@RequestParam String name, @RequestParam String height, @RequestParam String weight, Model model) {
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		
		double hei = Double.parseDouble(height);
		double wei = Double.parseDouble(weight);
		double bmi = wei / (hei * 2) * 100;
		String s_bmi = String.format("%.2f", bmi);
		
		//bmDTO객체로 화면출력
		Bmi bm = new Bmi();
		bm.setName(name);
		bm.setHeight(hei);
		bm.setWeight(wei);
		
		model.addAttribute("item", bm);
		
		//model객체로 출력
		model.addAttribute("name", name);
		model.addAttribute("hei", hei);
		model.addAttribute("wei", wei);
		model.addAttribute("bmi", s_bmi);
		
		return "/quiz04/result-bmi";
	}
	
	
	
}
