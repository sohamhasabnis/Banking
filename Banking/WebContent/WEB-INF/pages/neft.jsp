<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>NEFT</title>
    <script type="text/javascript">
    	function disableButton() {
    		document.getElementById("submit").disabled="true";
    	}
    </script>
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
            <center><h2><span style="border: 1px solid black ">Initiate NEFT Payment</span></h2></center><br><br><br>
            <table class="centered">
                <tr>
                    <td> From Account:</td>
                    <td> <input type="text" name="fromacc" value="${acno}" disabled="disabled"></td>
                </tr>
                <tr>
                        <td> To Account:</td>
                        <td> <input type="text" name="toacc" value=""></td>
                </tr>
                <tr>
                        <td> Amount:</td>
                        <td> <input type="text" name="amount" value=""></td>
                </tr>
                <tr>
                        <td> Remark:</td>
                        <td> <input type="text" name="remark" value=""></td>
                </tr>

            </table>
            <br><br>
            <center><p><i>Please note: 
                    1.Transactions will be executed on the next working day, if they are scheduled for Sundays, National Holidays, NEFT Holidays (as declared by RBI).
                    <br>
                    2.Timings for NEFT: Monday-Saturday(except 2nd and 4th Saturday) 6:00 A.M.-6:30 A.M.
                </i></p></center>
            <center>
                    <input type="submit"  value="submit" name="submit" onclick="disableButton()">
                    <button style="margin: 10px;">Reset</button>
                    <button style="margin: 10px;">Save as template</button>
                    <button style="margin: 10px;">Continue</button>
            </center>
        </form>
        <h2>${error}</h2>
    </div>
</body>

</html>