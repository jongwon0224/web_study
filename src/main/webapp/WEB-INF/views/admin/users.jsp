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
	<h1>관리자페이지</h1>
	<h2>사용자 목록</h2>

	<c:forEach var="user" items="${userList}">

		<p>${user.id} ${user.pw} ${user.name}
			<c:choose>
				<c:when test="${user.userType == 'CUS'}">사용자</c:when>
				<c:when test="${user.userType == 'ADM'}">관리자</c:when>
			</c:choose>
		</p>

	</c:forEach>

</body>
</html>