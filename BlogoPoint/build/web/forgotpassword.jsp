<%-- 
    Document   : forgotpassword
    Created on : 27 Mar, 2018, 10:25:47 AM
    Author     : PaRv ArOrA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
    </head>
    <body>
        <style>
            
            body {font-family: Arial, Helvetica, sans-serif;}
            
            input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}


button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}
            @media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
            
        </style>
        <div align="center" >

<p style=" font-weight:bold;   font-size:25px;" >blogo<span style="color:#99d6ff; font-weight:bold; font-size:40px;">point</span></p>
<p style=" border:3px; border-color:#99d6ff; border-style:solid;">The future of communication starts here </p>
    </div>
        
        <br>
        
        <div>
            
            <label for="qstn"><b>Security Question</b></label><br>
            <select>
  <option value="q1">Pets Name</option>
  <option value="q2">First Car</option>
  <option value="q3">First Mobile Number</option>
  <option value="q4">Best Friend</option>
            </select><br><br>
            
             <label for="ans"><b>Security Answer</b></label>
    
             <input type="text" placeholder="Enter Answer" name="ans" required><br>
             <button type="submit" class="signupbtn">Reset Pssword</button>
    
    <div>
        
        
        
        
        
        
        
        
    </body>
</html>
