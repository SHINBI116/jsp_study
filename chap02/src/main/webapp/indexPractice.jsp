<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	form {display: grid; grid-template-columns: 20% 80%; grid-template-rows: repeat(3, 1fr);}
	input {display: block; margin: 5px;}
</style>
</head>
<body>
	<h3>회원가입 예시</h3>
	
	<form action="/chap02/user" method="POST">
		<div>이름:</div>
		<input type="text" name="user_name" placeholder="이름을 입력해주세요"/>
		<div>아이디:</div>
		<input type="text" name="user_id" placeholder="아이디입력"/>
		<div>비번:</div>
		<input type="password" name="user_password" placeholder="비번입력"/>
		<input id= "submit-btn" type="submit" value ="가입하기"/>
	</form>
		
</body>
</html>