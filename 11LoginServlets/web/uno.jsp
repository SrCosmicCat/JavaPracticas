<% 
    HttpSession sesion = request.getSession();
    
    if (sesion.getAttribute("usuario") == null) {
        response.sendRedirect("index.html");
    }
%>  
<!DOCTYPE html>
    <html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Pagina uno</title>
        <style>
            *{
                padding: 0;
                margin: 0;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            }
            header{
                background-color: #38383a;
                color: #ffffff;
                margin-bottom: 1em;
            }
            header ul{
                display: flex;
            }
            ul li{
                list-style: none;
                margin: 1em 1em;
            }
            ul li a{
                color: #ffffff;
            }
            .selected{
                background-color: #dfaf29;
            }
        </style>
    </head>
    <body>
        <header>
            <ul>
                <li><a href="uno.jsp" class="selected">Uno</a></li>
                <li><a href="dos.jsp">Dos</a></li>
                <li><a href="tres.jsp">Tres</a></li>
                <li><a href="cerrar">Cerrar</a></li>
            </ul>
        </header>
        <h1>Página protegida</h1>
    </body>
</html>
