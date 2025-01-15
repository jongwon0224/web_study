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
	<h1>jstl1</h1>
	${msg}
	<hr>
	
	<c:out value="${msg}"/>
	<br/>
	<hr>
	
	<!-- for(int i=1; i<=5; i++ 를 의미함-->
	<c:forEach var="i" begin="1" end="${listSize}" step="1">
		<p>반복됨 ${i}</p>
	</c:forEach>	
	<hr>
	
	<!-- for(DrinkItem drinkItem : drinkList) 를 의미함-->
	<c:forEach var="drinkItem" items="${drinkList}">
		<div>
			<h3>${drinkItem.name} : ${drinkItem.type}</h3>
		</div>
	</c:forEach>
	<hr>
	
	<!-- c:choose활용 => 조건여러개 사용 가능 & when + otherwise는 else임 -->
	<c:choose>
		<c:when test="${userType == 'user'}">
			<p>일반사용자입니다. c:choose사용</p>
		</c:when>
		<c:when test="${userType == 'admin'}">
			<p>관리자입니다. c:choose사용</p>
		</c:when>
		<c:otherwise>
			<p>정체불명입니다. c:choose사용</p>
		</c:otherwise>
	</c:choose>
	<hr>
	
	<!-- c:if활용 => 조건1개만 사용할수있음 -->
	<c:if test="${userType == 'user' }">
		<p>환영합니다. 유저입니다. c:if사용</p>
	</c:if>
	<!-- c:if활용 => 조건1개만 사용할수있음 -->
	<c:if test="${userType == 'admin' }">
		<p>환영합니다. 관리자입니다. c:if사용</p>
	</c:if>
	
	<!-- 로그인 일 경우 불린으로 처리-->
	<c:if test="${isLogin == true}">
		<p>로그인되었습니다</p>
		<button>로그아웃</button>
	</c:if>
	<!-- 로그인 일 경우 불린으로 처리-->
	<c:if test="${isLogin == false}">
		<p>로그아웃되었습니다</p>
		<button>로그인</button>
	</c:if>
</body>
</html>