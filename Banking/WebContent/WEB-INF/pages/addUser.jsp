<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- 
    <%@ taglib uri="http://www.springframework.org/tags/form" prefi %> --%>
<!DOCTYPE html >
<html>
<head>
<title>Account Creation Page</title>
<style>
                div {
                        height: 2000px;
                        width: 50%;
                        background-color: cyan;
                        border-style: solid;
						padding: 20px;
                      } 
        
               </style>
</head>
<body>
      <center>          
                <div>    
   

<center><h2><span style="border: 1px solid black "></b>Open A Savings Account</span></h2></center>
<br>

<h3><span style="border: 1px solid black "></b>Personal Details</span></h3>
<br>
<form method="post" >
<pre>
  Title:          <select style="width: 150px;">
  <option value="volvo">Ms</option>
  <option value="saab">Mrs</option>
  <option value="opel">Mr</option>
</select>
<br><br>
 UserName:       <input type="text" name="userId">
 <br><br>
 First Name:      <input type="text" name="firstName">
<br><br>
Middle Name:	  <input type="text" name="middleName">
<br><br>
Last Name:  	  <input type="text" name="lastName">
<br><br>
Father's Name:	  <input type="text" name="fatherName">
<br><br>
Mobile Number:	  <input type="text" name="mobileNumber">
<br><br> 
Email ID:    	  <input type="text" name="email">
<br><br>
Aadhar Card No.:  <input type="text" name="aadharNo">
<br><br>
Date of Birth:	  <input type="date" name="birth">
 <br>
 <br>
 <br>
<b>Residential Address:</b>
<br>
a)Address Line 1 -   <input type="text" name="Address1"><br>
b)Address Line 2-    <input type="text" name="Address2"><br>
c)Landmark-          <input type="text" name="Landmark"><br>
d)State-             <input type="text" name="State"><br>
e)City-              <input type="text" name="City"><br>
f)Pincode-           <input type="text" name="Pincode">
<br><br>
<b>Permanent Address:</b>
<br>
<input type="checkbox" name="vehicle1" value="Bike">Permanent Address same as Mailing Address
<br>
a)Address Line 1 -   <input type="text" name="Address11"><br>
b)Address Line 2-    <input type="text" name="Address21"><br>
c)Landmark-          <input type="text" name="Landmark1"><br>
d)State-             <input type="text" name="State1"><br>
e)City-              <input type="text" name="City1"><br>
f)Pincode-           <input type="text" name="Pincode1">
<br><br>
<b>Occupation Details:</b>
<br>
a)Occupation Type-    <select name="occupation" style= "width: 150px;">
  <option value="private" name="private">Private</option>
  <option value="govt" name="govt">Government</option>
  <option value="bus" name="bus">Business</option>
</select>
<br>
b)Source of Income-    <select name="income1" style="width: 150px;">
  <option value="Service" name="Service">Service</option>
  <option value="Business" name="Business">Business</option>
  <option value="Pension" name="Pension">Pension</option>
  <option value="Others" name="Others">Others</option>
</select>
<br>
c)Gross Annual Income-  <select name="income" style="width: 150px;">
  <option>15000</option>
  <option >300000</option>
  <option >450000</option>
  <option >500000</option>
</select>
<br><br>
<b>Debit/ATM Card</b>
<br>
Do you want a Debit Card?
<br>
<input type="checkbox" name="Opt" value="Opt">Opt for Net Banking<br>
<input type="checkbox" name="Agree" value="Agree">I Agree...
<br><br>

<center><input type="submit" value="Submit"><br><br></center>
</pre>
</form>

        
</div>
</center>
</body>

</html>