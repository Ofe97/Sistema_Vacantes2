package Controlador;

import Datos.Dao.UsuariosDAO;
import Modelo.Usuarios;
import Datos.Conexion;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "loginservlet", urlPatterns = {"/loginservlet"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String correo = request.getParameter("Correo");
        String contrasena = request.getParameter("pass");

        try (Connection connection = Conexion.getConnection()) {
            UsuariosDAO usuariosDAO = new UsuariosDAO(connection);

            Usuarios usuario = new Usuarios();
            usuario.setCorreo(correo);
            usuario.setContrasena(contrasena);

            int valor = usuariosDAO.buscar(usuario);

            if (valor == 1) {
                request.getSession().setAttribute("usuario", usuario);
                response.sendRedirect(request.getContextPath() + "/Vistas/Perfil_Estudiante.jsp");
            } else if (valor == 2) {
                request.getSession().setAttribute("usuario", usuario);
                response.sendRedirect(request.getContextPath() + "/Vistas/Perfil_Empresa.jsp");
            } else if (valor == 3) {
                request.getSession().setAttribute("usuario", usuario);
                response.sendRedirect(request.getContextPath() + "/Vistas/Perfil_Administrador.jsp");
            } else {
                response.sendRedirect(request.getContextPath() + "/Login.jsp");
            }


            /*if (valor == 1) {
                request.getSession().setAttribute("usuario", usuario);
                response.sendRedirect(request.getContextPath() + "/Vistas/Perfil_Estudiante.jsp");
            }else {
                response.sendRedirect(request.getContextPath() + "/Login.jsp");
            }*/
              /*String rol = usuariosDAO.obtenerRoles(usuario);
              if(rol !=null){
                  switch (rol){
                      case "Estudiante":
                          //System.out.println("Redirigiendo al perfil");
                          request.getSession().setAttribute("usuario",usuario);
                          response.sendRedirect(request.getContextPath()+"/Vistas/Perfil_Estudiante.jsp");
                          return;
                      case "Empresa":
                          request.getSession().setAttribute("usuario",usuario);
                          response.sendRedirect(request.getContextPath()+ "/Vistas/Perfil_Empresa.jsp");
                          return;
                      case "Administrador":
                          request.getSession().setAttribute("usuario",usuario);
                          response.sendRedirect(request.getContextPath()+"/Vistas/Perfil_Administrador.jsp");
                          return;
                      default:
                          response.sendRedirect(request.getContextPath() + "/Login.jsp");
                  }
              } else {
                  response.sendRedirect(request.getContextPath() + "/Login.jsp");
              }
            } else {
                response.sendRedirect(request.getContextPath() + "/Login.jsp");
            }*/

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Error al registrar Usuario", e);
        }
    }
}