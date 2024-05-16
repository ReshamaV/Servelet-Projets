<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Loginservlet" method="post">
<table>
<tr>
				<td>UserName</td>
				<td><input type="text" name="user" /></td>
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
		</table>
<input type="submit" value="Login">
</form>
</body>
</html>