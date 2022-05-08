<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.money.beans.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bean result</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
    <br><br>
    <h2 class="display-5">Search Result from Bean</h2>
    <hr>
    <%
    int no=Integer.parseInt(request.getParameter("ano"));
    AccountInfoFinder obj=new AccountInfoFinder();
    obj.setAccnumber(no);
    String nm=obj.getAcname();
    double bal=obj.getBalance();
    %>
    
    Name : <%=nm %>
    <br>
    Balance : <%=bal %>
    <br>
    
<a href="index.jsp">Home</a>
</div>
</body>
</html>