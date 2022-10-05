<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request02 / http 헤더 정보</title>
</head>
<body>
	<% 
		Enumeration<String> en = request.getHeaderNames();
		while(en.hasMoreElements()){
			String headerName = en.nextElement();
			String headerValue = request.getHeader(headerName);
	%>
	
	<%=headerName %>
	:
	<%=headerValue %><br>
	
	<%
		}
	%>
</body>
</html>