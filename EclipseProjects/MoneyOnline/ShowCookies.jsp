<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show cookies</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
    <br><br>
    <h2 class="display-4">Showing your cookies...</h2>
    <hr>
    <%
    Cookie c[]=request.getCookies();
    if(c!=null)
    {
    	for(int i=0;i<c.length;i++)
    	{
    		out.println("<br>Name : "+c[i].getName());
    		out.println(" | Value : "+c[i].getValue());
    	}
    }
    else
    	out.println("No cookies found");
    %>

<br>
<a href="index.jsp">Home</a>

</div>
</body>
</html>