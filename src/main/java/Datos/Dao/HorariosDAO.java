package Datos.Dao;

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


    public HorariosDAO(Connection connection){this.connection= connection;}

    // Insertar  Horario
    private void  insertHorario(Horarios horarios) throws SQLException {

        this.ps = this.connection.prepareStatement("Insert into Horarios (id_Horarios,Tipo_de_Horarios) values (?,?) ");
        ps.setInt(1,horarios.getId_Horarios());
        ps.setString(2,horarios.getTipo_de_horarios());
        ps.executeUpdate();
    }


 // Buscar Horario por ID








}
