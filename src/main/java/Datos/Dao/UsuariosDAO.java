package Datos.Dao;

import Modelo.Usuarios;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDAO {

    private String Correo;
    private String Contrasena;
    private int id_Rol;

    private Connection connection;

    public UsuariosDAO(Connection connection){
        this.connection = connection;
    }

    //Registrar Usuario

    public void  insertarUsuario(Usuarios usuario) throws SQLException{
        String sql = "Insert into Usuarios (Correo,Contraseña,id_Rol) values (?,?,?) ";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, usuario.getCorreo());
            preparedStatement.setString(2, usuario.getContrasena());
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

    public void editarUsuario(String Correo, String Contrasena) throws SQLException{
        String sql = "Update Usuarios set Correo = ?,Contraseña = ? Where Correo = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1,Correo);
        statement.setString(2,Contrasena);
        statement.setString(3,Correo);
        statement.executeUpdate();
    }


    public int buscar(Usuarios usuario) throws SQLException {
        String sql = "select * from Usuarios where Correo = ? and Contraseña = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,usuario.getCorreo());
            statement.setString(2,usuario.getContrasena());
            System.out.println(statement.toString());
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                id_Rol = rs.getInt("id_Rol");
                Correo = rs.getString("Correo");
                return 1;
            }
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("entra aqui");
            return 0;
        }
        return 0;
    }


   public String obtenerRoles(Usuarios usuario)throws  SQLException{
        String sql = "Select Nombre from Roles  where Rol_id = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,usuario.getId_Rol());
            ResultSet rs =statement.executeQuery();
            if (rs.next()){
                return rs.getString("Nombre");
            }else {
                return null;
            }
        }
    }




}
