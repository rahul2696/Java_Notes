<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>profile</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<h2 class="display-4">User Profile</h2>
<hr>
<%
String id=String.valueOf(session.getAttribute("userid"));
%>
<img src="images/<%=id%>.jpg" class="rounded-circle" width="150">
<%
Connection con;
PreparedStatement pst;
ResultSet rs;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
	pst=con.prepareStatement("select * from users where userid=?;");
	pst.setString(1,id);
	rs=pst.executeQuery();
	if(rs.next())
	{
		%>
		<table class="table table-bordered">
			<tr>
				<td>UserID</td>
				<td><%=rs.getString("userid") %></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><%=rs.getString("usernm") %></td>
			</tr>
			<tr>
				<td>UserType</td>
				<td><%=rs.getString("usertype") %></td>
			</tr>
			<tr>
				<td>City</td>
				<td><%=rs.getString("city") %></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><%=rs.getString("mobile") %></td>
			</tr>
			<tr>
				<td>EmailID</td>
				<td><%=rs.getString("emailid") %></td>
			</tr>
		</table>
		
		<%
	}
}
catch(Exception e)
{
	out.println(e);
}

%>

<br>
<a href="Customer.jsp">Home</a>

</div>

</body>
</html>