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
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");

	if (id.equals("admin") && passwd.equals("1234")) {
	%>
	<p>
		로그인 성공
	<%
	} else {
	%>
	
	<p>
		로그인 실패
	<%
	}
	%>
	
</body>
</html>