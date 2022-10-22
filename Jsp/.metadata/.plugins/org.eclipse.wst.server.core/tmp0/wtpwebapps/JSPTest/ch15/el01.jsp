<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
/* java */
int[] array = {10,20,30};
pageContext.setAttribute("array", array);

/* el */
List<String> list = new ArrayList<String>();
list.add("Hello");
list.add("World!");
pageContext.setAttribute("list", list);

/* map */
Map<String,String> map = new HashMap<>();
map.put("one","hello");
map.put("two","world");
%>
<!-- 원래 쓰던 방식 -->
<%= array[1] %>
<%out.println(array[0]); %>

<!-- java -->
${array[2]}<br>

<!-- el -->
${list[0]}<br>
${list.get(1)}<br>

<!-- map -->
${map.get("one")}<br>
${map["one"]}<br>
${amp.one}
</body>
</html>