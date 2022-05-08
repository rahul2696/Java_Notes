<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MoneyOnline</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<img src="images/home2.gif">
<h2 class="display-4" style="color:#226da5">Online Money Transactions</h2>
<hr>
<form name="frm" method="post" action="Check">
<table>

<tr>
<td>UserID
<td><input type="text" name="uid" autocomplete="off" class="form-control">
</tr>

<tr>
<td>Password
<td><input type="password" name="psw" autocomplete="off" class="form-control">
</tr>

<tr>
<td><input type="submit" value="Submit" class="btn btn-secondary">
<td>
</tr>

</table>
</form>
<br>
<a href="RegisterUser.html">New user? Register now.</a> | 
<a href="TakeUserChoice.html">User Choice for Cookies</a> | 
<a href="ShowCookies.jsp">Show My Cookies</a> | 
<a href="CookieContent.jsp">Content using Cookie</a> | 
<a href="HiddenData.html">Hidden form data</a> <br>
<a href="HyperlinkAjax.html">Ajax with Hyperlinks</a> | 
<a href="DropDownAjax.html">AJAX on DropDownList</a> | 
<a href="TestBilling.html">Test Billing Bean</a> | 
<a href="BeanSearchAcc.html">Search Account using Bean</a>
<br>
<a href="TryJSPTags.jsp">Try JSP tag library</a> | 
<a href="TestForward.html">Test forward</a> | 
<a href="TagsForBeans.jsp">Bean Tags</a>

<br><br>
<hr>
Powered by Java 17, Eclipse 2021-12, Tomcat 10, MySQL Cloud
<br>
Developed by Ethan Hunt SohamGlobal &copy;2022
</div>
</body>
</html>