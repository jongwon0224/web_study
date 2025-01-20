<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BMI 계산하기</h1>
	
	<div>
		<form action="/quiz04/result-bmi" method="post">
			<input type="text" name="name" placeholder="이름 입력해주세요 :">
			<input type="text" name="height" placeholder="키를 입력해주세요 :">
			<input type="text" name="weight" placeholder="몸무게를 입력해주세요 : ">
			<button id="btn_bmi">계산하기</button>
		</form>
	</div>
</body>
</html>