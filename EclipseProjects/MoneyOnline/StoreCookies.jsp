<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>storecookies</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<h2 class="display-4">Saving cookies...</h2>
<hr>
<%
String cho=request.getParameter("choice");
Cookie c1=new Cookie("userpref",cho);
c1.setMaxAge(120);
response.addCookie(c1);
%>

<h5>User preference is now stored in the cookie on the clients browser</h5>
<br><br>
<a href="index.jsp">Home</a>
</div>
</body>
</html>