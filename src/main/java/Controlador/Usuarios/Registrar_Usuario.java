package Controlador.Usuarios;

import Datos.Dao.UsuariosDAO;
import Modelo.Usuarios;
import Datos.Conexion;
import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "Registrar_Usuario", urlPatterns = {"/Registrar_Usuario"})
public class Registrar_Usuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String correo = request.getParameter("Correo");
        String contrasena = request.getParameter("pass");
        int idRol;

        try {
            idRol = Integer.parseInt(request.getParameter("id_Rol"));
        } catch (NumberFormatException e) {
            throw new ServletException("El id del rol debe ser un número", e);
        }

        try (Connection connection = Conexion.getConnection()) {
            UsuariosDAO usuariosDAO = new UsuariosDAO(connection);

            String seleccionarRol;
            switch (idRol) {
                case 1:
                    seleccionarRol = "Estudiante";
                    break;
                case 2:
                    seleccionarRol = "Empresa";
                    break;
                case 3:
                    seleccionarRol = "Administrador";
                    break;
                default:
                    throw new ServletException("Rol inválido");
            }

            Usuarios usuario = new Usuarios(correo, contrasena, idRol);
            System.out.println(usuario.toString());
            usuariosDAO.insertarUsuario(usuario);

            response.sendRedirect(request.getContextPath()+"/Vistas/Registrar_Usuario.jsp");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Error al registrar Usuario", e);
        }
    }
}
