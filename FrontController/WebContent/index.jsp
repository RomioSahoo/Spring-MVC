<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<form action="FrontController" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="actionType" value="1"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
	
		<form action="FrontController" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="actionType" value="2"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Signup"></td>
			</tr>
		</table>
	</form>

</body>
</html>