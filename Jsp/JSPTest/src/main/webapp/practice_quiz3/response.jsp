<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>현재 시간은 : 
	<%
		response.setHeader("Refresh", "5");
		Calendar cal = Calendar.getInstance();
		int ampm = cal.get(Calendar.AM_PM);
	%>
	<%= cal.get(Calendar.HOUR)%> 
	<%=cal.get(Calendar.MINUTE) %>
	<%
		if(ampm == 0){
			out.println("AM");
		}else if(ampm == 1){
			out.println("PM");
		} %>
	<p><a href="response_data.jsp" class="link">Google 홈페이지로 이동하기</a>
</body>
</html>