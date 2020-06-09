<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="RegisterServlet">
	<table border="1" align="center">
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname"/></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname"/></td>
		</tr>
		<tr>
			<td>Mobile Number</td>
			<td><input type="text" name="mobile"/></td>
		</tr>
		<tr>
			<td>Email ID</td>
			<td><input type="text" name="email"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Send"/></td>
			<td><input type="reset" value="Clear"/></td>
		</tr>
		
	</table>
	</form>
</body>
</html>