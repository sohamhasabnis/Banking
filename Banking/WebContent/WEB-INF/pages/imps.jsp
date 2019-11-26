<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>IMPS</title>
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
            <center><h2><span style="border: 1px solid black ">Initiate IMPS Payment</span></h2></center><br><br><br>
            <table class="centered">
                <tr>
                    <td> From Account:</td>
                    <td> <input type="text" name="" value=""></td>
                </tr>
                <tr>
                        <td> To Account:</td>
                        <td> <input type="text" name="" value=""></td>
                </tr>
                <tr>
                        <td> Amount:</td>
                        <td> <input type="text" name="" value=""></td>
                </tr>
                <tr>
                        <td> Transaction Date:</td>
                        <td> <input type="text" name="" value=""></td>
                </tr>
                <tr>
                        <td> Maturity Instructions:</td>
                        <td> <input type="text" name="" value=""></td>
                </tr>
                <tr>
                        <td> Remark:</td>
                        <td> <input type="text" name="" value=""></td>
                </tr>

            </table>
            <br><br>
            <center>
                    <button style="margin: 10px;">Save</button>
                    <button style="margin: 10px;">Reset</button>
                    <button style="margin: 10px;">Save as template</button>
                    <button style="margin: 10px;">Continue</button>
            </center>
        </form>
    </div>
</body>

</html>