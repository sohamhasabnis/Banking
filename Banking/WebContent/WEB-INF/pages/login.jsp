<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>LOGIN</title>
<style>
                div {
                        height: 500px;
                        width: 50%;
                        background-color: lightblue;
                        border-style: solid;
					} 
        
               </style>
</head>
<body>
      <center>          
                <div>    
   
<h1> ${msg} </h1>
<center><h2><span style="border: 1px solid black "></b>	LOGIN	</span></h2></center>
<br>

<h3><span style="border: 1px solid black "></b>	Login to Your Account	</span></h3>
<br><br>

<pre>
<form method="post">
Enter User ID:   <input type="text" name="user_id">
<br><br>
Enter Password:          <input type="password" name="pass">
<br><br>
<center><input type="submit" value="Proceed">   <input type="button" value="Back"><br><br></center>
</pre>
</form>
<h6> First Time User? <a href="registration.usr">Register</a></h6>
<h6> <a href="ForgotUserid.HTML">Forgot USER ID?</a></h6>
<h6> <a href="email.usr">Forgot Password?</a></h6>
</div>
</center>

</body>

</html>