package com.app.controller.study;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.Product;

@Controller
public class ViewDataController {

	// GetMapping입력된 데이터 viewData1 웹페이지에 출력하기
	// 매개변수로 request를 주는 방식 -> setAttribute(키값, 밸류값)
	@GetMapping("/viewData1")
	public String viewData1(HttpServletRequest request) {

		System.out.println(request.getParameter("p1"));

		request.setAttribute("state", "배고팡");
		request.setAttribute("time", "점심시간");

		return "viewData/viewData1";
	}

	// 매개변수로 객체를 주는 방식 -> addAttribute(키값, 밸류값)
	@GetMapping("/viewData2")
	public String viewData2(Model model) {
		model.addAttribute("state", "배고팡");
		model.addAttribute("time", "10분존버");

		return "viewData/viewData1";
	}

	// ModelAndView를 사용하는 방식-> 매개변수 따로없음
	// 대신 리턴값으로 ModelAndView 객체값임
	@GetMapping("/viewData3")
	public ModelAndView viewData3() {
		// modelAndView객체 생성
		ModelAndView mav = new ModelAndView();
		mav.setViewName("viewData/viewData1"); // 경로설정은 setViewName으로 해야됨

		mav.addObject("state", "죽기직전"); // 키, 밸류값 입력
		mav.addObject("time", "5분전");

		return mav;
	}

	// ModelAndView를 사용하는 방식-> 매개변수로 modelandView를 넣어줌
	// 대신 리턴값으로 ModelAndView 객체값임
	@GetMapping("/viewData4")
	public ModelAndView viewData4(ModelAndView mav) {

		mav.setViewName("viewData/viewData1"); // 경로설정은 setViewName으로 해야됨

		mav.addObject("state", "여유롭다"); // 키, 밸류값 입력
		mav.addObject("time", "점심지남");

		return mav;
	}

	// 객체를 매개변수로 활용하기
	// product객체 생성 -> model.addAttribute에 보내기
	@GetMapping("/viewData5")
	public String viewData5(Model model) {

		model.addAttribute("msg", "집에가고싶다");

		Product product = new Product();
		product.setId("idid");
		product.setName("namename");
		product.setPrice(9090);

		model.addAttribute("item", product);

		return "viewData/viewData5";
	}

	// 파라미터값으로 검색어 보낼때 알맞게 출력
//		@GetMapping("/viewData6")
//		public String viewData6(Model model, HttpServletRequest request) {
//			request.getParameter("searchKeyword");
//		}

	@GetMapping("/viewData6")
	public String viewData6(Model model, @RequestParam(required = false) String searchKeyword) {
		System.out.println(searchKeyword);

		model.addAttribute("searchKeyword", searchKeyword);

		try {
			if (searchKeyword.equals("커피")) {
				Product product = new Product();
				product.setId("아메");
				product.setName("아메리카노");
				product.setPrice(1500);

				model.addAttribute("product", product);
			}
			
			if (searchKeyword.equals("차")) {
				Product product = new Product();
				product.setId("꿀차");
				product.setName("꿀차아");
				product.setPrice(15000);

				model.addAttribute("product", product);
			}
		} catch (Exception e) {
			// 문제에 대한 예외처리
		}

		return "viewData/viewData5";
	}

//		@GetMapping("/viewData6")
//		public String viewData6(Model model, @RequestParam Map<String, String> paramMap) {
//			paramMap.get("searchKeyword");
//			
//			return null;
//		}

}
