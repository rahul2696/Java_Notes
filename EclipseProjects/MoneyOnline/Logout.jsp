<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<%
session.invalidate();
%>

<h2 class="display-4">Logged out successfully!</h2>
<hr>
<a href="index.jsp">Home</a>
</div>
</body>
</html>