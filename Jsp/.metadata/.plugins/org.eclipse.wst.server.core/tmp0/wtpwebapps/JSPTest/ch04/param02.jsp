<%@page import="java.util.Calendar"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param02</title>
</head>
<body>
	<h3>param 액션 태그</h3>
	<jsp:include page="param02_data.jsp">
		<jsp:param value='<%= URLEncoder.encode("오늘 날짜와 시각", "UTF-8") %>' name="title"/>
		<jsp:param value="<%= Calendar.getInstance().getTime() %>" name="date"/>
	</jsp:include>
	<!-- forward와 비슷하지만 조금다름 -->
</body>
</html>