package Controlador.Vacantes;


import Datos.Dao.VacanteDAO;
import Modelo.Vacantes;



import  javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import  javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;



@WebServlet(name = "Agregar_Vacante",urlPatterns =  {"/Agregar_Vacante"})
public class Agregar_Vacante extends HttpServlet {

      private  int Cantidad;
      private int Tipo_Vacante;
      private  int Horario;
      private int Postulaciones;

      @Resource(name = "jdbc/database")
      private  DataSource dataSource;


  @Override
   protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{


      Cantidad = Integer.parseInt(request.getParameter("Cantidad"));
      Tipo_Vacante = Integer.parseInt(request.getParameter("Tipo_Vacante"));
      Horario =  Integer.parseInt(request.getParameter("Horario"));
      Postulaciones = Integer.parseInt(request.getParameter("Postulaciones"));


      Connection connection = null;

      try{

          connection = dataSource.getConnection();
          VacanteDAO vacanteDAO = new VacanteDAO(connection);



          Vacantes  vacantes = new Vacantes(Cantidad,Tipo_Vacante,Horario,Postulaciones);
          vacanteDAO.agregarVacante(vacantes);

          response.sendRedirect("Sistema_Vacantes/Vacantes/Registrar_Nueva_Vacante.jsp");

      }catch(SQLException e){
          e.printStackTrace();
          throw  new ServletException(("Error al agregar vacante"));
      }
      finally {
          if (connection != null){
              try {
                  connection.close();
              }catch (SQLException e){
                  e.printStackTrace();
              }

          }
      }




  }




}
