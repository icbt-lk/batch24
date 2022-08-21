<%@page import="icbt.StudentService"%>
<%@page import="icbt.Student"%>
<%@page import="icbt.StudentService_Service"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String dob = request.getParameter("dob");
            
            if(id != null) {
                StudentService_Service service = new StudentService_Service();
                StudentService proxy = service.getStudentServicePort();
                Student st = proxy.getStudent(id);
                id = st.getId();
                name = st.getName();
                dob = st.getDob();
            } else {
                id = "";
                name = "";
                dob = "";
            }
        
        %>
        
        <form action="student.jsp" method="post">
            <label for="fname">ID :</label><br>
            <input type="text" name="id" value="<%out.print(id);%>"><br><br>
            
            <label for="fname">Name :</label><br>
            <input type="text" name="name" value="<%out.print(name);%>"><br><br>
            <label for="fname">DOB :</label><br>
            <input type="text" name="dob" value="<%out.print(dob);%>"><br><br>
            <input type="submit" value="Get">
        </form>
    </body>
</html>
