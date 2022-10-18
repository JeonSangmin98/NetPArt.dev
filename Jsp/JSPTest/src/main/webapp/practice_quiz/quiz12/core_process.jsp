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
	<%
	String score = request.getParameter("score");
	%>
	<c:set var="score" value="<%=score%>" />

	<c:choose>
		<c:when test="${score>=90 }">
			점수 <c:out value="${score }" /> 은/는 A학점입니다.
		</c:when>
		<c:when test="${score>=80 }">
			점수 <c:out value="${score }" /> 은/는 B학점입니다.
		</c:when>
		<c:when test="${score>=70 }">
			점수 <c:out value="${score }" /> 은/는 C학점입니다.
		</c:when>
		<c:when test="${score>=60 }">
			점수 <c:out value="${score }" /> 은/는 D학점입니다.
		</c:when>
		<c:otherwise>
			점수 <c:out value="${score }" /> 은/는 F학점입니다.
		</c:otherwise>
	</c:choose>
</body>
</html>