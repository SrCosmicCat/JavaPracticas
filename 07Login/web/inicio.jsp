<% 
    HttpSession sesion = request.getSession();
    
    if (sesion.getAttribute("usuario") == null) {
        response.sendRedirect("index.html");
    }
%>      

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Página protegida</h1>
        <a href="logout.jsp">Cerrar sesion</a>
    </body>
</html>
