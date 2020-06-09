<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
<body >
<h2 style="text-align:center;padding-top:60px;">Electricity Bill Calculation</h2>
<form:form action="submitForm" modelAttribute="bill">
	<table style="margin-left:auto;margin-right:auto;">
		<tr>
			<td><strong>Consumer No :</strong></td>
			<td><form:input path="consumerNo"/></td>
		</tr>
		<tr>
			<td><strong>Previous Reading :</strong></td>
			<td><form:input path="prevRead"/></td>
		</tr>
		<tr>
			<td><strong>Current Reading :</strong></td>
			<td><form:input path="currRead"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="CalculateBill"></td>
		</tr>
	</table>
</form:form>
</body>
</html>
