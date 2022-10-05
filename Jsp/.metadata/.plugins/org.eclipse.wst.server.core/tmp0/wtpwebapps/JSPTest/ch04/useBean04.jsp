<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useBean04/include</title>
</head>
<body>
	<jsp:useBean id="person" class="ch04.com.dao.Person" scope="request"/>
	<p>아이디 : <%= person.getId() %>
	<p>이름 : <%= person.getName() %>
	<%
		person.setId(20220101);
		person.setName("홍길순");
	%>
	<jsp:include page="useBean03.jsp"/>
</body>
</html>