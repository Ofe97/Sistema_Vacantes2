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


@WebServlet(name= "Administrador_EditarPerfil",urlPatterns = {"/Administrador_EditarPerfil"})
public class Administrador_EditarPerfil extends HttpServlet {



    @Resource(name="jdbc/database")
    private DataSource dataSource;

    @Override
    protected  void doPost(HttpServletRequest request,HttpServletResponse response)throws  ServletException,IOException{

    }

}
