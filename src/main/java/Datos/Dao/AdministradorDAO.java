package Datos.Dao;

import Modelo.Administrador;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;




public class AdministradorDAO {

    private Connection connection;


    public AdministradorDAO(Connection connection){this.connection = connection;}

    //Cambie la estructura de como estaba haciendo mis DAO por cuestiones de tiempo de entrega del proyecto :(
    public void editarPerfil(Administrador administrador)throws SQLException{
        String sql = "Update Administrador set Nombre= ?, Correo = ?, Contraseña = ? where Admin_id = ?" ;
        try(PreparedStatement statement=connection.prepareStatement(sql)){
          statement.setString(1,administrador.getNombre());
          statement.setString(2,administrador.getCorreo());
          statement.setString(3,administrador.getContraseña());
          statement.executeUpdate();

        }
    }
}
