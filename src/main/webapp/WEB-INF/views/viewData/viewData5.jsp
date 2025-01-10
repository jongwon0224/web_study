<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>viewData5 Page</h1>
	<p>${msg}</p>
	<h3>검색어 : ${searchKeyword}</h3>
	<h3>${product.name}</h3>
	<h3>${product.price}</h3>
	<!-- 객체를 받을때는 객체명.필드값! -->
	<p>${item.name}</p>
	<p>${item.id}</p>
	<p>${item.price}</p>
</body>
</html>