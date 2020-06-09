<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Existing Username</title>
<style>
#lg1 {
	position: absolute;
	top: 40%;
	margin-left: 40%;
	padding: 15px 35px 15px;
	background-color: black;
	color: white;
}

#lg2 {
	position: absolute;
	top: 50%;
	margin-left: 40%;
	margin-top: 10px;
	padding: 15px 30px 15px;
	background-color: black;
	color: white;
}
</style>
</head>
<body bgcolor="b3b3b3">
	<h1 style="margin-left: auto; margin-right: auto;">Username
		already exists!</h1>
	<form action="FrontController" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="actionType" value="1"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" id="lg1"></td>
			</tr>
		</table>
	</form>
	<form action="FrontController" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="actionType" value="2"></td>
			</tr>
			<tr>
				<td><input type="submit" value="SignUp" id="lg2"></td>
			</tr>
		</table>
	</form>
</body>
</html>