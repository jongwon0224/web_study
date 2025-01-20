<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MODEL 객체로 받아오기</h1>
	<h1>이름 : ${name}</h1>
	<h1>키 : ${hei}</h1>
	<h1>몸무게 : ${wei}</h1>
	<h1>BMI 지수 : ${bmi}</h1>
	<br/>
	
	<h1>DTO객체로 받아오기</h1>
	<h1>이름 : ${item.name}</h1>
	<h1>키 : ${item.height}</h1>
	<h1>몸무게 : ${item.weight}</h1>
	<h1>BMI 지수 : ${bmi}</h1>
</body>
</html>