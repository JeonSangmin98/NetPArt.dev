<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<jsp:useBean id="productDAO" class="dao.ProductRepository"
	scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<%
	ArrayList<Product> listOfProduct = productDAO.getAllProducts();
	%>
	<div class="container">
		<!-- Gridlayout 처럼 씀, 12칼럼을 4로 나누어서 사용 -->
		<div class="row" align="center">
			<%
			for (int i = 0; i < listOfProduct.size(); i++) {
				Product product = listOfProduct.get(i);
			%>
			<div class="col-md-4">
				<!-- 태그와 자바코드 분리해서 사용 -->
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>
			</div>
			<%
			}
			%>
		</div>
	</div>

	<hr>
	<jsp:include page="footer.jsp" />
</body>
</html>