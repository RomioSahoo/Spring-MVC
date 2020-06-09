<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<font style="font-family:verdane;color:blue;font-size:18px;">
<marquee>Welcome to my web page<br>
<%
Date now =new Date();
SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss a");
out.print("It is now "+sdf.format(now));
%>
</marquee>
</font>
</body>
</html>