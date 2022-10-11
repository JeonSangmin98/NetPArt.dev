<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="exception_error.jsp"%>
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

if(id.equals("") || passwd.equals("")){
	throw new ServletException("");
} else{
%>

<p>아이디 : <%= id %>
<p>비밀번호 : <%= passwd %>

<%
}
%>
</body>
</html>