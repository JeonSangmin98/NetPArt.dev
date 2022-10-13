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
	Enumeration<String> en = session.getAttributeNames();
	int i = 0;
	while(en.hasMoreElements()){
		i++;
		String name = en.nextElement();
		String value = session.getAttribute(name).toString();
		out.println("설정된 세션의 속성값["+ i +"] : " + name + "<br>");
		out.println("설정된 세션의 속성값["+ i +"] : " + value + "<br>");
	}
	%>
</body>
</html>