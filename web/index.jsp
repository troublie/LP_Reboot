<%-- 
    Document   : index
    Created on : Oct 4, 2016, 5:41:44 PM
    Author     : juliano.lopes
--%>

<%@page import="java.util.Collection"%>
<%@page import="mack.entities.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type"
              content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuarios!</h1>
        <%
            Collection<Usuario> usuarios = (Collection<Usuario>) request.getAttribute("usuarios");
        %>
        <%if (!usuarios.isEmpty()) { %>
        <table>
            <% for (Usuario u : usuarios) {%>
            <tr>
                <td><%=u.getNome()%></td>
                <td><%=u.getSobrenome()%></td>
            </tr>
            <%}%>
        </table>
        <%}%>
    </body>
</html>
