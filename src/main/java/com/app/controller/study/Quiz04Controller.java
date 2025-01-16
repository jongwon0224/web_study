package com.app.controller.study;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.study.Member;

@Controller
public class Quiz04Controller {

	
	@GetMapping("manage/member")
	public String quiz04(@RequestParam String auth, Model model, @ModelAttribute Member member) {
		
		// 1번 jsp에서 처리
		ArrayList<Member> memberList = new ArrayList<Member>();

		memberList.add(new Member("user1", "pass123", "홍길동", "basic"));
		memberList.add(new Member("user2", "pass456", "김철수", "manager"));
		memberList.add(new Member("user3", "pass789", "이영희", "basic"));
		memberList.add(new Member("user4", "passabc", "박민지", "manager"));
		memberList.add(new Member("user5", "passdef", "정재영", "basic"));
		memberList.add(new Member("user6", "passxyz", "최성민", "basic"));
		memberList.add(new Member("user7", "pass123", "서지원", "manager"));
		memberList.add(new Member("user8", "pass456", "장성호", "basic"));
		memberList.add(new Member("user9", "pass789", "신지수", "basic"));
		memberList.add(new Member("user10", "passabc", "한영희", "manager"));
		
		model.addAttribute("memberList", memberList);
		model.addAttribute("auth", auth);
		
		// 2번 컨트롤러에서 처리
		ArrayList<Member> viewMemberList = new ArrayList<Member>();
		
		if(auth.equals("admin")) {
			viewMemberList = memberList;
		}
		
		for(Member mem : memberList) {
			if(auth.equals(mem.getType())) {
				viewMemberList.add(mem);
			} else if(auth.equals(mem.getType())) {
				viewMemberList.add(mem);
			}
		}
		
		model.addAttribute("viewMemberList", viewMemberList);
		
//		for (int i = 0; i < memberList.size(); i++) {
//        if (!memberList.get(i).getType().equals(auth)) {
//            memberList.remove(i);
//            i--;	        	
//        }
//    }
//	
//	if("admin".equals(auth)) {
//		model.addAttribute("userType", "admin");
//	}
		
		
		return "manage/member";
	}
}
