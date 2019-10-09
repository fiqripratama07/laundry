<%@page language= "java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  %>
<% String name = (String) request.getAttribute("name");  %>

<!DOCTYPE html>
<html>
	<head>
		<title></title>
	</head>
<body>
	<marquee><h1>Hello <%=name  %></h1></marquee>
</body>
</html>