<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- JSP Declaration -->
<%!
int principal=0;
int rate=0;
int terms=0;
int calculateInterest(int p,int r,int t)
{
	return (p*r*t)/100;
}
%>
<!-- JSP Scriplet -->
<%
principal=1200;
rate=2;
terms=3;
%>

<!-- JSP Expression -->
<h1>
<%= "The calculated SI="+calculateInterest(principal,rate,terms)%>
</h1>
</body>
</html>