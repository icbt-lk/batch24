<%-- 
    Document   : Home
    Created on : Jul 21, 2022, 2:14:29 PM
    Author     : Frosty
--%>
<%@page import="lk.frosty.java.Util" %>
<%@page import="java.util.UUID" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <% 
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if(Util.authenticate(username,password )) {
                String id = UUID.randomUUID().toString().replace("-", "");
                Cookie cookie = new Cookie("sesid", id);
                
                session.setAttribute(id, username);
                response.addCookie(cookie); 
          }else {
            boolean isAuthenticated = false;
            Cookie []cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if(cookie.getName().equals("sesid")) {
                    username = (String)session.getAttribute(cookie.getValue());
                if(username != null) {
                      isAuthenticated = true;
                    }
                }
            }
            if(!isAuthenticated)
                response.sendRedirect("login.jsp");
          }
        %>
        
        <h1>Hello <%out.print(username);%></h1>
<!--        <h1>Hello //out.print(password);%></h1>-->
    </body>
</html>
