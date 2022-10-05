<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param02_data</title>
</head>
<body>
	<%
		String title = request.getParameter("title");
	%>
	<!-- title 자리에 request.getParameter("title") 넣어도  -->
	<h3><%= URLDecoder.decode(title,"UTF-8") %></h3>
	Today is :<%= request.getParameter("date") %>
</body>
</html>