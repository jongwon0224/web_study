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
	
	<p>${name}</p>
    <p>${type}</p>
	<!-- -- 2. <태크>%{변수명}</태크> -->	
	<p>${drinkItem.name}</p>
	<p>${drinkItem.type}</p>
		
	
</body>
</html>