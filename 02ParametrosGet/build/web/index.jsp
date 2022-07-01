<%@page import="modelos.Triangulo"%>
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
        <h1>Area triángulo otra vez</h1>
        <%
            Triangulo triangulo = new Triangulo(24.2, 6.4);
            triangulo.calculateArea();
            
            out.println("<div>La base es: " + triangulo.getBase()+ "</div>");
            out.println("<div>La altura es: " + triangulo.getAltura()+ "</div>");
            out.println("<div>El area es: " + triangulo.getArea() + "</div>");
        %>
        <hr>
        <div>Base: <%=triangulo.getBase()%></div>
        <div>Altura: <%=triangulo.getAltura()%></div>
        <div>Area: <%=triangulo.getArea()%></div>
        <hr>
        <a href="recibirDatos.jsp?base=2&altura=5&area=5">Enviar gatos</a>
    </body>
</html>
