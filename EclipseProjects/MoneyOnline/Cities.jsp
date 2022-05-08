<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<%
String cn=request.getParameter("country");
%>

<select name="city">
<%
if(cn.equals("india")) 
{
	%>
	<option value="mumbai">Mumbai
	<option value="amritsar">Amritsar
	<%
}

%>

<%
if(cn.equals("pakistan")) 
{
	%>
	<option value="lahore">Lahore
	<option value="karachi">Karachi
	<%
}

%>

</select>

</body>
</html>