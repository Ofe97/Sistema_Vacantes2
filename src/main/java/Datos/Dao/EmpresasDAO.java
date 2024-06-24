package Datos.Dao;
import  Modelo.Empresas;


import java.sql.Connection;
import java.sql.PreparedStatement;
import  java.sql.SQLException;

public class   EmpresasDAO {

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
     String sql= "Update Empresas set Nombre_Empresa = ? where id_Empresa= ?";
     try(PreparedStatement statement = connection.prepareStatement(sql)){
         statement.setString(1,Nombre_Empresa);
         statement.setInt(2,id_Empresa);
         statement.executeUpdate();
      }
    }


    // Editar direccion  Empresa

    public void editarDireccion(int id_Empresa, String Direccion)throws  SQLException{
        String sql = "Update Empresas set Direccion = ? where id_Empresa = ?";
        try(PreparedStatement statement= connection.prepareStatement(sql)){
            statement.setString(1,Direccion);
            statement.setInt(2,id_Empresa);
            statement.executeUpdate();
        }
    }


  //Editar Pais donde se ubica la empresa

    public void editarPais(int id_Empresa, String Pais)throws SQLException{
        String sql= "Update Empresas set Pais = ? where id_Empresa = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,Pais);
            statement.setInt(2,id_Empresa);
            statement.executeUpdate();
        }
    }


  //Editar Estado donde se ubica la empresa


    public void editarEstado(int id_Empresa, String Estado)throws SQLException{
        String sql ="Update Empresas set Estado = ? where id_Empresa = ? ";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,Estado);
            statement.setInt(2,id_Empresa);
            statement.executeUpdate();
        }
    }

  //Editar Telefono Empresa

    public void editarTelefono(int id_Empresa, String Telefono)throws SQLException{
        String sql = "Update Empresas set Telefono = ? where id_Empresa = ?";
        try(PreparedStatement statement= connection.prepareStatement(sql)){
            statement.setString(1, Telefono);
            statement.setInt(2,id_Empresa);
            statement.executeUpdate();
        }
    }



    //Editar Descripcion sobre la empresa


     public void editarDescripcion(int id_Empresa, String Descripcion)throws  SQLException{
        String sql ="Update Empresas set Descripcion = ? where id_Empresa = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, Descripcion);
            statement.setInt(2, id_Empresa);
            statement.executeUpdate();
        }
     }



}
