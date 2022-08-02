<%-- 
    Document   : index
    Created on : Aug 1, 2022, 6:07:38 PM
    Author     : Frosty
--%>

<%@page import="icbt.StudentService"%>
<%@page import="icbt.StudentService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> 
            <%
                StudentService_Service service = new StudentService_Service();
                StudentService proxy = service.getStudentServicePort();
                
                out.println(proxy.hello("sam"));
               
            %>
        </h1>
    </body>
</html>
