<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>

<%
String uid=String.valueOf(session.getAttribute("userid"));
String typ=String.valueOf(session.getAttribute("usertype"));
//String uid=session.getAttribute("userid").toString();
%>


<table>
<tr>
<td><img src='images/<%=uid%>.jpg' class="rounded-circle" width="150">
<td width="100">
<td>
<h2 class="display-5" style="color:navy;">Customer Home</h2>
UserID : <%=uid %> | Type : <%=typ%> | SessionID : <%=session.getId() %>
</tr>
</table>

<hr>
<%
Calendar cal=Calendar.getInstance();
out.println(cal.getTime());
%>
<br><br>
<a href="ShowProfile.jsp">Show Profile</a> | 
<a href="UploadPhoto.html">Upload profile photo</a> |  
<a href="ChangePass.jsp">Change Password</a> | 
<a href="EmpReport.jsp">Employee Report</a> | 
<a href="Logout.jsp">Logout</a>

</div>

</body>
</html>