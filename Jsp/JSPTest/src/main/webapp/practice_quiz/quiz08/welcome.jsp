<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<%
String userId = (String) session.getAttribute("userID");

if(userId == null){
	response.sendRedirect("session_out.jsp");	/* session_out.jsp 이동 */
}
%>
<h3><%=userId %>님 반갑습니다.<br></h3>
<a href="session_out.jsp">로그아웃</a>		<!-- session_out.jsp 이동 -->
</body>
</html>