<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="magenta">
	<form action="SignUpContoller" method="post">
		<table>
			<tr>
				<td><b>FullName:</b></td>
				<td><input type="text" name="fullName"></td>
			</tr>
			<tr>
				<td><b>Address:</b></td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td><input type="submit" value="SignUp"></td>
			</tr>
		</table>
	</form>

</body>
</html>