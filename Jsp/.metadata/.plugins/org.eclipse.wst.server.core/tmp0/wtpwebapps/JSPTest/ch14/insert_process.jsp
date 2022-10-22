<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="dbconn.jsp"%>
	<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	int _id = Integer.parseInt(id);
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");

	PreparedStatement pstmt = null;
	try {
		String sql = "insert into member values(?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, _id);
		pstmt.setString(2, passwd);
		pstmt.setString(3, name);
		pstmt.executeUpdate();
		out.println("member테이블 삽입에 성공했습니다.<br>");
	} catch (SQLException ex) {
		out.println("member테이블 삽입에 실패했습니다.<br>");
		out.println("SQLException : " + ex.getMessage());
	} finally {
		if (pstmt != null)
			pstmt.close();
		if(con != null)
			con.close();
	}
	%>
</body>
</html>