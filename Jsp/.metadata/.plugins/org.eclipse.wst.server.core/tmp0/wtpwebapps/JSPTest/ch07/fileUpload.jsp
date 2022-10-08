<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="fileupload_process.jsp">
		<p> 이 름 : <input type="text" name="name">
		<p> 제 목 : <input type="text" name="subject">
		<!-- type을 file로 해야 함 -->
		<p> 파 일 : <input type="file" name="filename">
		<p> 파 일 : <input type="file" name="filename2">
		<p><input type="submit" value="파일 올리기">
	</form>
</body>
</html>