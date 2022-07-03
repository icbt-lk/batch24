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
        <script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js"></script>
    </head>
    <body>
        <%  
            out.print("<table id='students'>");
            out.print("<thead><tr><td>Student ID</td><td>Name</td><td>Age</td></tr><thead/>");
            out.print("<tbody>");
            for(Student st : Util.getStudents()) {
                out.print("<tr>");
                out.print("<td>" + st.getId() + "</td>");
                out.print("<td>" + st.getName() + "</td>");
                out.print("<td>" + st.getDob() + "</td>");
                out.print("</tr>");
            }
            out.print("</tbody>");
            out.print("</table>");
        %>
        
        <script>
            $(document).ready(function () {
                $('#students').DataTable();
            });
        </script>
    </body>
</html>
