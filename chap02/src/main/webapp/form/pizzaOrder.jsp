<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// JSP 페이지에는 선언하지 않고도 사용 할 수 있는
	// request 객체가 존재한다 (request 내장 객체)
	String topping = request.getParameter("topping");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>토핑 선택 결과!</title>
</head>
<body>

	<h1>당신은 <%= topping %> 피자를 선택하셨습니다!</h1>

</body>
</html>