package Datos.Dao;

import Modelo.Usuarios;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosDAO {

    private String Correo;
    private String Contraseña;
    private int id_Rol;

    private Connection connection;

    public UsuariosDAO(Connection connection){
        this.connection =connection;
    }



    //Registrar Usuario

    public void  insertarUsuario(Usuarios usuario) throws SQLException{
        String sql = "Inser into Usuarios (Coreo,Contraseña,id_Rol) values (?,?,?) ";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, usuario.getCorreo());
            preparedStatement.setString(2, usuario.getContraseña());
            preparedStatement.setInt(3,usuario.getId_Rol());
            preparedStatement.executeUpdate();

        }

    }


    //Eliminar Usuario

    public void eliminarUsuario(int id_Usuario) throws  SQLException {
        String sql = "Delete from Usuarios where id_Usuario= ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,id_Usuario);
            statement.executeUpdate();
        }
    }

 //Editar Usuario (Correo y Contraseña) Buscandolo por correo

    public void editarUsuario(String Correo, String Contraseña) throws SQLException{
        String sql = "Update Usuarios set Correo = ?,Contraseña = ? Where Correo = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1,Correo);
        statement.setString(2,Contraseña);
        statement.setString(3,Correo);
        statement.executeUpdate();
    }


}
