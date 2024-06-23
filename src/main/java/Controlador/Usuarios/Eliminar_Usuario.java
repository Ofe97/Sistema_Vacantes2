package Controlador.Usuarios;
import Datos.Dao.UsuariosDAO;



import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


@WebServlet(name = "Eliminar_Usuario" , urlPatterns = {"/Eliminar_Usuario"})
public class Eliminar_Usuario extends HttpServlet{

    private int id_Usuario;

    @Resource(name ="jdbc/database")
    private DataSource dataSource;


    @Override
    protected void doPost ( HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
     id_Usuario = (int) request.getSession().getAttribute("id_Usuario");

     Connection connection = null;

     try{
           connection = dataSource.getConnection();
           UsuariosDAO usuariosDAO = new UsuariosDAO(connection);

            usuariosDAO.eliminarUsuario(id_Usuario);

         response.sendRedirect("Sistema_Vacantes/Registrar_Usuario/Login.jps");


     }catch (SQLException e){
         e.printStackTrace();
         throw new ServletException("Error al eliminar el Usuario");
     }
     finally {
         if (connection !=null){
             try{
                 connection.close();
             }catch (SQLException e){
                 e.printStackTrace();
             }
         }
     }

   }
}