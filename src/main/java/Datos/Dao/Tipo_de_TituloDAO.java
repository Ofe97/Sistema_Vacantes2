package Datos.Dao;
import Datos.Conexion;
import Modelo.Tipo_de_Titulo;

import java.sql.*;

public class Tipo_de_TituloDAO {
    private Connection connection;

    private PreparedStatement ps;

    private ResultSet rs;
    private Tipo_de_Titulo tipo_de_titulo;

    public Tipo_de_TituloDAO(Connection connection) {
        this.connection = connection;
    }

    //Para insertar un nuevo registro en tipo de titulo
    public void insertTipoT(Tipo_de_Titulo tipo_de_titulo) throws SQLException {
        this.ps = this.connection.prepareStatement( "Insert into Tipo_de_Titulo(id_Tipo_de_Titulo, Tipo_de_titulo )values (?,?) ");
        ps.setInt(1,tipo_de_titulo.getId_Tipo_de_Titulo());
        ps.setString(2,tipo_de_titulo.getTipo_de_titulo());
        ps.executeUpdate();
    }

    //Para mostrar los tipos de titulos mediante su id

    public Tipo_de_Titulo getTipo_de_titulo(int id_Tipo_de_Titulo) throws SQLException{
        this.ps = this.connection.prepareStatement("Select * from Tipo_de_Titulo where id_Tipo_de_Titulo = ?");
        this.ps.setInt(1,id_Tipo_de_Titulo);
        this.rs = this.ps.executeQuery();

        if(!this.rs.next()){
            Conexion.close(rs);
            Conexion.close(ps);
            return null;
        }
        Tipo_de_Titulo  tipoTituloEncontrado = new Tipo_de_Titulo(rs.getInt("id_Tipo_de_Titulo"),rs.getString("Tipo_de_Titulo"));

        Conexion.close(rs);
        Conexion.close(ps);

        return tipoTituloEncontrado;
    }






}