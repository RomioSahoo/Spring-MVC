<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--<c:forEach>Tag Example--%>
        <c:forEach var="i" begin="1" end="5" step="2">
                Item <c:out value="${i}"/><br/>
        </c:forEach>
                
        <%--<c:choose>Tag Example--%>
       <c:set var="marks" value="${75}"/>
<p>Your marks is : <c:out value="${marks}"/></p>
<c:choose>
    <c:when test="${marks <= 40}">
       Fail
    </c:when>
    <c:when test="${marks > 40 and marks <=60}">
        Try to improve
    </c:when>
   <c:when test="${marks > 60 and marks <=80}">
       Very Good
    </c:when>
    <c:when test="${marks > 80 and marks <=100}">
       Excellent
    </c:when>
    <c:otherwise>
        Invalid
    </c:otherwise>
</c:choose>

        <%--<c:if>Tag example --%>
   <c:set var="name"  value="cts"/>
<c:if test="${name eq 'soma'}">
   <p>Hello <c:out value="${name}"/><p>
</c:if>
<c:if test="${name ne 'soma'}">
   <p>Welcome <c:out value="${name}"/><p>
</c:if>

                


</body>
</html>