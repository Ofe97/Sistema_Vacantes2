package Datos.Dao;

import Modelo.Vacantes;
import java.sql.Connection;
import  java.sql.PreparedStatement;
import java.sql.SQLException;

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

}

//Eliminar vacante
