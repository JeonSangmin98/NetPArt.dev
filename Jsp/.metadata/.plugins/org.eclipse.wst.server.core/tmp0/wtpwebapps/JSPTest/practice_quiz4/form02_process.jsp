<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	Enumeration<String> paramNames = request.getParameterNames();
	StringBuffer sb1 = new StringBuffer("name : ");
	StringBuffer sb2 = new StringBuffer("address : ");
	StringBuffer sb3 = new StringBuffer("email : ");
	String name = (String) paramNames.nextElement();
	sb1.append(name);
	String value = request.getParameter(name);
	sb1.append(value);
	out.println(sb1.toString());
	/* sb.append(name); */
	/* sb.append();
	sb.append(); */
	%>
</body>
</html>