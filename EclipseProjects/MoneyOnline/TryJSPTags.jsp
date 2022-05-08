<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp tags</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>

<div class="container">
<br><br>

<jsp:element name="h2">
<jsp:attribute name="style">color:green</jsp:attribute>
<jsp:attribute name="class">display-5</jsp:attribute>
<jsp:body>JSP Tag Library</jsp:body>
</jsp:element>

<jsp:element name="hr"></jsp:element>

<jsp:element name="a">
<jsp:attribute name="href">index.jsp</jsp:attribute>
<jsp:body>Home</jsp:body>
</jsp:element>

<br><br>

<jsp:declaration>
double basic,allowance,tax,net;
</jsp:declaration>

<jsp:scriptlet>
basic=13900;
allowance=basic*45/100;
tax=(basic+allowance)*5/100;
net=basic+allowance-tax;
</jsp:scriptlet>

<jsp:text>
The net salary of employee is : 
</jsp:text>

<jsp:expression>
net
</jsp:expression>

<jsp:include page="Bottom.jsp"/>

</div>
</body>
</html>