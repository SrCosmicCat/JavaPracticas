package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.Usuario;

@WebServlet(name = "Login",urlPatterns = {"/Login"})
public class Login extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
                
                Usuario usuario = new Usuario();

                usuario.setUsuario(request.getParameter("usuario"));
                usuario.setPassword(request.getParameter("password"));

                if (usuario.getUsuario().equals("admin") && (usuario.getPassword().equals("admin"))) {
                    HttpSession sesion = request.getSession();
                    sesion.setAttribute("usuario", usuario.getUsuario());

                    response.sendRedirect("uno.jsp");
                }
                else {
                    response.sendRedirect("index.html");
                }
                
    }
}
