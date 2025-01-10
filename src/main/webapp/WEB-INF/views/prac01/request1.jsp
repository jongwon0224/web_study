<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>하이</h1>
	${name}
	${time}
	
	<div>
		<form action="" method="post">
			item : <input type="text" name="name"> <br />
			type : <input type="text" name="type"> <br />
			
		<button type="submit">전송</button>
		</form>
	
	</div>
</body>
</html>