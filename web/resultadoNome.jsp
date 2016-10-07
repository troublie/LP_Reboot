<%-- 
    Document   : resultadoNome
    Created on : Oct 7, 2016, 3:35:19 PM
    Author     : juliano.lopes
--%>

<%@page import="java.util.Collection"%>
<%@page import="mack.entities.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type"
              content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado da busca pelo nome</h1>
        <%
            Collection<Usuario> usuarios = (Collection<Usuario>) request.getAttribute("nome");
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