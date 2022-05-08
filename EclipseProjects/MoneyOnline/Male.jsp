<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MaleUser</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<%
String unm=request.getParameter("usernm");
%>
    <br><br>
    <h2 class="display-4" style="color:steelblue">Male User Page</h2>
    <hr>
    <h4>Welcome Mr.<%=unm%></h4>

    <iframe width="560" height="315" src="https://www.youtube.com/embed/9Auq9mYxFEE" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    <br><br>
    <a href="index.jsp">Home</a>
</div>
</body>
</html>