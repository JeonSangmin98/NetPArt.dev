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
	request.setCharacterEncoding("UTF-8");
	/* String id = request.getParameter("id");
	String addr = request.getParameter("addr");
	String email = request.getParameter("email");
	 */
	StringBuffer result1 = new StringBuffer(request.getParameter("id"));
	StringBuffer result2 = new StringBuffer(request.getParameter("addr"));
	StringBuffer result3 = new StringBuffer(request.getParameter("email"));
	%>
	<p>
		아이디 :
		<%=result1%>
	<p>
		주소 :
		<%=result2%>
	<p>
		이메일 :
		<%=result3%>
</body>
</html>