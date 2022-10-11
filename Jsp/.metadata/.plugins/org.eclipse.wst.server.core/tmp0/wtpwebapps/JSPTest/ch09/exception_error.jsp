<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception_Error</title>
</head>
<body>
	<p>오류가 발생하였습니다.
	<p>예외 : <%=exception %>
	<!-- toString() 안적어도 상관없음 -->
	<p>toString() : <%=exception.toString() %>
	<p>getName() : <%=exception.getClass().getName()%>
	<p>getMessage() : <%=exception.getMessage() %>
</body>
</html>