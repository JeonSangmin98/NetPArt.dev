<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2번</title>
</head>
<body>
	<%
		String number = request.getParameter("num");
		int n = Integer.parseInt(number);
		for(int i=1; i<10; i++){
			out.println(number + " * " + i + " = " + (n*i) + "<br>");
		}
	%>
</body>
</html>