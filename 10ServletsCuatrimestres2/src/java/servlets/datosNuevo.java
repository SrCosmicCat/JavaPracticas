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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                Alumno alumno = new Alumno();
                alumno.setNombre(request.getParameter("nombre"));
                alumno.setGrupo(request.getParameter("grupo"));
                alumno.setCuatrimestre(Integer.parseInt(request.getParameter("cuatrimestre")));
                alumno.setCuatrimestreRestante();
                
                out.print("<h1>Datos alumno</h1>");
                out.print("<div>Nombre: "+alumno.getNombre()+"</div>");
                out.print("<div>Grupo: "+alumno.getGrupo()+"</div>");
                out.print("<div>Cuatrimestre: "+alumno.getCuatrimestre()+"</div>");
                out.print("<hr><div>Para terminar la carrera te faltan: "+alumno.getCuatrimestreRestante()+" cuatrimestres</div>");
            }
                        
    }
}
