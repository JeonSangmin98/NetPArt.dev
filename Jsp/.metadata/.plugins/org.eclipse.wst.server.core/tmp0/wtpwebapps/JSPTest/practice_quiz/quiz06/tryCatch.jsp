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
		try{
			int a = 10/0;
		} catch(Exception e){
	%>
		<p>오류 발생 : <%=e.getLocalizedMessage() %>
	<%
		}
	%>
</body>
</html>