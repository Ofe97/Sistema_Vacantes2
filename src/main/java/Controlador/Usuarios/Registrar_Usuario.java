package Controlador.Usuarios;

import Datos.Dao.UsuariosDAO;
import Modelo.Usuarios;


import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;



@WebServlet(name = "Registrar_Usuario",urlPatterns = {"/Registrar_Usuario"})
public class Registrar_Usuario extends HttpServlet{

    private String Correo;
    private String Contraseña;

    private int  id_Rol;


    @Resource(name = "jdbc/database")
    private DataSource dataSource;


    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {

        Correo = request.getParameter("Correo");
        Contraseña = request.getParameter("Contraseña");
        id_Rol = Integer.parseInt(request.getParameter("id_Rol"));

        Connection connection= null;

        try {


            connection = dataSource.getConnection();
            UsuariosDAO usuariosDAO = new UsuariosDAO(connection);

            String seleccionarRol;
            switch (id_Rol) {
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
                    throw new ServletException("Rol invalido");
            }

            Usuarios usuario= new Usuarios( Correo, Contraseña, id_Rol);
            usuariosDAO.insertarUsuario(usuario);


            response.sendRedirect("Sistema_Vacantes/Registrar_Usuario/Regristar_Usuario.jsp");

        }catch (SQLException e){
            e.printStackTrace();
            throw new ServletException("Error al registrar Usuario");
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
