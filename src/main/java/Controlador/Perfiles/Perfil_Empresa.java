package Controlador.Perfiles;

import Datos.Dao.EmpresasDAO;


import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;



@WebServlet(name = "Perfil_Empresa",urlPatterns = {"/Perfil_Empresa"})
public class Perfil_Empresa extends  HttpServlet{


  private int id_Empresa;
  private String Nombre_Empresa;
  private String Direccion;
  private String Pais;
  private String Estado;
  private String Telefono;
  private String Descripcion;




  @Resource(name= "jdbc/database")
    private DataSource dataSource;


  @Override
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException ,IOException{
      Nombre_Empresa = request.getParameter("Nombre");
      Direccion =  request.getParameter("Direccion");
      Pais = request.getParameter("Pais");
      Estado = request.getParameter("Estado");
      Telefono = request.getParameter("Telefono");
      Descripcion = request.getParameter("Descripcion");



      Connection connection = null;


      try{

          connection = dataSource.getConnection();
          EmpresasDAO empresasDAO = new EmpresasDAO(connection);

         if (Nombre_Empresa != null && Direccion != null && Pais != null && Estado != null && Telefono != null && Descripcion != null ){
             empresasDAO.editarNombre_Empresa(id_Empresa,Nombre_Empresa);
             empresasDAO.editarDireccion(id_Empresa,Direccion);
             empresasDAO.editarPais(id_Empresa,Pais);
             empresasDAO.editarEstado(id_Empresa,Estado);
             empresasDAO.editarTelefono(id_Empresa,Telefono);
             empresasDAO.editarDescripcion(id_Empresa,Descripcion);

         }
         response.sendRedirect("Sistema_Vacantes/Vistas/Perfil_Empresa.jsp");
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
