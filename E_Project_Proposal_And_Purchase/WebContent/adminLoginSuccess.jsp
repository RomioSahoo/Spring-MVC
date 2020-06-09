<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.projpurchase.dto.LoginStatusTransfer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyans">
	<font
		style="font-family: comic sans ms; color: black; font-size: 18px;">

		<%
			LoginStatusTransfer transferObj = (LoginStatusTransfer) request.getAttribute("LoginStatusTransfer");
		out.print("Welcome Back " + transferObj.getFirstName());
		%>

	</font>
</body>
</html>