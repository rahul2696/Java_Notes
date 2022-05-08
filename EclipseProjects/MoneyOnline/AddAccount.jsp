<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.money.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddAccount</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<h3 class="display-5">Adding account...</h3>
<hr>
<%
int no;
String nm,typ,stat;
double bal;
no=Integer.parseInt(request.getParameter("ano"));
nm=request.getParameter("anm");
typ=request.getParameter("atyp");
bal=Double.parseDouble(request.getParameter("bal"));

AccountOpener ao=new AccountOpener();
ao.setAccno(no);
ao.setAccnm(nm);
ao.setAcctype(typ);
ao.setBalance(bal);
stat=ao.getStatus();
%>
Status : <%=stat%>
<br><br>
<a href="Admin.jsp">Home</a>
</div>
</body>
</html>