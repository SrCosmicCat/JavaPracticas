<%@page import="modelos.Usuario"%>
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
        <h1>Método GET</h1>
        <%
            Usuario usuario = new Usuario();
            usuario.setUsuario("admin");
            usuario.setPassword("password");
        %>
        <a href="RecibirDatos?usuario=<%=usuario.getUsuario()%>&password=<%=usuario.getPassword()%>">Enviar datos</a>
        
        <h1>Método POST</h1>
        
        <form action="RecibirDatos" method="POST">
            <div>
                <input type="text" name="usuario" id="usuario" placeholder="Usuario">
            </div>
            <br>
            <div>
                <input type="password" name="password" id="password" placeholder="Password">
            </div>
            <br>
            <button type="submit">Enviar Datos</button>
        </form>
    </body>
</html>
