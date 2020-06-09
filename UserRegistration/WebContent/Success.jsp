<%@page import="com.dto.LoginStatusTransfer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful</title>
</head>
<body bgcolor="cyan">
	<font
		style="font-family: comic sans ms; color: black; font-size: 18px;">

		<%
			LoginStatusTransfer transferObj = (LoginStatusTransfer) request.getAttribute("LoginStatusTransfer");
		out.print("Welcome Back " + transferObj.getFullName());
		%>

	</font>
</body>
</html>