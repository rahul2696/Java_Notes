<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<h2 class="display-4" style="color:darkgreen">Admin Panel</h2>
<%
String uid=String.valueOf(session.getAttribute("userid"));
String typ=String.valueOf(session.getAttribute("usertype"));
%>

UserID : <%=uid %> | Type : <%=typ%> | SessionID : <%=session.getId() %>
<hr>
<a href="UserList.jsp">All users list</a> | 
<a href="ShowAllAccounts.jsp">All Accounts List</a> | 
<a href="SearchAcc.html">Search Account</a> | 
<a href="SearchAccAJAX.html">Search Account - AJAX</a> | 
<a href="NewAccount.html">Open New Account</a> | 
<a href="Logout.jsp">Logout</a>
<br>
<a href="ShowAccounts.jsp?typ=saving">Saving</a> |  
<a href="ShowAccounts.jsp?typ=fixed">Fixed</a> | 
<a href="ShowAccounts.jsp?typ=current">Current</a>
<br>
<a href="ShowModels.jsp?company=apple&category=laptops">Apple</a> |  
<a href="ShowModels.jsp?company=hp&category=laptops">HP</a> | 
<a href="ShowModels.jsp?company=dell&category=laptops">Dell</a> | 
<a href="ShowModels.jsp?company=microsoft&category=surface">Microsoft</a> | 
<a href="ShowModels.jsp?company=samsung&category=mobiles">Samsung</a>
<br>
<a href="BeanAccReport.jsp">Bean-ArrayList Account Report</a>
</div>
</body>
</html>