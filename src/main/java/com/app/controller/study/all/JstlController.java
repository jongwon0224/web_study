package com.app.controller.study.all;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.dto.study.DrinkItem;

@Controller
public class JstlController {

	
	@GetMapping("/jstl1")
	public String jstl1(Model model) {
		//1번 기존 했던 데로 (jstl사용안함)
		model.addAttribute("msg", "이것은 메시지다.");
		
		//2번 (jstl사용함)
		DrinkItem d1 = new DrinkItem();
		d1.setName("아메리카노");
		d1.setType("coffee");
		model.addAttribute("d1", d1);
		
		
		//3번 리스트타입 데이터 넘기는법 -> 리스트에 데이터추가 -> 모델객체에 전달
		// 3-1 -> 기존 for문 사용은 jstl1.jsp에 있음
		// 3-2 -> 향상된 for문사용은 jstl1.jsp밑에 있음
		List<DrinkItem> drinkList = new ArrayList<DrinkItem>();
		drinkList.add(new DrinkItem("카페라떼", "커피"));
		drinkList.add(new DrinkItem("카페모카", "커피"));
		drinkList.add(new DrinkItem("카푸치노", "커피"));
		drinkList.add(new DrinkItem("아이스티", "차"));
		drinkList.add(new DrinkItem("홍차", "차"));
		drinkList.add(new DrinkItem("카카오차", "차"));
		
		model.addAttribute("drinkList", drinkList); // 리스트타입 데이터 넘기는법
		model.addAttribute("listSize", drinkList.size()); // {listSize} => 동적으로 변경위해 리스트 사이즈를 변수로줌
		
		// c:if사용해서 처리함
		// useType : "user" "admin"
		model.addAttribute("userType", "admin");
		
		// c:if사용해서 처리함 => 로그인일 경우 불린타입으로 처리
		model.addAttribute("isLogin", true);
		
		return "jstl/jstl1";
	}	
		
		
	@GetMapping("/jstl2")
	public String jstl2(Model model) {
		
		// 악의적인 공격방지 => <c:out value="" excapeXml="true"/> 사용
		model.addAttribute("msgXml", "<script>alert('경고')</script>");
		model.addAttribute("msg1", "<부등호>");
		model.addAttribute("msg2", "&lt;부등호&gt;");
		
		
		return "jstl/jstl2";
	}
	
	
	
	
	
	
	
	
	
}
