<!DOCTYPE html> 
<%@page isELIgnored="false" %> 
<html>  
<body >  
<div style="padding-top:60px;"></div>
<br>
<table border="2" style="margin-left:auto;margin-right:auto;">
<caption>Electricity Bill</caption>
	<tr>
		<td>Consumer No</td>
		<td><b>${bill.consumerNo}</b></td>
	</tr>
	<tr>
		<td>Previous Reading</td>
		<td><b>${bill.prevRead}</b></td>
	</tr>
	<tr>
		<td>Current Reading</td>
		<td><b>${bill.currRead}</b></td>
	</tr>
	<tr>
		<td>Units Consumed</td>
		<td><b>${bill.units}</b></td>
	</tr>
	<tr>
		<td>Total Charge</td>
		<td><b>${bill.totCharge}</b></td>
	</tr>
</table>
</body>  
</html>