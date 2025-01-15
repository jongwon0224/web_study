package com.app.side;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// WebServlet
public class SideServlet {

	// controller1 클래스랑 호환
	// 웹요청이 왔을때 처리
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		
		// 경로별로 컨트롤러 다르게 호출함
		if(requestURI.equals("/quiz04/main1-1")) {
			Controller1 con1 = new Controller1();
			con1.process(request, response);
		}
		
		if(requestURI.equals("/quiz04/1-3")) {
			//어떤 컨트롤러 호출!
		}
		
		
	}
}
