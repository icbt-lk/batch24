<%-- 
    Document   : home
    Created on : Jul 3, 2022, 4:34:29 PM
    Author     : tharik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="lk.icbt.java.Util" %>
<%@ page import="java.util.UUID" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            final String SESSESION_ID = "sesid";
            String username = request.getParameter("username");    
            String password = request.getParameter("password"); 

            if(Util.authenticate(username, password)) {
                String id = UUID.randomUUID().toString().replace("-", "");
                Cookie cookie = new Cookie(SESSESION_ID, id);
                session.setAttribute(id, username);
                response.addCookie(cookie);
            } else {
                boolean isAthuenticated = false;
                for(Cookie cookie : request.getCookies()) {
                    if(cookie.getName().equals(SESSESION_ID)) {
                        username = (String)session.getAttribute(cookie.getValue());
                        if(username != null) {
                            isAthuenticated = true;
                        }
                    }
                }
                if (!isAthuenticated) {
                    response.sendRedirect("login.jsp");
                }
            }
        %>
        <h1>Hello <%out.println(username);%>!</h1>
    </body>
</html>
