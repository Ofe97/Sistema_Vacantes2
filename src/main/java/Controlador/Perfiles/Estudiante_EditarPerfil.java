package Controlador.Perfiles;

import Datos.Dao.EstudiantesDAO;
import Modelo.Estudiantes;


import javax.annotation.Resource;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sql.DataSource;
import java.io.IOException;
import  java.sql.Connection;
import  java.sql.SQLException;



@WebServlet(name= "Estudiante_EditarPerfil",urlPatterns = {"/Estudiante_EditarPerfil"})
public class Estudiante_EditarPerfil extends HttpServlet {


    private  int id_Estudiante;

    private String Nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private int Tipo_de_titulo;
    private int Carrera;
    private int Universidad;
    private String Telefono_fijo;
    private String Telefono_celular;
    private String Correo;


    @Resource(name= "jdbc/database")
    private DataSource dataSource;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException{
        //id_Estudiante = Integer.parseInt(request.getParameter("id_Estudiante"));
        Nombre = request.getParameter("Nombre");
        Apellido_Paterno = request.getParameter("Apellido_Paterno");
        Apellido_Materno = request.getParameter("Apellido_Materno");
        Tipo_de_titulo = Integer.parseInt(request.getParameter("Tipo_de_Titulo"));
        Carrera =Integer.parseInt(request.getParameter("Carrera"));
        Universidad = Integer.parseInt(request.getParameter("Universidad"));
        Telefono_fijo = request.getParameter("Telefono_fijo");
        Telefono_celular = request.getParameter("Telefono_celular");

        Connection connection = null;

      try{


          connection = dataSource.getConnection();
          EstudiantesDAO estudiantesDAO = new EstudiantesDAO(connection);


          if(Nombre != null && Apellido_Paterno != null && Apellido_Materno != null && Tipo_de_titulo != 0 && Carrera != 0 && Universidad != 0 && Telefono_fijo != null && Telefono_celular != null){
              estudiantesDAO.editarNombre(id_Estudiante,Nombre);
              estudiantesDAO.editarApellido_Paterno(id_Estudiante,Apellido_Paterno);
              estudiantesDAO.editarApellido_Materno(id_Estudiante,Apellido_Materno);
              estudiantesDAO.editarTipo_de_titulo(id_Estudiante,Tipo_de_titulo);
              estudiantesDAO.editarCarrera(id_Estudiante,Carrera);
              estudiantesDAO.editarUniversidad(id_Estudiante,Universidad);
              estudiantesDAO.editarTelefono_fijo(id_Estudiante,Telefono_fijo);
              estudiantesDAO.editarTelefono_celular(id_Estudiante,Telefono_celular);
          }
          response.sendRedirect("Sistema_Vacantes/Estudiante_EditarPerfil/Editar_Perfil.jsp");

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
