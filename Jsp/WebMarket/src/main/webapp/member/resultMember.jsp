<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
<link href="../resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">회원 정보</h1>
		</div>
	</div>
	
	<div class="container" align="center">
		<c:set var="msg" value="${param.msg}"/>
		<c:if test="${msg!=null}">
			<c:choose>
				<c:when test="${msg=='0'}">
					<h2 class="alert alert-danger">회원정보가 수정되었습니다.</h2>
				</c:when>
				<c:when test="${msg=='1'}">
					<h2 class="alert alert-danger">회원가입을 축하드립니다.</h2>
				</c:when>
				<c:when test="${msg=='2'}">
					<c:set var="loginId" value="${sessionScope.sessionId}"/>
					<h2 class="alert alert-danger">${loginId}님 환영합니다.</h2>
				</c:when>
			</c:choose>
		</c:if>	
		<c:if test="${msg==null}">
			<h2 class="alert alert-danger">회원정보가 삭제되었습니다.</h2>
		</c:if>
	</div>
	<br>
	<jsp:include page="/footer.jsp" />
</body>
</html>