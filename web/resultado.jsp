<%-- 
    Document   : resultado
    Created on : Oct 7, 2016, 3:03:45 PM
    Author     : juliano.lopes
--%>

<%@page import="mack.entities.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado da busca por ID</h1>
        <% Usuario usuario = (Usuario) request.getAttribute("usuarioID");%>
        <table>
            <tr>
                <td><%=usuario.getId()%></td>
                <td><%=usuario.getNome()%></td>
                <td><%=usuario.getSobrenome()%></td>
            </tr>
        </table>
    </body>
</html>
