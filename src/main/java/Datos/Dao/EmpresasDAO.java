package Datos.Dao;
import  Modelo.Empresas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import  java.sql.SQLException;

public class EmpresasDAO {

    private String Nomre_Empresa;

    private String Direccion;
    private String Pais;
    private String Estado;
    private String Telefono;
    private String Descripcion;

    private  Connection connection;


    public  EmpresasDAO(Connection connection){
        this.connection = connection;
    }



    // Editar Nombre empresa

    public  void  editarNombre_Empresa(int id_Empresa, String Nombre_Empresa)throws  SQLException{

    }













}
