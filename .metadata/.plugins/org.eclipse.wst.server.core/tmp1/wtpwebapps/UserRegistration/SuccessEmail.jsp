<%@page import="com.dto.LoginStatusTransferEmail"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Valid Email</title>
</head>
<body bgcolor="cyan">
	<font
		style="font-family: comic sans ms; color: green; font-size: 18px;">

		<%
			LoginStatusTransferEmail transferObj1 = (LoginStatusTransferEmail) request.getAttribute("LoginStatusTransferEmail");
		out.print("Your password:" + transferObj1.getPassword());
		%>

	</font>
	<h1 style="font-family: comic sans ms; color: green; font-size: 18px;">Password
		recovered successfully</h1>
</body>
</html>