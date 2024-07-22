<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward연습용</title>
</head>
<body>
	
	<form action="./cafeMenu/select" method="GET">
		<select name="menu">
			<option value="americano">아메리카노</option>
			<option value="latte">카페라떼</option>
			<option value="ice-tea">아이스티</option>
		</select>
		<input type="submit" value="메뉴하나를 골라주세요"/>
	</form>
	
</body>
</html>