<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Password Registration</title>
<style type="text/css">
	div{
  width: 320px;
  padding: 10px;
  border: 5px solid gray;
  margin: 0; 
}
	.inner{
  width: 100px;
  padding: 10px;
  border: 5px black;
  margin: 0; 
}
</style>
</head>
<body><center>
	<div>
		<b>Set New Password</b>
	</div>
<br>
<br>
<form method="post">
	<pre>
	Login Password                -         <input type="password" name="LOGIN_PASS"/>

	Confirm Login Password        -         <input type="password" name="login2"/>
	



	Transaction Password          -         <input type="password" name="TXN_PASS"/>
    
        Confirm Transaction Password  -         <input type="password" name="trans2"/>



    <input type="submit" name="submit" value ="submit">
	</pre><br><br>
</form>
</center>


</body>
</html>