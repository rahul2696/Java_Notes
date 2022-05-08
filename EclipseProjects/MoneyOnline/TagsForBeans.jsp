<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bean tags</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
    <div class="container">
    <%
    int no=1025;
    %>
        <br><br>
        <h2>Calling a bean with tags</h2>
        <hr>
        
        <jsp:useBean id="acc" class="com.money.beans.AccountInfoFinder"></jsp:useBean>
        <jsp:setProperty name="acc" property="accnumber" value="<%=no%>"></jsp:setProperty>
        
        Name : <jsp:getProperty name="acc" property="acname"></jsp:getProperty>
        <br>
        Balance : <jsp:getProperty name="acc" property="balance"></jsp:getProperty>
        
        <br><br>
        <a href="index.jsp">Home</a>
    </div>

</body>
</html>