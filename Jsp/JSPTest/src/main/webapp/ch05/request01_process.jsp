<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request01_process</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String userId = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	%>
	<p>
		아이디 :
		<%= userId %>
	<p>
		비밀번호 :
		<% out.println(passwd); %>
	<!-- 웹브라우저 / 서버 관련 메소드 -->
	<p>클라이언트 IP : <%= request.getRemoteAddr() %>
	<p>요청 정보 길이 : <%= request.getContentLengthLong() %>
	<p>요청 정복 인코딩 : <%= request.getCharacterEncoding() %>
	<p>요청 정보 콘텐츠 유형 : <%= request.getContentType() %>
	<p>요청 정보 프로토콜 : <%= request.getProtocol() %>
	<p>요청 정보 전송방식 : <%= request.getMethod() %>
	<p>요청 URI : <%= request.getRequestURI() %>
	<p>콘텍스트 경로 : <%= request.getContextPath() %>	<!-- 프로젝트 이름 -->
	<p>서버이름 : <%= request.getServerName() %>
	<p>서버포트 : <%= request.getServerPort() %>
	<p>쿼리문 : <%= request.getQueryString() %>
</body>
</html>