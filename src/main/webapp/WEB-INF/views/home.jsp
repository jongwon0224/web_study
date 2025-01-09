<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Home 페이지1</h1>
<!-- http://localhost8080/board/faq ==> "/board/faq"는 현재주소(localhost8080)에서 board/faq로 이동하라는 명령 -->
	<p><a href="/board/faq">자주묻는질문(FAQ로 이동)</a></p>
	<p><a href="/board/notice">공지사항으로 이동</a></p>
	<p><a href="/member/signup">회원가입으로 이동</a></p>
	
	<div>
		<button onclick="location.href='/member/signup'">회원가입</button>
		<button id="btn_faq">FAQ확인</button>
	</div>
	
	<div>
		<form action="/board/notice" method="post">
			<input type="text" name="inputText" placeholder="입력내용을 작성하세요">
			<input type="submit" value="공지사항확인">
		</form>
	</div>
	
	<script>
		document.getElementById("btn_faq").addEventListener('click', () => {
			location.href = "/board/faq";
		})
	</script>
</body>
</html>