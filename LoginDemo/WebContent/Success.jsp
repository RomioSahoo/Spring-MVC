<%@page import="com.dto.LoginStatusTransfer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
  <font style="font-family:comic sans ms;color:green;font-size:18px;">
   
   <%
      LoginStatusTransfer transferObj=(LoginStatusTransfer)request.getAttribute("LoginStatusTransfer");
      out.print("Congratulations,"+transferObj.getFullName()+" U have successfully logged in");
   %>
  
  </font>
</body>
</html>