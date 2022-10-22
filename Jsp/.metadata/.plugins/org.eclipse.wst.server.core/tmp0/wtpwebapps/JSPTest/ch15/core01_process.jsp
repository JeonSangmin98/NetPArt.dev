<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%=String number = request.getParameter("number") %> 와 같음--%>
	<c:set var="number" value="${param.number}"/>
	
	<!-- 다중 조건문 -->
	<c:choose>
		<c:when test="${number%2==0 }">	<!-- 조건 -->
			<c:out value="${number }"/> 은/는 짝수 입니다.
		</c:when>
		<c:when test="${number%2==1 }">
			${number } 은/는 홀수 입니다.
		</c:when>
	</c:choose>
</body>
</html>