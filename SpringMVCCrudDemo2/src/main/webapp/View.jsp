<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Congratulations</h1>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Account Number</th>
		<th>Name</th>
		<th>Date Of Transaction</th>
		<th>Transaction Type</th>
		<th>Transaction Amount</th>
	</tr>
	<c:forEach var="user" items="${list}">
		<tr>
			<td>${user.acc_num}</td>
			<td>${user.name}</td>
			<td>${user.dot}</td>
			<td>${user.type}</td>
			<td>${user.trans_amt}</td>

		</tr>
	</c:forEach>
</table>

