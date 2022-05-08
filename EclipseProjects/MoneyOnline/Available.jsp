<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("uid");

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
		<span style="color:red">Sorry! userID <%=id %> not available</span>
		<%
	}
	else
	{
		%>
		<span style="color:green">Congrats! userID <%=id %> is available</span>
		<%
	}
	con.close();
}
catch(Exception e)
{
	out.println(e.getMessage());
}
%>
</body>
</html>