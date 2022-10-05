<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>setProperty / getProperty</title>
</head>
<body>
	<jsp:useBean id="person" class="ch04.com.dao.Person" scope="request" />
	<jsp:setProperty property="id" name="person" value="20221225" />
	<jsp:setProperty property="name" name="person" value="김철수" />
	<p>
		아이디 :
		<jsp:getProperty property="id" name="person" />
	<p>
		이름 :
		<jsp:getProperty property="name" name="person" />
</body>
</html>
