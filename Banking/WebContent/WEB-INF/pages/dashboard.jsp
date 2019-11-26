<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Dashboard</title>
        <style>
        body{
          background-color:coral;
          background-image: url(data:image/jpeg;base64,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); 
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
        
        }
        div.d{
          position: absolute;
  left: 40px;
  width: 1000px;
  height: 500px;
  
        }
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
  background-color:mediumslateblue;
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
  background-color: green;
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
                <a href="email.usr">ChangeUser Id Password</a>
                <div class="dropdown">
                  <button class="dropbtn">Fund Transfer 
                    <i class="fa fa-caret-down"></i>
                  </button>
                  <div class="dropdown-content">
                    <a href="rtgs.usr">RTGS</a>
                    <a href="imps.usr">IMPS</a>
                    <a href="neft.usr">NEFT</a>
                    <a href="beneficiary.html">Add New Beneficiary</a>
                    
                  </div>
                  
              </div>
              <a href="logout.usr">Logout</a>
                </div> <br><br>
                <div class="d"></div>
           </div>
    </body>
</html>