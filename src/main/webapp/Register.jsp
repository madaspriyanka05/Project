<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="Register.css">
    <title>Registration Form</title>
</head>

<body>
    <div class="yellow-square">


        <form method="post" action="register.lti">
            <h1 align="center">Registration Form</h1>
            <table align="center" cellpadding="15">
                <tr>
                    <td>
                        <b>Enter FirstName:</b>
                        <td><input type="text" placeholder="FirstName" name="Fname" size="20" required><br></td>
                    </td>
                </tr>

                <tr>
                    <td>
                        <b>Enter MiddleName:</b>
                        <td><input type="text" placeholder="MiddleName" name="Mname" size="20"><br></td>
                    </td>
                </tr>

                <tr>
                    <td>
                        <b>Enter LastName:</b>
                        <td><input type="text" placeholder="LastName" name="Lname" size="20" required><br></td>
                    </td>
                </tr>

                <td>
                    <b>Date-Of-Birth :</b>
                    <td><input type="date" name="DoB" size="20" required><br></td>
                </td>
                </tr>

                <tr>
                    <td>
                        <b>Gender:</b>
                        <td><input type="radio" name="GenderM" value="Male" size="20">Male
                            <input type="radio" name="GenderF" value="Female" size="20">Female<br></td>
                </tr>

                <tr>
                    <td>
                        <b>Address:</b>
                        <td> <textarea rows="5" cols="30" name="description" size="20">Enter your Address here
                 </textarea>

                        </td>
                </tr>

                <tr>
                    <td>
                        State :
                        <td><select>
                        <option value="Maharashtra" >Maharashtra</option>
                        <option value="Delhi"  >Delhi</option>
                        <option value="Andhra Pradesh" >Andhra Pradesh</option>
                        <option value="Assam" >Assam</option>
                        <option value="Goa" >Goa</option>
                    </select></td><br></td>

                </tr>

                <tr>
                    <td>
                        ZipCode:
                        <td><input type="number" placeholder="Enter Pincode" name="Zipcode" size="20" required><br></td>
                    </td>
                </tr>


                <tr>
                    <td>FathersName:
                        <td> <input type="text" placeholder="Enter FatherName" name="Fathername" size="20" required></td><br>
                    </td>
                </tr>


                <tr>
                    <td>OccupationType:
                        <td> <input type="text" placeholder="Enter OccupationType" name="OccType" size="20" required></td><br>
                    </td>
                </tr>

                <tr>
                    <td>Income:
                        <td> <input type="number" placeholder="Enter Income" name="Income" size="20" required></td><br>
                    </td>
                </tr>

                <tr>
                    <td>AdharCard Number:
                        <td><input type="text" placeholder="Enter AdharCard Number" name="Aadhar" size="20" required></td><br>
                    </td>
                </tr>

                <tr>
                    <td>Email Id:
                        <td> <input type="email" placeholder="Enter EmailId" name="EmailId" size="20" required></td><br>
                    </td>
                </tr>
                </tr>

                <td>Password:
                    <td> <input type="password" placeholder="Enter Password" name="password" size="20" required></td><br>
                </td>
                </tr>
                </tr>

                <tr>
                    <td>Mobile Number:
                        <td><input type="number" placeholder="Enter MobileNumber" name="MobileNo" size="20" required></td><br>
                    </td>
                </tr>

                <tr>
                    <td align="center"><button class="button">Submit</button>
                        <!-- <button class="button" type="reset" style="float:left" value="Reset">Reset</button> -->

                </tr>

            </table>
        </form>
    </div>
</body>

</html>