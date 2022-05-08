<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accounts</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
    <div class="container">
        <br><br>
        <h2 class="display-4">Accounts Report</h2>
        <hr>
        <table class="table table-bordered table-hover">
            <tr style="background-color:dodgerblue;color:aliceblue">
                <th>Number</th>
                <th>Name</th>
                <th>Type</th>
                <th>Balance</th>
            </tr>
<%
Connection con;
PreparedStatement pst;
ResultSet rs;
String ty=request.getParameter("typ");
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
	pst=con.prepareStatement("select * from accounts where acctype=?;");
	pst.setString(1,ty);
	rs=pst.executeQuery();
	
	while(rs.next())
	{
		%>
		<tr>
            <td><%=rs.getInt("accno") %></td>
            <td><%=rs.getString("accnm") %></td>
            <td><%=rs.getString("acctype") %></td>
            <td><%=rs.getDouble("balance") %></td>
        </tr>
		<%
	}
	
	
}
catch(Exception e)
{
	
}

%>


        </table>
<br><br>
<a href="Admin.jsp">Home</a>
    </div>

</body>
</html>