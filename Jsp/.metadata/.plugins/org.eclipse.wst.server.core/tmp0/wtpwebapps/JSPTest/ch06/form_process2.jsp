<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>요청 파라미터 이름</th>
			<th>요청 파라미터 값</th>
		</tr>
		<%
		request.setCharacterEncoding("UTF-8");
		Enumeration<String> paramNames = request.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String name = (String) paramNames.nextElement();
			out.println("<tr><td>" + name + "</td>\n");
			String value = request.getParameter(name);
			out.println("<td>" + value + "</td></tr>");
		}
		/* hobby 하나만 나옴, 여러개 나오게 하기 */
		%>
	</table>
</body>
</html>