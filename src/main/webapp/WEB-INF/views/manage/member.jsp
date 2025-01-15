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
		
		<h1>jsp에서 필터링후 리스트 넘김</h1>
		<c:choose>
			<c:when test="${auth == 'basic'}">
				<c:forEach var="member" items="${memberList }">
					<c:if test="${member.type == 'basic'}">
						<h3>${member.id} - ${member.name} - ${member.type}</h3>
					</c:if>
				</c:forEach>
			</c:when>
			
			<c:when test="${auth == 'manager'}">
				<c:forEach var="member" items="${memberList }">
					<c:if test="${member.type == 'manager'}">
						<h3>${member.id} - ${member.name} - ${member.type}</h3>
					</c:if>
				</c:forEach>	
			</c:when>
			
			<c:when test="${auth == 'admin'}">
				<c:forEach var="member" items="${memberList }">
					<h3>${member.id} - ${member.name} - ${member.type}</h3>
				</c:forEach>
			</c:when>
		</c:choose>
		
		
		<hr>
		<h1>Controller에서 필터링후 리스트 넘김</h1>
		<c:forEach var="member" items="${viewMemberList}">
			<h3>${member.id} - ${member.name} - ${member.type}</h3>
		</c:forEach>
		
		
</body>
</html>