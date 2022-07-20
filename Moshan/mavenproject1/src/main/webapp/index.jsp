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
    </head>
    <body>
        <%
           //Student[] students = Util.getStudents();
           out.print("<table border=1>");
           out.print("<tr><th>Student ID</th><th>Name</th><th>DOB</th></tr>");
           for(Student st : Util.getStudents()) {
           out.print("<tr>");
           out.print("<td>" + st.getId() + "</td>");
           out.print("<td>" + st.getName() + "</td>");
           out.print("<td>" + st.getDob() + "</td>");
           out.print("</tr> ");
            }
            out.print("</table>");
        %>
          
        <!--<h1> <%// out.print(students[2].getDob()); %></h1>-->

        
    </body>
</html>