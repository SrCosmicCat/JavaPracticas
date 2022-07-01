<%-- 
    Document   : formulario
    Created on : 22 jun. 2022, 22:11:01
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
        <h1>Formulario</h1>
        <form action="datosNuevo.jsp" method="post">
            <div>
                <label for="nombre">Nombre</label>
                <input type="text" name="nombre" id="nombre" value="<%=request.getParameter("nombre")%>">
            </div>
            <br>
            <div>
                <label for="grupo">Grupo</label>
                <input type="text" name="grupo" id="grupo" value="<%=request.getParameter("grupo")%>">
            </div>
            <br>
            <div>
                <label for="cuatrimestre">Cuatrimestre</label>
                <input type="number" name="cuatrimestre" id="cuatrimestre" value="<%=request.getParameter("cuatrimestre")%>">
            </div>
            <br>
            <div>
                <button type="submit">Enviar Datos</button>
            </div>
        </form>
    </body>
</html>
