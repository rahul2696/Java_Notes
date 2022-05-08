<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String nm,ct,cd;
nm=request.getParameter("unm");
ct=request.getParameter("city");
cd=request.getParameter("code");
%>

<h4>
Name : <%=nm %>
<br>
City : <%=ct %>
<br>
Subscription code : <%=cd%>
</h4>
</body>
</html>