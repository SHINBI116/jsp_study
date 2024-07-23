<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] fruits = {"사과", "오렌지", "배", "귤", "포도"};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Test</title>
</head>
<body>
	
	<h3># JSP Page</h3>
	
	<ul>
		<% for (String fruit : fruits) { %>
			<li><%= fruit %></li>
		<% } %>
	</ul>
	
</body>
</html>