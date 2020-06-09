<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<form action="RegistrationController" method="post">
		<table>
			<tr>
				<td><b>Full Name</b></td>
				<td><input type="text" name="fullName"></td>
			</tr>
			<tr>
				<td><b>Address</b></td>
				<td><textarea name="address" rows="4" cols="60"></textarea></td>
			</tr>
			<tr>
				<td><b>Gender</b></td>
				<td><input type="radio" name="gender" value="male">male</td>
				<td><input type="radio" name="gender" value="female">female</td>
			</tr>
			<tr>
				<td><b>DOB</b></td>
				<td><input type="text" name="dob"></td>
			</tr>
			<tr>
				<td><b>Password</b></td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>