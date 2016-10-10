<%-- 
    Document   : resultadoAtualiza
    Created on : Oct 10, 2016, 3:58:10 PM
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
        <h1>Resultado da atualização</h1>
        <% boolean res = (boolean) request.getAttribute("res"); %>
        <% if (res) {%>
        <p> Usuário atualizado com sucesso! </p>
        <%}%>
        <%if(!res){%>
        <p> Erro ao atualizar usuário! </p>
        <%}%>
    </body>
</html>
