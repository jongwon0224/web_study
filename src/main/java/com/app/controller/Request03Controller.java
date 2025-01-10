package com.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.Product;

@Controller
public class Request03Controller {

	// 1. form태그안에서 파라미터 받는 방식
	@GetMapping("/param1")
	public String param1(HttpServletRequest request) {
		System.out.println("/param1");
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("count"));
		
		return "requestParam/param1";
	}
	// 1. form태그안에서 파라미터 받는 방식
	@PostMapping("/param2")
	public String param2(HttpServletRequest request) {
		System.out.println("/param2");
		//파라미터 명칭이 form태그안에 name이랑 같아야됨
		System.out.println(request.getParameter("id")); // param1.jsp파일 -> name="id" 
		System.out.println(request.getParameter("pw")); // param1.jsp파일 -> name="pw"
		
		return "requestParam/param2";
	}
	// 1. form태그안에서 파라미터 받는 방식
	@RequestMapping("/param3") // 다중 parameter받기 (request.getparameterValues == 배열)
	public String param3(HttpServletRequest request) {
		
		System.out.println("/param3");
		System.out.println("p1 : " + request.getParameter("p1")); // String return해줌
		System.out.println("p2 : " + request.getParameter("p2"));
//		request.getParameterValues("p3"); //String 배열 return해줌		
		String [] p3Values = request.getParameterValues("p3");
		for(String p3 : p3Values) {
			System.out.println("p3 : " + p3);
		}
		
		return "requestParam/param2";
	}
	
	
	@RequestMapping("/param4") // requestParam String p1 -> p1에 해당하는 인자값 바로 넘겨줌
	public String param4(@RequestParam String p1, @RequestParam String p2) {
		System.out.println("/param4");
		System.out.println(p1);
		System.out.println(p2); // p2매개변수 없으면 오류나옴
		
		return "requestParam/param2";
	}
	
	@RequestMapping("/param5") // 파라미터에 p2값 안넣으면 오류 -> @RequestParam(required = false)로 해결
	public String param5(@RequestParam String p1, @RequestParam(required = false) String p2) {
		System.out.println("/param5");
		System.out.println(p1);
		System.out.println(p2); // p2 매개변수 없어도 리턴값없이 실행됨
		
		return "requestParam/param2";
	}
	
	@RequestMapping("/param6") // param1Value로 변수명해도 @RequestParam(value="p1")때문에 밸류값이 p1인 키값을 리턴해줌
	public String param6(@RequestParam(value="p1") String param1Value, 
						 @RequestParam(required = false, defaultValue="default") String p2) {
		
		System.out.println("/param6");
		System.out.println(param1Value); // 매개변수랑 변수명 동일 but 실제 리턴값은 p1임
		System.out.println(p2); // p2에 매개변수 안들어와도 그냥 default값을 리턴해줌
		
		return "requestParam/param2";
	}
	// @PathVariable -> 경로뒤에 값을 출력 => 매개변수를 받는게 아니라 경로를 받음(param7?item=1&id=4)가 아니라 param7/item이런느낌
 	@RequestMapping("/param7/{itemId}")
	public String param7(@PathVariable String itemId) {
		System.out.println("/param7");
		System.out.println(itemId);
		
		return "requestParam/param2";
	}
 	
 	// map방식으로 다중 파라미터 받는법 <==> @Requestparam(value=p1)String p1, @Requestparam(value=p2)String p2는 너무 김 Map으로 변환
 	@RequestMapping("/param8")
 	public String param8(@RequestParam Map<String, String>paramMap) {
 		System.out.println("/param8");
 		System.out.println(paramMap.keySet()); // map방식 키값
 		System.out.println(paramMap.get("p1")); // key값에 맞는 밸류값 출력
 		System.out.println(paramMap.get("p2")); // key값에 맞는 밸류값 출력
 		System.out.println(paramMap.get("p3")); // key값에 맞는 밸류값 출력
 		return "requestParam/param2";
 	}
	
 	// 화면을 보여줌 (get)
 	@GetMapping("/param9")
 	public String param9() {
 		
 		
 		return "requestParam/param9";
 	}
 	// 변수를 받아서 후속처리해줌 (post)
 	// form태그안에서 값 받아올때는 객체(product)에서 getter, setter를 만들어야됨)
 	@PostMapping("/param9")
 	public String param9Action(@ModelAttribute Product product) {
 		
 		System.out.println(product.id);
 		System.out.println(product.name);
 		System.out.println(product.price);
 		System.out.println(product.getPrice());
 		
 		
 		return "requestParam/param9after";
 	}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
}
