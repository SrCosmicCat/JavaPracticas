<%-- 
    Document   : datosNuevo
    Created on : 22 jun. 2022, 22:11:13
    Author     : gatit
--%>

<%@page import="modelos.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Los datos capturados son:</h1>
        <%
            Alumno alumno = new Alumno();
            
            alumno.setNombre(request.getParameter("nombre"));
            alumno.setGrupo(request.getParameter("grupo"));
            alumno.setCuatrimestre(Integer.parseInt(request.getParameter("cuatrimestre")));
            
            alumno.setCuatrimestreRestante();
        %>
        <h3>Alumno: <%=alumno.getNombre()%></h3>
        <h3>Grupo: <%=alumno.getGrupo()%></h3>
        <h3>Cuatrimestre: <%=alumno.getCuatrimestre()%></h3>
        <hr>
        <h3>Para terminar la carrera te faltan: <%=alumno.getCuatrimestreRestante()%> cuatrimestres</h3>
    </body>
</html>
