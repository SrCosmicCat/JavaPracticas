<%-- 
    Document   : recibirDatos
    Created on : 18 jun. 2022, 22:28:34
    Author     : gatit
--%>

<%@page import="modelos.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos recibidos</title>
    </head>
    <body>
        <%
            Producto producto = new Producto();

            producto.setNombre(request.getParameter("nombre"));
            producto.setPrecio(Double.parseDouble(request.getParameter("precio")));
            producto.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
            
            producto.calcularTotal();
        %>
        <h3>Producto: <%=producto.getNombre()%></h3>
        <h3>Precio: <%=producto.getPrecio()%></h3>
        <h3>Cantidad: <%=producto.getCantidad()%></h3>
        <hr>
        <h3>Total: <%=producto.getTotal()%></h3>
    </body>
</html>
