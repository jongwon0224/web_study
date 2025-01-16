<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>접속정보</h1>
	<p>사용자 ID: ${loginId}</p>
    <p>접속 횟수: ${count}</p>
    
    <form action="/quiz/session/logout" method="post">
    	<button type="submit">로그아웃</button>
    </form>

</body>
</html>