<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Login Here</h1>  
       <form:form method="post" action="View">    
        <table >    
         <tr>    
          <td>Account Number : </td>   
          <td><form:input path="acc_num"  /></td>  
         </tr>    
         <tr>    
          <td>Password:</td>    
          <td><form:input path="password" type="password"/></td>  
         </tr>    
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Submit" /></td>    
         </tr>    
        </table>    
       </form:form> 