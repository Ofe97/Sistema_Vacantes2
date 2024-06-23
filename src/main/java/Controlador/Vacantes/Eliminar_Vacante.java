package Controlador.Vacantes;

import Datos.Dao.UsuariosDAO;
import Datos.Dao.VacanteDAO;


import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sql.DataSource;
import  java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;



@WebServlet(name = "Eliminar_Vacante",urlPatterns = {"/Eliminar_Vacante"})
public class Eliminar_Vacante extends HttpServlet {


    private int id_Vacante;


    @Resource(name = "jdbc/database")
    private DataSource dataSource;


    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        id_Vacante = (int) request.getSession().getAttribute("id_Vacante");

        Connection connection = null;

        try {
            connection = dataSource.getConnection();
            VacanteDAO vacanteDAO = new VacanteDAO(connection);

            vacanteDAO.eliminarVacante(id_Vacante);

            response.sendRedirect("Sistema_Vacantes/Eliminar_Vacante/Eliminar_Vacante.jps");

        }catch (SQLException e){
            e.printStackTrace();;
            throw new ServletException("Error al eliminar Vacante");
        }
        finally {
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
