package Controlador.Postulaciones;

import Datos.Dao.CandidatosDAO;
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

@WebServlet(name = "Modificar_Candidato",urlPatterns = {"/Modificar_Candidato"})
public class Modificar_Candidato extends HttpServlet{

    @Resource(name = "jdbc/database")
    private DataSource dataSource;

    @Override
    protected  void doPost(HttpServletRequest request , HttpServletResponse response)throws  ServletException,IOException{

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
        Connection connection = null;

        try{
            connection = dataSource.getConnection();
            CandidatosDAO candidatosDAO = new CandidatosDAO(connection);
            candidatosDAO.modificarCandidato(candidato);
            response.sendRedirect("Sistema_Vacantes/Vistas/Postularse.jsp");
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }



    }

}
