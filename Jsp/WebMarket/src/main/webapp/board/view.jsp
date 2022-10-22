<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="../menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">게시판 글쓰기</h1>
		</div>
	</div>

	<div class="container">
		<form action="./BoardUpdateAction.do?num=${board.num}&pageNum=${page}" method="post" name="updateForm" class="form-horizontal">
			<div class="form-group row">
				<label class="col-sm-2 control-label" >성명</label>
				<div class="col-sm-3">
					<input name="name" type="text" class="form-control" value="${board.name}"
						placeholder="name">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label" >제목</label>
				<div class="col-sm-5">
					<input name="subject" type="text" class="form-control"
						placeholder="subject" value="${board.subject}">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label" >내용</label>
				<div class="col-sm-8">
					<textarea name="content" cols="50" rows="5" class="form-control"
						placeholder="content">${board.content}</textarea>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10 ">
				<c:set var="userId" value="${board.id}"/>
				<c:if test="${userId==sessionId}">
					<a href="./BoardDeleteAction.do?num=${board.num}&pageNum=${page}" class="btn btn-danger">삭제</a>
				 	<input type="submit" class="btn btn-success " value="수정">				
				</c:if>
				<a href="./BoardListAction.do?pageNum=${page}" class="btn btn-primary">목록</a>
				</div>
			</div>
		</form>
	</div>

	<br>
	<jsp:include page="/footer.jsp" />
</body>
</html>