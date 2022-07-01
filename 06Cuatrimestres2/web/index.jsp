<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            String nombre = "Fulanito";
            String grupo = "TI0X";
            int cuatrimestre = 3; 
        %>
        <h1>Datos del alumno</h1>
        <div>Alumno: <%=nombre%></div>
        <br>
        <div>Grupo: <%=grupo%></div>
        <br>
        <div>Cuatrimestre: <%=cuatrimestre%></div>
        <hr>
        <a href="formulario.jsp?nombre=<%=nombre%>&grupo=<%=grupo%>&cuatrimestre=<%=cuatrimestre%>">Enviar datos</a>
    </body>
</html>
