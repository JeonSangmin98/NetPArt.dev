<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request01 / 요청파라미터</title>
</head>
<body>
	<!-- action : 데이터 전송 파일 경로 / post : body에 숨겨져서 이동 / get으로 받으면 입력한 정보가 url에 표시됨 -->
	<form action="request01_process.jsp" method="post"> 	<!--  -->
		<p>
			아이디 : <input type="text" name="id">
		<p>
			비밀번호 : <input type="text" name="passwd">
		<p>
			<input type="submit" value="전송">	<!-- 전송을 하면 action의 페이지로 이동 -->
	</form>
</body>
</html>