<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2번</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<%
	Calendar cal = Calendar.getInstance();
	%>
	<p>
		현재 시간 :
		<%=cal.getTime()%></p>
</body>
</html>