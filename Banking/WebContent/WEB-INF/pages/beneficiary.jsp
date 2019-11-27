<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Beneficiary</title>
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
        <form>
            <center><h2><span style="border: 1px solid black ">Add New Beneficiary</span></h2></center><br><br><br>
            <table class="centered">
                <tr>
                    <td> Beneficiary Name:</td>
                    <td> <input type="text" name="" value=""></td>
                </tr>
                <tr>
                        <td> Beneficiary Account Number:</td>
                        <td> <input type="text" name="" value=""></td>
                </tr>
                <tr>
                        <td> Re-enter Account Number:</td>
                        <td> <input type="text" name="" value=""></td>
                </tr>
                <tr>
                        <td><input type="checkbox" name="vehicle1" value="Bike"> Save Beneficiary<br></td>
                </tr>
                <tr>
                        <td> Nickname:</td>
                        <td> <input type="text" name="" value=""></td>
                </tr>

            </table>
            <br><br>
            <center>
                    <button style="margin: 10px;">Save As Beneficiary</button>
            </center>
        </form>
    </div>
</body>
</html>