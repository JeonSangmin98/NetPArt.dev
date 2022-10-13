<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String userId = (String) session.getAttribute("userID");
	String userPwd = (String) session.getAttribute("userPW");

	out.println("설정된 세션의 속성값[1] : " + userId + "<br>");
	out.println("설정된 세션의 속성값[2] : " + userPwd + "<br>");
	%>
</body>
</html>