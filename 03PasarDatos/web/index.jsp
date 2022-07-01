<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Página que pasa datos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            String nombre = "CocaCola";
            double precio = 16.5;
            int cantidad = 3;
        %>
        <h1>Página que manda datos</h1>
        <h3>Nombre: <%=nombre%></h3>
        <h3>Precio: <%=precio%></h3>
        <h3>Cantidad: <%=cantidad%></h3>
        
        <a href="recibirDatos.jsp?nombre=<%=nombre%>&precio=<%=precio%>&cantidad=<%=cantidad%>">Enviar datos</a>
    </body>
</html>
