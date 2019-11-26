<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style>
        div.a {
  position: relative;
  width: auto;
  height: 600px;
  border: 3px solid black;
  background-color: papayawhip;
}
div.b {
  position: absolute;
  left: auto;
  width: 300px;
  height: 300px;
  background-color:palevioletred;
  border: 4px solid grey;
  box-sizing: border-box;
}
div.c {
  position: absolute;
  left: 400px;
  width: 500px;
  height: 500px;
  background-color: lightsalmon;
  border: 3px solid green;
} 
    </style>
</head>
<body>
        <h1>Welcome to Bank!!!</h1>
        <div class="a">
        <center><h2><span style="border: 1px solid black ">Home</span></h2></center> 
            <div class="b"><b>Login Internet Banking!</b><br>
                 <p id="para2"><a href="login.usr"> Login</a></p>
                 <p id="para2"><a href="registration.usr"> Register</a></p>
                 <p id="para2"><a href="account.jsp">Apply online for account</a></p>
                </div>
        </div>

</body>
</html>