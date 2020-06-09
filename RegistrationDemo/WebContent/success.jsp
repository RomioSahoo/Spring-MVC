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
		if (request.getAttribute("userid") != null) {
		out.print("<font style='font-face=verdana;color:green;font-size:18px'>");
		out.print("Congratulations,you have successfully logged in, your userid is " + request.getAttribute("userid"));
		out.print("</font>");
	}
	%>

</body>
</html>