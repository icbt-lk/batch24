<%-- 
    Document   : newjsp
    Created on : Aug 21, 2022, 10:18:57 AM
    Author     : tharik
--%>

<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            URL url = new URL("http://localhost:8080/rest-service/student/");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int respondCode = con.getResponseCode();
            if (respondCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
                                        
                                        
                String res = "";
                String inputLine = "";
                
                while ((inputLine = in.readLine()) != null) {
                    res += inputLine;
                }
                out.print(res);
            }
        
        %>
    </body>
</html>
