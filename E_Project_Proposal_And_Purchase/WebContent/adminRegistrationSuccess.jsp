<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<font
		style="font-family: comic sans ms; color: green; font-size: 18px;">

		<%
			String name = (String) request.getAttribute("Name");
		out.print("Congratulations," + name + " !You have successfully registered.");
		%>

	</font>
</body>
</html>