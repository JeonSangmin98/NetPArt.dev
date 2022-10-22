<%@page import="ch16.com.model.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>로그인에 성공했습니다.
<%
LoginBean bean = (LoginBean)request.getAttribute("bean");
out.println("아이디: " + bean.getId());
%>
</body>
</html>