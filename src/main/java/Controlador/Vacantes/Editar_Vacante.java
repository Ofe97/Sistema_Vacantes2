package Controlador.Vacantes;

import Datos.Dao.VacanteDAO;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import  javax.servlet.annotation.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;




@WebServlet(name = "Editar_Vacante", urlPatterns = {"/Editar_Vacante"})
public class Editar_Vacante extends HttpServlet {


    private int Cantidad;
    private  int Tipo_Vacante;
    private int Horario;
    private int Postulaciones;



    @Resource(name = "jdbc/database")
    private DataSource dataSource;


    @Override
    protected  void doPost(HttpServletRequest request , HttpServletResponse response)throws  ServletException, IOException{
        Cantidad = Integer.parseInt(request.getParameter("Cantidad"));
        Tipo_Vacante = Integer.parseInt(request.getParameter("Tipo_Vacante"));
        Horario = Integer.parseInt(request.getParameter("Horario"));
        Postulaciones = Integer.parseInt(request.getParameter("Postulaciones"));

        Connection connection = null;

        try{

            connection = dataSource.getConnection();
            VacanteDAO vacanteDAO = new VacanteDAO(connection);

            vacanteDAO.editarVacante(Cantidad,Tipo_Vacante,Horario,Postulaciones);
            response.sendRedirect("Sistema_Vacantes/Vacantes/Editar_Vacante.jps");
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
