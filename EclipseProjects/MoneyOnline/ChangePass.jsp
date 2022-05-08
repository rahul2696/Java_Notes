<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>changepass</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
    <br><br>
    <h2 class="display-4">Change password form</h2>
    <hr>
    <form action="Change.jsp" method="post">
        <table>
            <tr>
                <td>UserID</td>
                <td><input type="text" name="uid" class="form-control"></td>
            </tr>
            <tr>
                <td>Current Password</td>
                <td><input type="password" name="curps" class="form-control"></td>
            </tr>
            <tr>
                <td>New Password</td>
                <td><input type="password" name="newps" class="form-control"></td>
            </tr>
            <tr>
                <td>Confirm Password</td>
                <td><input type="password" name="confps" class="form-control"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit" class="btn btn-secondary"></td>
                <td></td>
            </tr>


        </table>

    </form>

</div>
</body>
</html>