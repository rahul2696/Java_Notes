<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>models</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<h2 class="display-5">Data from Hyperlinks</h2>
<hr>
<%
String comp=request.getParameter("company");
String catg=request.getParameter("category");
%>

<h4>
Company : <%=comp%>
<br>
Category : <%=catg%> 
</h4>
<br>
<a href="Admin.jsp"">Home</a>
</div>
</body>
</html>