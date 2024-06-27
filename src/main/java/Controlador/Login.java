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

@WebServlet(name = "login", urlPatterns = {"/loginservlet"})
public class login extends HttpServlet {

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
            }else {
                response.sendRedirect(request.getContextPath() + "/Login.jsp");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Error al registrar Usuario", e);
        }
    }
}