<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3번</title>
</head>
<body>
	<jsp:useBean id="b" class="ch04.com.dao.GuGuDan"/>
	<h4>구구단 출력하기</h4>
	<%
		for(int j=1; j<10; j++){
			int n = b.process(5, j);
			out.println("5 * " + j + " = " + n + "<br>");
		}
	%>
</body>
</html>