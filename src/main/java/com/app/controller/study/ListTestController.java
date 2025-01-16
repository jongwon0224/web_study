package com.app.controller.study;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.study.MemberDTO;

@Controller
public class ListTestController {
	
	
	@GetMapping("jstl/listTest/{type}")
	public String typeStr(@PathVariable String type, Model model, @ModelAttribute MemberDTO memberDTO) {
		
		List<String> strList = new ArrayList<>();
		
		
		if(type.equals("str")) {
			for(int i=1; i<=10; i++) {
				String strLi = "스트링 리스트입니다.";
				strList.add(strLi);
				model.addAttribute("strLi", strList);
			}
		} else if(type.equals("member")) {
			for(int i=1; i<=5; i++) {
				memberDTO.setId("아이디"+i);
				memberDTO.setName("이름" + i);
				memberDTO.setPw("비번" + i);
				
				strList.add(memberDTO.getId() + memberDTO.getPw() + memberDTO.getName());
			}
		}
		
		model.addAttribute("strList", strList);
		
		return "jstl/listTest";
	}
}
