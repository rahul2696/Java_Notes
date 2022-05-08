<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserList</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<%
if(session.getAttribute("userid")!=null && session.getAttribute("usertype").toString().equals("admin"))
{
%>


<br><br>
<h2 class="display-5">User List</h2>
<hr>

<table class="table table-bordered table-hover">
<tr style="background-color: #ffbdde">
<th>UserID
<th>UserName
<th>UserType
<th>UserStatus
<th>City
<th>Mobile
<th>EmailID
</tr>


<%
Connection con;
Statement st;
ResultSet rs;
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
	st=con.createStatement();
	rs=st.executeQuery("select * from users;");
	while(rs.next())
	{
		%>
		<tr>
		<td><%=rs.getString("userid")%></td>
		<td><%=rs.getString("usernm")%></td>
		<td><%=rs.getString("usertype")%></td>
		<td><%=rs.getString("userstatus")%></td>
		<td><%=rs.getString("city")%></td>
		<td><%=rs.getString("mobile")%></td>
		<td><%=rs.getString("emailid")%></td>
		</tr>
		<%
	}
	con.close();
}
catch(Exception e)
{
	out.println(e);
}
%>
</table>
<br>
<a href="Admin.jsp">Home</a>
<%
}
else
{
%>
<br><br>
<h2 class="display-4">Invalid session...please login</h2>
<hr>
<a href="index.jsp">Home</a>
<%
}
%>
</div>
</body>
</html>