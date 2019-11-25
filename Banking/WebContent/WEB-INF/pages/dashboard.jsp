<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Dashboard</title>
        <style>
        
        div.b {
  position: absolute;
  left: auto;
  width: 200px;
  height: 300px;
  background-color: rgb(193, 236, 136);
  border: 4px solid grey;
  box-sizing: border-box;
  font-size: medium;
} 
          ul {
             list-style-type: none;
             padding: 20;
          }
          div.c {
  position: absolute;
  left: 250px;
  width: 1000px;
  height: 45px;
  background-color: lightsalmon;
  border: 3px solid green;
} 
.navbar {
  overflow: hidden;
  background-color: #333;
}
.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}
.dropdown {
  float: left;
  overflow: hidden;
}
.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
 
        </style>
    </head>
    <body>
        <center><h2><span style="border: 1px solid black">Dashboard</span></h2></center>
        <br><br>
        <div class="b">
        <ul>
            <li><a href="AccountDetails.html">Account Details</a></li>
            <br><br>
            <li><a href="AccSummary.html">Account Summary</a></li>
            <br><br>
            <li><a href="FundTransfer.html">Fund Transfer</a></li>
            <br><br>
            <li><a href="AccSattement.html">Account Statement</a></li>
          </ul>
        </div>
        <div class="c">
        <div class="navbar">
                <a href="AccSattement.html">Account Statement</a>
                <a href="UserProfile.html">User Profile</a>
                <a href="SetNewPassword.html">ChangeUser Id Password</a>
                <div class="dropdown">
                  <button class="dropbtn">Fund Transfer 
                    <i class="fa fa-caret-down"></i>
                  </button>
                  <div class="dropdown-content">
                    <a href="RTGS.html">RTGS</a>
                    <a href="IMPS.html">IMPS</a>
                    <a href="NEFT.html">NEFT</a>
                    <a href="Beneficiary.html">Add New Beneficiary</a>
                  </div>
                </div> 
              </div>
           </div> 
    </body>
</html>