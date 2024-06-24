package Datos.Dao;

import Modelo.Candidatos;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class CandidatosDAO {

    private  Connection connection;



    public  CandidatosDAO(Connection connection){this.connection= connection;}

    public void registrarCandidato(Candidatos candidato)throws SQLException{
        String sql = "Insert into Candidatos (Nombre, Correo,Telefono , Direccion , Experiencia , Habilidades,CV, Postulacion, Estudiante  )values (?,?,?,?,?,?,?,?,?)";
        try(PreparedStatement statement =connection.prepareStatement(sql)){
            statement.setString(1,candidato.getNombre());
            statement.setString(2,candidato.getCorreo());
            statement.setString(3, candidato.getTelefono());
            statement.setString(4,candidato.getDireccion());
            statement.setString(5,candidato.getExperiencia());
            statement.setString(6,candidato.getHabilidades());
            statement.setBytes(7,candidato.getCV());
            statement.setInt(8,candidato.getPostulacion());
            statement.setInt(9,candidato.getEstudiante());


            statement.executeUpdate();






        }




    }

    public void modificarCandidato(Candidatos candidato)throws SQLException{
        String sql = "Update Candidatos  set Nombre = ?,Correo = ? , Telefono = ? , Direccion = ?, Experiencia = ?, CV = ?, Postulacion = ? , Estudiante = ?  where Candidato_id = ? ";
        try(PreparedStatement statement= connection.prepareStatement(sql)){
            statement.setString(1,candidato.getNombre());
            statement.setString(2,candidato.getCorreo());
            statement.setString(3,candidato.getTelefono());
            statement.setString(4,candidato.getDireccion());
            statement.setString(5,candidato.getExperiencia());
            statement.setString(6,candidato.getHabilidades());
            statement.setBytes(7,candidato.getCV());
            statement.setInt(8,candidato.getPostulacion());
            statement.setInt(9,candidato.getEstudiante());
            statement.executeUpdate();
        }
    }


    // Obtener candidato


    private  void obtenerCandidato(Candidatos candidato)throws SQLException{
        String sql = "Select * from Candidatos where Cnadidato_id = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,candidato.getCandidato_id());
            statement.executeUpdate();
        }
    }


    public boolean situacionCandidato(Candidatos candidato)throws SQLException{
        String sql = "Update Candidatos set Estado = true  where Candidato_id = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setBoolean(1,candidato.isEstado());
            statement.executeUpdate();
            return true;
        }catch (SQLException e ){
            e.printStackTrace();
            return false;
        }

    }


}
