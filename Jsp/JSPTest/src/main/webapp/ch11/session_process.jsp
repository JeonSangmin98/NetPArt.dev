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
	String userId = request.getParameter("id");
	String userPwd = request.getParameter("passwd");

	if (userId.equals("admin") && userPwd.equals("1234")) {
		session.setAttribute("userID",userId);
		session.setAttribute("userPW",userPwd);
		out.println("세션 설정에 성공했습니다.<br>");
		out.println(userId + "님 환영합니다.");
	} else {
		out.println("세션 설정에 실패했습니다.<br>");
	}
	%>
</body>
</html>