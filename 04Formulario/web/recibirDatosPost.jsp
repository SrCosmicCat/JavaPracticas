<%-- 
    Document   : recibirDatosPost
    Created on : 20 jun. 2022, 07:32:55
    Author     : gatit
--%>

<%@page import="modelos.Triangulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Recibir datos triángulo</h1>
        <%
            Triangulo triangulo = new Triangulo();
            
            triangulo.setBase(Double.parseDouble(request.getParameter("base")));
            triangulo.setAltura(Double.parseDouble(request.getParameter("altura")));
            triangulo.setArea();
        %>
        <div>Base: <%=triangulo.getBase()%>
        <div>Altura <%=triangulo.getAltura()%>
        <div>Area: <%=triangulo.getArea()%>
    </body>
</html>
