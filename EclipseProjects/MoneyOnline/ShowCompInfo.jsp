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
String c,m;
c=request.getParameter("comp");
m=request.getParameter("mod");
%>
<br>
<h4>Company Information</h4>
<p>
Name : <%=c %>
<br>
Model : <%=m %>
</p>
<br>
<img src="images/<%=c%>.jpg" height="300">

</body>
</html>