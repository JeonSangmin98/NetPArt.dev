<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>오류발생</h3>
	<table border="1">
		<tr>
			<th>Error: </th>
			<td><%=exception.getClass().getName() %>: 오류발생!!</td>
		</tr>
		<tr>
			<th>URI: </th>
			<td><%=request.getRequestURI() %></td>
		</tr>
		<tr>
			<th>Status code: </th>
			<td><%=request.getAttribute("javax.servlet.error.status_code") %></td>
		</tr>
	</table>
</body>
</html>