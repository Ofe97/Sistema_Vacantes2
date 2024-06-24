package Datos.Dao;

import Modelo.Vacantes;
import java.sql.Connection;
import  java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VacanteDAO {

    private int Cantidad;
    private int Tipo_Vacante;
    private int Horario;

    private int Postulaciones;

    private  Connection connection;


    public VacanteDAO(Connection connection){this.connection = connection;}


    //Agregar nueva vacante

    public void agregarVacante(Vacantes vacantes) throws SQLException{
        String sql = "Insert into Vacantes(Cantidad, Tipo_Vacante, Horario, Postulaciones) values  (?,?,?,?)" ;
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,Cantidad);
            preparedStatement.setInt(2,Tipo_Vacante);
            preparedStatement.setInt(3,Horario);
            preparedStatement.setInt(4,Postulaciones);
            preparedStatement.executeUpdate();
        }
    }




    //Eliminar vacante


    public void eliminarVacante(int id_Vacante) throws SQLException {
        String sql = "Delete from Vacantes where id_Vacante = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,id_Vacante);
            statement.executeUpdate();
        }
    }


    //Editar Vacante

   public void editarVacante(int Cantidad, int Tipo_Vacante, int Horario , int Postulaciones) throws SQLException{
        String sql = "Update Vacantes set Cantidad = ?, Tipo_Vacante = ? , Horario = ? , Postulaciones = ? where Tipo_Vacante = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1,Cantidad);
        statement.setInt(2, Tipo_Vacante);
        statement.setInt(3,Horario);
        statement.setInt(4,Postulaciones);
        statement.executeUpdate();
   }

   // Obtener Vacantes por ID

    public void obtenerVacantes(int id_Vacante) throws SQLException {
        String sql = "Select from Vacantes where id_Vacante = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,id_Vacante);
            statement.executeUpdate();
        }
    }




}


