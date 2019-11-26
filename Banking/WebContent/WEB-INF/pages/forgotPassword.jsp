<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Password</title>
    <style type="text/css">
        .centered{
            margin-left: auto;
            margin-right: auto;
            align: center;
        }
        table
        {
                border-spacing: 4mm;
        }
        </style>
</head>
<body>
        <div>
                <form method="post">
                        <center><h2><span style="border: 1px solid black">Forgot Password</span></h2></center><br><br>
                        <center><h3><span style="border: 1px solid black ">Enter Details</span></h3></center><br><br><br>
                        <table class="centered">
                            <tr>
                                <td> Enter User ID:</td>
                                <td> <input type="text" name="userId"></td>
                            </tr>
                            <tr>
                                    <td> Enter Email:</td>
                                    <td> <input type="text" name="emailToRecipient"></td>
                            </tr>
            
                        </table>
                        <br>
                        <center>
                        	<table>
                        		<tr>
                        		<td><input type="submit" value="proceed"></td><td><input type="button" value="back"></td>
                        		</tr>
                        	</table>
                        </center>
                    </form>
                </div>
</body>
</html>