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
		Cookie cookieId = new Cookie("userID",userId);
		Cookie cookiePwd = new Cookie("userPW",userPwd);
		response.addCookie(cookieId);
		response.addCookie(cookiePwd);
		out.println("쿠키 생성에 성공했습니다.<br>");
	} else {
		out.println("쿠키 생성이 실패했습니다.<br>");
	}
	%>
</body>
</html>