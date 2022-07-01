package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Alumno;

@WebServlet(name = "datosNuevo",urlPatterns = {"/datosNuevo"})
public class datosNuevo extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                Alumno alumno = new Alumno();
                alumno.setNombre(request.getParameter("nombre"));
                alumno.setGrupo(request.getParameter("grupo"));
                alumno.setCuatrimestre(Integer.parseInt(request.getParameter("cuatrimestre")));
                alumno.setCuatrimestreRestante();
                
                out.print("<h1>Datos nuevo</h1>");
                out.print("<div>Nombre: "+request.getParameter("nombre")+"</div>");
                out.print("<div>Grupo: "+request.getParameter("grupo")+"</div>");
                out.print("<div>Cuatrimestre: "+request.getParameter("cuatrimestre")+"</div>");
                out.print("<hr><div>Para terminar la carrera te faltan: "+request.getParameter("cuatrimestreRestante")+" cuatrimestres</div>");
                
            }
                        
    }
}