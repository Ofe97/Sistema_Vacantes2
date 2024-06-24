package Datos.Dao;

import Modelo.Comentarios_Postulacion;
import  java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.SQLException;



public class ComentariosDAO {


    private  Connection connection;


    public ComentariosDAO(Connection connection){this.connection = connection;}


    //Agregar comentario

    public void  agregarComentario(Comentarios_Postulacion comentariosPostulacion)throws SQLException{
        String sql ="Insert into  Comentarios (Comentario) values (?)";
        try(PreparedStatement statement=connection.prepareStatement(sql)){
            statement.setString(1,comentariosPostulacion.getComentario());
            statement.executeUpdate();
        }
    }



    public void eliminarComentario(Comentarios_Postulacion comentariosPostulacion)throws  SQLException{
        String sql ="Delete from Comentarios_Postulacion where Comentario_id = ?";
        try(PreparedStatement statement=connection.prepareStatement(sql)){
            statement.setInt(1,comentariosPostulacion.getId_Comentario());
        }
    }


}
