<%-- 
    Document   : triangulo1
    Created on : 13 jun. 2022, 07:36:59
    Author     : gatit
--%>

<%@page import="figuras.Triangulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calcula el área de un triángulo xd</h1>
        <%
            Triangulo triangulo = new Triangulo();
            triangulo.setBase(10);
            triangulo.setAltura(20);
            triangulo.calculateArea();
            
            out.println("El area es: " + triangulo.getArea());
        %>
    </body>
</html>
