<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<table>
	<form method="post">
		<tr>
		<td><input type="date" name="dt1"/></td>
		<td><input type="date" name="dt2"/></td>
		<td><input type="submit" name="btn1" value="submit"></td>
		</tr>
</form>
</table>
<tr>
<th>Transaction ID</th>
<th> To Account</th>
<th>Date</th>
<th>Amount</th>
</tr>
<c1:forEach items="${list}" var="e">
<tr>
	<td>${e.transaction_id}</td>
	<td>${e.account_no}</td>
	<td>${e.amount }</td>
	<td>${ e.date_of_Transaction}</td>
</tr>

</c1:forEach>	
</h1>
</body>
</html>