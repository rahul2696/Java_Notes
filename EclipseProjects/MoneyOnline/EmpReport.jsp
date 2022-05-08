<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.money.beans.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp Report</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
    <div class="container">
        <br><br>
        <h2 class="display-5">Employee Report</h2>
        <hr>
        <table class="table table-bordered table-hover">
            <tr style="background-color: darkseagreen;">
                <th>Number</th>
                <th>Name</th>
                <th>Location</th>
                <th>Department</th>
                <th>Post</th>
                <th>Salary</th>
            </tr>
            
            <%
            EmpOperations eo=new EmpOperations();
            ArrayList<Employee> lst=eo.getEmplist();
            
            for(int i=0;i<lst.size();i++)
            {
            	%>
            	<tr>
                    <td><%=lst.get(i).getEmpno() %></td>
                    <td><%=lst.get(i).getEmpnm() %></td>
                    <td><%=lst.get(i).getLocation() %></td>
                    <td><%=lst.get(i).getDept() %></td>
                    <td><%=lst.get(i).getPost() %></td>
                    <td><%=lst.get(i).getSalary() %></td>
                </tr>
            	<%
            }
            
            %>



        </table>

<a href="Customer.jsp">Home</a>
    </div>


</body>
</html>