<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>----- 전체 세션을 삭제 하기 전 -----</h4>
	<%
	String userId = (String) session.getAttribute("userID");
	String userPwd = (String) session.getAttribute("userPW");

	out.println("설정된 세션 이름 userID : " + userId + "<br>");
	out.println("설정된 세션 값 userPW  : " + userPwd + "<br>");

	if (request.isRequestedSessionIdValid()) {
		out.println("세션이 유효합니다.");
	} else {
		out.println("세션이 유효하지 않습니다.");
	}
	session.invalidate();
	%>
	<h4>----- 전체 세션을 삭제 후 -----</h4>
	<%
	if (request.isRequestedSessionIdValid()) {
		out.println("세션이 유효합니다.");
	} else {
		out.println("세션이 유효하지 않습니다.");
	}
	%>
</body>
</html>