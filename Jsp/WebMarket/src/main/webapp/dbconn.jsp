<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%
Connection con = null;
try {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "shop";
	String password = "1234";
	Class.forName("oracle.jdbc.OracleDriver");
	con = DriverManager.getConnection(url, user, password);
} catch (SQLException ex) {
	out.println("데이터베이스 연결에 실패했습니다.<br>");
	out.println("SQLException : " + ex.getMessage());
}
%>
<%-- <sql:setDataSource var="dataSource" 
					url="jdbc:oracle:thin:@localhost:1521:xe" 
					driver="oracle.jdbc.OracleDriver" 
					user="shop" 
					password="1234"/> --%>