<%-- 
    Document   : recibirDatos
    Created on : 15 jun. 2022, 07:56:18
    Author     : gatit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>Base: <%=request.getParameter("base")%></div>
        <div>Altura: <%=request.getParameter("altura")%></div>
        <div>Area: <%=request.getParameter("area")%></div>
    </body>
</html>
