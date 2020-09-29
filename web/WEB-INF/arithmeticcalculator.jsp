<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 29, 2020, 1:59:17 AM
    Author     : 553582
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 02 - Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first_" value="${first}">
            <br>
            <label>Second:</label>
            <input type="text" name="second_" value="${second}">  
            <br>
            <input type="submit" name="cal" value="+"></input>
            <input type="submit" name="cal" value="-"></input>
            <input type="submit" name="cal" value="*"></input>
            <input type="submit" name="cal" value="%"></input>
            <p>${message}</p>
            <a href="age"> Age Calculator</a>





        </form>
    </body>
</html>
