<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String nm,gn;
nm=request.getParameter("unm");
gn=request.getParameter("gen");

//session.setAttribute("name",nm);

if(gn.equals("male"))
{
	%>
	<jsp:forward page="Male.jsp">
	<jsp:param name="usernm" value="<%=nm%>"></jsp:param>
	</jsp:forward>
	
	<%
	
}

if(gn.equals("female"))
{
	%>
	<jsp:forward page="Female.jsp">
	<jsp:param name="usernm" value="<%=nm%>"></jsp:param>
	</jsp:forward>
	<%
	
}

%>
</body>
</html>