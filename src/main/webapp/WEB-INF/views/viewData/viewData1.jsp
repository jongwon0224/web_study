<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ViewData1 Page</h1>
	
	<!--controller 입력값을 웹에 출력하는법-- 1.-->
	<%=request.getAttribute("state") %>
	<%=request.getAttribute("time") %>
		
	<!-- -- 2. <태크>%{변수명}</태크> -->	
	<p>${state}</p>
	<p>${time}</p>
		
	
</body>
</html>