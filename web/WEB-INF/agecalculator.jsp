<%-- 
    Document   : agecalculator
    Created on : Sep 29, 2020, 12:15:29 AM
    Author     : 553582
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 02 - Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age_" value="">
            <br>
            <input type="submit" value="Age next birthday">
            <p>${message}</p>
            <a href="arithmetic"> Arithmetic Calculator</a>
            
            
            
            
            
            
            
            
            
        </form>
    </body>
</html>
