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
		cookieId.setMaxAge(24 * 60 * 60);
		response.addCookie(cookieId);
		response.sendRedirect("welcome.jsp");
	} else {
		out.println("쿠키 생성이 실패했습니다.<br>");
	}
	%>
</body>
</html>