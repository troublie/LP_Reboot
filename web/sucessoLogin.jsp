<%-- 
    Document   : sucessoLogin
    Created on : Oct 11, 2016, 10:40:36 AM
    Author     : juliano.lopes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login bem sucedido</title>
    </head>
    <body>
        <%
            //permite acesso somente se a sessão existir
            String user = (String) session.getAttribute("usuario");
            String userName = null;
            String sessionID = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("usuario")) {
                        userName = cookie.getValue();
                    }
                    if (cookie.getName().equals("JSESSIONID")) {
                        sessionID = cookie.getValue();
                    }
                }
            }
        %>
        <h3> Olá <%=userName%>, login bem sucedido. Seu ID de sessão=<%=sessionID%></h3>
        <br>
        Usuário=<%=user%>
        <br>
        <a href="checkout.jsp">Deslogar</a>
        <form action="LogoutServlet" method="POST">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>
