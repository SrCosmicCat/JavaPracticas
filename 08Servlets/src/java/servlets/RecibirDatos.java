package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.Usuario;

@WebServlet(name = "RecibirDatos",urlPatterns = {"/RecibirDatos"})
public class RecibirDatos extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                Usuario usuario = new Usuario();
                usuario.setUsuario(request.getParameter("usuario"));
                usuario.setPassword(request.getParameter("password"));
                out.print("<div>Usuario: "+usuario.getUsuario()+"</div>");
                out.print("<div>Password: "+usuario.getPassword()+"</div>");
            }
                        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                Usuario usuario = new Usuario();
                usuario.setUsuario(request.getParameter("usuario"));
                usuario.setPassword(request.getParameter("password"));
                
                HttpSession sesion = request.getSession();
                sesion.setAttribute("usuario", usuario.getUsuario());
                
                out.print("<div>Usuario: "+usuario.getUsuario()+"</div>");
                out.print("<div>Password: "+usuario.getPassword()+"</div>");
                out.print("<div>Usuario sesion: "+sesion.getAttribute("usuario")+"</div>");
                sesion.invalidate();
            }
                        
    }
}
