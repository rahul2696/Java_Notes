<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="com.money.beans.*" %>
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
        <h2 class="display-4">Bean-ArrayList Accounts Report</h2>
        <hr>
        <table class="table table-bordered table-hover">
            <tr style="background-color:dodgerblue;color:aliceblue">
                <th>Number</th>
                <th>Name</th>
                <th>Type</th>
                <th>Balance</th>
               
            </tr>
<%
AccountListGenerator alg=new AccountListGenerator();
ArrayList<Account> lst=alg.getList();
	for(int i=0;i<lst.size();i++)
	{
		%>
		<tr>
            <td><%=lst.get(i).getAccno()%></td>
            <td><%=lst.get(i).getAccnm() %></td>
            <td><%=lst.get(i).getAcctype() %></td>
            <td><%=lst.get(i).getBalance() %></td>
            
        </tr>
		<%
	}
	
	


%>


        </table>
<br><br>
<a href="Admin.jsp">Home</a>
    </div>

</body>
</html>