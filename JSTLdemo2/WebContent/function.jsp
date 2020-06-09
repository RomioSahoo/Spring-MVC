<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1> Function Demo List</h1>
        <div>
            <c:set var="theString" value="This demo uses JSTL function tags"/>              
                
            <c:if test="${fn:contains(theString, 'JSTL')}">
                 <h2>Found 'JSTL' in <c:out value="${theString}"/></h2>
            </c:if>

            <c:if test="${fn:contains(theString, 'jstl')}">
                 <h3>Found 'jstl' in <c:out value="${theString}"/></h3>
            </c:if>
        </div>
   
            <hr size='1' color='green'/>
        <div>
                <c:set var="string1" value="This is first String."/>                
                <c:set var="string2" value="${fn:substring(string1, 5, 15)}" />
                <h3>Final sub string : ${string2}</h3>
        </div>
        <hr size='1' color='green'/>
        <div>
            <c:set var="str1" value="Object Oriented Programming"/>
            <c:set var="str2" value="${fn:toUpperCase(str1)}" />

            <h3>Revised Result : ${str2}</h3>
 
        </div>

  </body>
</html>