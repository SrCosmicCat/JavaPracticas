package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "formulario",urlPatterns = {"/formulario"})
public class formulario extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.print("<h1>Formulario</h1>");
                
                out.print(
                    "<form action='datosNuevo' method='POST'>" +
                        "<div>" +
                            "<label for='nombre'>Nombre </label>" +
                                "<input type='text' name='nombre' id='nombre' value=" + request.getParameter("nombre") + ">" +
                        "</div>" +
                        "<br>" +
                        "<div>" +
                            "<label for='grupo'>Grupo </label>" +
                            "<input type='text' name='grupo' id='grupo' value=" + request.getParameter("grupo") + ">" +
                        "</div>" +
                        "<br>" +
                        "<div>" +
                            "<label for='cuatrimestre'>Cuatrimestre </label>" +
                            "<input type='number' name='cuatrimestre' id='cuatrimestre' value=" + request.getParameter("cuatrimestre") + ">" +
                        "</div>" +
                        "<br>" +
                        "<div>" +
                            "<button type='submit'>Enviar Datos</button>" +
                        "</div>" +
                    "</form>"
                );
            }
                        
    }
}