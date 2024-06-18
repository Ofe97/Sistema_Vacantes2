package Datos.Dao;

import Modelo.Carrera;
import Modelo.Horarios;
import  Datos.Conexion;
import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class HorariosDAO {

    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    private Horarios horarios;


    public HorariosDAO(Connection connection) {
        this.connection = connection;
    }

    // Insertar  Horario
    private void insertHorario(Horarios horarios) throws SQLException {

        this.ps = this.connection.prepareStatement("Insert into Horarios (id_Horarios,Tipo_de_Horarios) values (?,?) ");
        ps.setInt(1, horarios.getId_Horarios());
        ps.setString(2, horarios.getTipo_de_horarios());
        ps.executeUpdate();
    }


    // Buscar Horario por ID


    public Horarios  getHorarios(int id_Horario) throws SQLException {
        this.ps = this.connection.prepareStatement("Select * from Horario where id_Horario = ?");
        this.ps.setInt(1, id_Horario);
        this.rs = this.ps.executeQuery();

        if (!this.rs.next()) {
            Conexion.close(rs);
            Conexion.close(ps);
            return null;

        }
        Horarios horarioEncontrado = new Horarios(rs.getInt("id_Horario"),rs.getString("Tipo_de_horario"));

        Conexion.close(rs);
        Conexion.close(ps);

        return horarioEncontrado;
    }


    //Modificar Horarios

    public Horarios modifHorario(int id_Horarios,String Tipo_de_horario) throws  SQLException{
        Horarios horarioEncontrado = getHorarios(id_Horarios);

        if(horarioEncontrado == null){
            return null;
        }

        this.ps = this.connection.prepareStatement("update Horarios set Tipo_de_horario = ? where id_Horarios =?");
        this.ps.setString(1,Tipo_de_horario);
        this.ps.setInt(2,id_Horarios);
        this.ps.executeUpdate();

        return horarioEncontrado;
    }


    // Eliminar Horarios





}
