<%-- 
    Document   : login
    Created on : Jul 21, 2022, 2:28:02 PM
    Author     : Frosty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="Home.jsp">
            <label for="username" id="username">Username :</label>
            <input id="username" type="text" name="username"><br>
            <label for="password" id="pass">Password  :</label>
            <input type="password" id="pass" name="password"><br><br>
            <input type="submit" value="Submit">
        </form>    
    </body>
</html>
