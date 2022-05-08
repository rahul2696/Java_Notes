<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cookie content</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<h2>Content using Cookies</h2>
<hr>

<%
    Cookie c[]=request.getCookies();
    if(c!=null)
    {
    	for(int i=0;i<c.length;i++)
    	{
    		if(c[i].getValue().equals("news"))
    		{
    			%>
    			<iframe width="560" height="315" src="https://www.youtube.com/embed/9Auq9mYxFEE" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    			
    			<%
    		}
    		
    		if(c[i].getValue().equals("movies"))
    		{
    			%>
    			
    			<iframe width="560" height="315" src="https://www.youtube.com/embed/gOW_azQbOjw" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    			
    			<%
    		}
    		
    		if(c[i].getValue().equals("music"))
    		{
    			%>
    			<iframe width="560" height="315" src="https://www.youtube.com/embed/2sgKeQwzg2w" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    			
    			<%
    			
    		}
    		
    		if(c[i].getValue().equals("sports"))
    		{
    			%>
    			<iframe width="560" height="315" src="https://www.youtube.com/embed/DWU4FYgGOaI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    			
    			<%
    		}
    		
    	}
    }
    else
    	out.println("No cookies found");
    %>

</div>
</body>
</html>