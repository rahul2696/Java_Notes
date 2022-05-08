<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
    <div class="container">
        <br>
        <h5>Search Result</h5>
        
        <%
        int no=Integer.parseInt(request.getParameter("ano"));
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
        	pst=con.prepareStatement("select * from accounts where accno=?;");
        	pst.setInt(1,no);
        	rs=pst.executeQuery();
        	if(rs.next())
        	{
        		out.println("Name : "+rs.getString("accnm"));
        		out.println("<br>Balance : "+rs.getString("balance"));
        	}
        	else
        		out.println("Account does not exist");
        	
        	con.close();
        }
        catch(Exception e)
        {
        	out.println(e);
        }

        %>

    </div>

</body>
</html>