<%-- 
    Document   : resultadoRemove
    Created on : Oct 10, 2016, 1:15:35 PM
    Author     : juliano.lopes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado da remoção</h1>
        <% boolean res = (boolean) request.getAttribute("idRem"); %>
        <% if (res) {%>
        <p> Usuário removido com sucesso! </p>
        <%}%>
        <%if(!res){%>
        <p> Erro ao remover usuário! </p>
        <%}%>
    </body>
</html>
