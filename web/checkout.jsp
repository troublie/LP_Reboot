<%-- 
    Document   : checkout
    Created on : Oct 11, 2016, 10:51:43 AM
    Author     : juliano.lopes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <%
            String userName = null;
            String sessionID = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("usuario")) {
                        userName = cookie.getValue();
                    }
                }
            }
        %>
        <h3> Olá <%=userName%>, faça o logout.</h3>
        <br>
        <form action="LogoutServlet" method="POST">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>
