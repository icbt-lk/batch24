<%-- 
    Document   : index
    Created on : Jul 3, 2022, 3:41:56 PM
    Author     : tharik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="lk.icbt.java.Util" %>
<%@ page import="lk.icbt.java.Student" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
            out.print("<table border='1'>");
            out.print("<tr><td>Student ID</td><td>Name</td><td>Age</td></tr>");
            for(Student st : Util.getStudents()) {
                out.print("<tr>");
                out.print("<td>" + st.getId() + "</td>");
                out.print("<td>" + st.getName() + "</td>");
                out.print("<td>" + st.getDob() + "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
        %>
    </body>
</html>
