<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userBean</title>
</head>
<body>
	<!-- java.util.Date = new java.util.Date(); -->
	<jsp:useBean id="date" class="java.util.Date"/>
	<p>
		<% out.println("오늘의 날짜와 시각"); %>
	</p>
	<%=date %>
</body>
</html>