<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>MasterAdmin</title>
        <style>
            body{
                background-color: lightgray;
            }
            .navbar {
  overflow: hidden;
  background-color:black;
}
.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}
.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: grey;
}
div.c {
  position: absolute;
  left: 250px;
  width: 1000px;
  height: 45px;
  background-color: lightsalmon;
  border: 3px solid darkgrey;
} 
.right {
  float: right;
  width: 200px;
  height:400px;
  border: 3px solid black;
  background-color:lightslategrey;
  padding: 10px;
        </style>
    </head>
    <body>
            <div class="c">
                    <div class="navbar">
                            <a href="active.usr">Approved Request</a>
                            <a href="approve.usr">RequestPending</a>
                            <a href="link">Locked Account</a>
                            </div>
                            </div><br><br><br><br>
                            <div class="right">
                            <a href="link">User Data</a><br><br>
                            <a href="link">Transaction pending</a><br><br>
                            <a href="link">Customer Request</a>
                            </div>
          <table>
          <tr>
          <th>Username</th>
          <th> Status</th>
          <th> Account NUmber</th>
          </tr>                  
         <c1:forEach items="${status}" var="s">
         	<tr>
         		<td>${s.userId}</td>
         		<td>${s.status}</td>
         		<td>${s.account_no }</td>
         		<td></td>
         	</tr>
         </c1:forEach>
         </table>
    </body>


</html>