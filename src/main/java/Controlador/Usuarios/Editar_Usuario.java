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


@WebServlet(name = "Editar_Usuario", urlPatterns = {"/Editar_Usuario"})
public  class Editar_Usuario extends HttpServlet{

    private String Correo;
    private String Contraseña;


    @Resource(name = "jdbc/database")
    private DataSource dataSource;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException,IOException{

        Correo = request.getParameter("Correo");
        Contraseña = request.getParameter("Contraseña");

        Connection connection = null;

       try{
           connection = dataSource.getConnection();
           UsuariosDAO usuariosDAO = new UsuariosDAO(connection);


           usuariosDAO.editarUsuario(Correo,Contraseña);

           response.sendRedirect("Sistema Vacantes/Usuarios/Editar_Usuario.jps");
       }catch (SQLException e){
           e.printStackTrace();
       }
       finally {

           if(connection != null){
               try{
                   connection.close();
               } catch (SQLException e){
                   e.printStackTrace();
               }
           }
       }





    }



}

