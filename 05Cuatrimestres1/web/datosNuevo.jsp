<%-- 
    Document   : datosNuevo.
    Created on : 20 jun. 2022, 08:28:41
    Author     : gatit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Nuevo</title>
    </head>
    <body>
        <h1>Datos Nuevo</h1>
        <h3>Alumno: <%=request.getParameter("nombre")%></h3>
        <h3>Grupo: <%=request.getParameter("grupo")%></h3>
        <h3>Cuatrimestre: <%=request.getParameter("cuatrimestre")%></h3>
        <hr>
        <h3>Para terminar la carrera te faltan: <%=request.getParameter("cuatrimestreRestante")%> cuatrimestres</h3>
    </body>
</html>
