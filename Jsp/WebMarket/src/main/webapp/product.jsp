<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.Product" %>
<%@ page import="dao.ProductRepository" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">상품 정보</h1>
		</div>
	</div>
	<%
	String id = request.getParameter("id");
	ProductRepository dao = ProductRepository.getInstance();
	Product product = dao.getProductById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="/upload/<%= product.getFilename() %>" style="width:100%">
			</div>
			<div class="col-md-6">	<!-- 한줄에 12칸 그리드 -->
				<h3><%=product.getPname()%></h3>
				<!-- 상품이름 -->
				<p><%=product.getDescription()%>
				
				<p>
					<b>상품 코드 : </b><span class="badge badge-danger"><%=product.getProductId()%></span>
				
				<p>
					<b>제조사</b> :
					<%=product.getManufacturer()%>
				
				<p>
					<b>분류</b> :
					<%=product.getCategory()%>
				
				<p>
					<b>재고 수</b> :
					<%=product.getUnitsInStock()%>
				
				<h4><%=product.getUnitPrice()%>원
				</h4>
				<p>
					<a href="#" class="btn btn-info">상품주문&raquo;</a> <a
						href="./products.jsp" class="btn btn-secondary">상품 목록&raquo;</a>
			</div>
		</div>
	</div>
	
	<hr>
	<jsp:include page="footer.jsp"/>
</body>
</html>