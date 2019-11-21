<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Larson and Toubro Information Services</h1>
	<table border ="1">
	<tr>
		<th> Employee Id</th>
		<th>Last Name</th>
		<th>View Details</th>
	</tr>
	<c:forEach items="${empList}" var="emp">
	<tr>
		<td>${emp.employeeId}</td>
		<td>${emp.lastName}</td>
		<td><a href="empDetails.hr?id=${emp.employeeId}">cick here</a></td>
	</tr>	
	</c:forEach>
	</table>
</body>
</html>