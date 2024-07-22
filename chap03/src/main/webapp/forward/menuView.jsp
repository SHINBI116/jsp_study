<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div>선택한 메뉴는 <%= request.getParameter("menu") %>입니다.</div>
	<div>이 메뉴를 주문하시겠습니까?</div>
	<button>예</button>
	<button>아니오</button>
	
</body>
</html>