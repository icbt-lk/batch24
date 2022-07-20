<%-- 
    Document   : index
    Created on : Jul 18, 2022, 7:52:30 PM
    Author     : Frosty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "lk.frosty.java.Util" %>
<%@page import = "lk.frosty.java.Student" %>
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
           //Student[] students = Util.getStudents();
           out.print("<table id=students>");
           out.print("<thead><tr><th>Student ID</th><th>Name</th><th>DOB</th></tr></thead>");
           out.print("<tbody>");
           for(Student st : Util.getStudents()) {
           out.print("<tr>");
           out.print("<td>" + st.getId() + "</td>");
           out.print("<td>" + st.getName() + "</td>");
           out.print("<td>" + st.getDob() + "</td>");
           out.print("</tr> ");
            }
           out.print("</tbody>"); 
            out.print("</table>");
        %>
         
        <script>
            $(document).ready(function () {
    $('#students').DataTable();
});
        </script>
        <!--<h1> <%// out.print(students[2].getDob()); %></h1>-->

        
    </body>
</html>