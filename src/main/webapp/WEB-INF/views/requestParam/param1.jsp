<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Request Param1</h1>
	
	<div>
	
		<form action="/param2" method="post">
			<input type="text" name="id"><br/>
			<input type="text" name="pw"><br/>
			<button type="submit">전송</button>
		</form>
		
		<a href="/param2?id=asdf&pw=123">param2로</a>
	
	</div>
</body>
</html>