<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<body>
<h1>Your Total Bill : ${price}</h1>
<h2>Thanks for purchasing</h2>
<form action="${pageContext.request.contextPath }">
<input type="submit" value="Submit">
</form>
</body>
</html>