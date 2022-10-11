<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorPage_error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorPage</title>
</head>
<body>
	<!-- 오류, 문법상 오류없음 -->
	name 파라미터 : <%= request.getParameter("name").toUpperCase() %>
</body>
</html>