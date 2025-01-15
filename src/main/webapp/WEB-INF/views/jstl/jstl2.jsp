<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jstl2</h1>
	
	<!-- c:set으로 밸류값 넣기 (잘안씀) -->
	<c:set var="var1" value="값들어가는곳"/>
	${var1}
	
	<!-- url 처리 => c:url & c:redirect -->
	
	<a href="/jstl1">jstl1페이지</a>
	<!-- jstl로 a태그 활용하는 법 => c:url사용 -->
	<c:url var="jstl1Url" value="/jstl1"/>
	<a href="${jstl1Url}">jstl1 curl</a>
	
	<!-- c:redirect는 뒤에 url주소로 자동변환됨 -->
	
	<!-- 악의적인 공격 방어 -->
	<c:out value="${msgXml}" escapeXml="true"/>
	<c:out value="${msg1}" escapeXml="true"/>
	<c:out value="${msg2}" escapeXml="true"/>
	
</body>
</html>