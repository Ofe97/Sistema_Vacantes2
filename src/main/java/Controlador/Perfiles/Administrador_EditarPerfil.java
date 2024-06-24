package Controlador.Perfiles;

import Datos.Dao.AdministradorDAO;
import Modelo.Administrador;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;



//Tambien cambie la estrucutra de mis servlets para ahorrar tiempo
@WebServlet(name= "Administrador_EditarPerfil",urlPatterns = {"/Administrador_EditarPerfil"})
public class Administrador_EditarPerfil extends HttpServlet {



    @Resource(name="jdbc/database")
    private DataSource dataSource;

    @Override
    protected  void doPost(HttpServletRequest request,HttpServletResponse response)throws  ServletException,IOException{
      Administrador administrador = new Administrador();

      administrador.setNombre(request.getParameter("Nombre"));
      administrador.setCorreo(request.getParameter("Correo"));
      administrador.setContraseña(request.getParameter("Contraseñ"));


      Connection connection =null;


      try{
          connection =dataSource.getConnection();
          AdministradorDAO administradorDAO = new AdministradorDAO(connection);
          administradorDAO.editarPerfil(administrador);
          response.sendRedirect("Sistema_Vacantes/Administrador_EditarPerfil/Editar_perfilAdmin.jsp");
      }catch (SQLException e){
          e.printStackTrace();
      }
       finally {
          if (connection != null){
              try{
                  connection.close();
              }catch (SQLException e){
                  e.printStackTrace();
              }
          }
      }
    }

}
