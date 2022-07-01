<%@page import="modelos.Usuario"%>
<%
    Usuario usuario = new Usuario();
    
    usuario.setUsuario(request.getParameter("usuario"));
    usuario.setPassword(request.getParameter("password"));
    
    if (usuario.getUsuario().equals("router1") && (usuario.getPassword().equals("cisco123"))) {
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuario", usuario.getUsuario());
        sesion.setAttribute("usuario", usuario.getUsuario());
        response.sendRedirect("inicio.jsp");
    }
    else {
        response.sendRedirect("index.html");
    }
%>
