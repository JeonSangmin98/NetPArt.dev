<html>
<head>
<title>Welcome</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand navbar-dark bg-dark">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="./welcome.jsp">Home</a>
		</div>
	</div>
</nav>
	<%!String greeting = "Welcome to Web Shopping Mall";
	String tagline = "Welcome to Web Market";%>
	<h1><%=greeting%></h1>
	<h1><%=tagline%></h1>
</body>
</html>