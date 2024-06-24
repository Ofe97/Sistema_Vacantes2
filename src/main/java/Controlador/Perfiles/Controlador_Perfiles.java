package Controlador.Perfiles;



import Datos.Dao.UsuariosDAO;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;



@WebServlet(name= "Controlador_Perfiles",urlPatterns = {"/Controlador_Perfiles"})
public class Controlador_Perfiles extends HttpServlet{

  @Resource(name = "jdbc/databse")
    private DataSource dataSource;

  @Override
   protected  void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
      HttpSession session = request.getSession();
      String Rol= (String) session.getAttribute("Rol");
      Connection connection =null;


      try {
           connection =dataSource.getConnection();
          UsuariosDAO usuariosDAO =new UsuariosDAO(connection);

          if (Rol == null) {

          } else {
              switch (Rol) {
                  case "Estudiante":
                      response.sendRedirect("Vistas/Perfil_Estudiante.jsp");
                      break;

                  case "Empresa":
                      response.sendRedirect("Vistas/Perfil_Empresa.jsp");
                      break;

                  case "Administrador":
                      response.sendRedirect("Vistas/Perfil_Administrador.jsp");
                      break;
              }
          }
      }catch (SQLException e){
          e.printStackTrace();

          response.sendRedirect("Error_de_pagina.jsp");
      }finally {
          if(connection != null){
              try{
                  connection.close();
              }catch (SQLException e){
                  e.printStackTrace();
              }
          }
      }
   }

 }



