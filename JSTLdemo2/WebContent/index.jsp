<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form  action="FirstServlet" method="post">     
     Enter Name:<input type="text" name="userName"/> <br/>
     Enter City:<input type="text" name="city"/><br/>
          <input type="submit" value="send"/>      
 </form>
 <div>
 <ol>
 <li><a href="core.jsp">Core</a></li>
 <li><a href="format.jsp">Format</a></li>
 <li><a href="function.jsp">Function</a></li>
 </ol>
 </div>
</body>
</html>