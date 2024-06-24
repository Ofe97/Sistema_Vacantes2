package Controlador.Postulaciones;

import  Datos.Dao.CandidatosDAO;
import Modelo.Candidatos;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;



@WebServlet(name = "Registrarse_como_Candidato",urlPatterns = {"/Registrarse_como_Candidato"})
public class Registrarse_como_Candidato extends HttpServlet {


    @Resource(name = "jdbc/database")
    private DataSource dataSource;

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws  ServletException,IOException{

       Candidatos candidato = new Candidatos();



        candidato.setNombre(request.getParameter("Nombre"));
        candidato.setCorreo(request.getParameter("Correo"));
        candidato.setTelefono(request.getParameter("Telefono"));
        candidato.setDireccion(request.getParameter("Direccion"));
        candidato.setExperiencia(request.getParameter("Experiencia"));
        candidato.setHabilidades(request.getParameter("Habilidades"));


        InputStream cvInputStream = null;
        Part filePart = request.getPart("cv");
        if(filePart != null){
            cvInputStream = filePart.getInputStream();
        }


        Connection connection =null;


        try{
            connection = dataSource.getConnection();
            CandidatosDAO candidatosDAO = new CandidatosDAO(connection);
            candidatosDAO.registrarCandidato(candidato);
            response.sendRedirect("Sistema_Vacantes/Vistas/Postulaciones.jsp");

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
