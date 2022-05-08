<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>change</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<%
String id,curps,newps,confps;
id=request.getParameter("uid");
curps=request.getParameter("curps");
newps=request.getParameter("newps");
confps=request.getParameter("confps");
//out.println(id+" | "+curps+" | "+newps+" | "+confps);

Connection con;
PreparedStatement pst;

if(newps.equals(confps))
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
		pst=con.prepareStatement("update users set pswd=? where userid=? and pswd=?;");
		pst.setString(1,newps);
		pst.setString(2,id);
		pst.setString(3,curps);
		int cnt=pst.executeUpdate();
		if(cnt==1)
		{
			out.println("<h2 class='display-5'>password changed successfully</h2>");
		}
		else
			out.println("<h2 class='display-5'>authentication failed</h2>");
		
		con.close();
		
	}
	catch(Exception e)
	{
		out.println(e);
	}
}
else
{
	out.println("<h2 class='display-5'>New passwords mismatched</h2>");
}
%>
<hr>
<a href="Customer.jsp">Home</a>
</div>
</body>
</html>