<%-- 
    Document   : login.jsp
    Created on : Jul 10, 2022, 2:18:57 PM
    Author     : tharik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="home.jsp" method="post">
            <label for="fname">Username : </label><br>
            <input type="text" id="fname" name="username" value=""><br>
            <label for="lname">Password : </label><br>
            <input type="password" id="lname" name="password" value=""><br><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
