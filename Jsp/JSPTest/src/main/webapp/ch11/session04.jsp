<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>----- 세션을 삭제 하기 전 -----</h4>
	<%
	String userId = (String) session.getAttribute("userID");
	String userPwd = (String) session.getAttribute("userPW");

	out.println("설정된 세션 이름 userID : " + userId + "<br>");
	out.println("설정된 세션 값 userPW  : " + userPwd + "<br>");
	
	session.removeAttribute("userID");
	%>
	<h4>----- 세션을 삭제 후 -----</h4>
	<%
	userId = (String) session.getAttribute("userID");
	userPwd = (String) session.getAttribute("userPW");

	out.println("설정된 세션 이름 userID : " + userId + "<br>");
	out.println("설정된 세션 값 userPW  : " + userPwd + "<br>");
	%>
</body>
</html>