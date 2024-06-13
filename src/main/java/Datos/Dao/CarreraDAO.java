package Datos.Dao;

import Datos.Conexion;

import Modelo.Carrera;

import java.sql.*;

public class CarreraDAO {

    private Connection connection;

    private PreparedStatement ps;

    private ResultSet rs;
    private Carrera carera;


    public CarreraDAO(Connection connection){this.connection = connection;}

    //Insertar nueva Carrera

    public void insertarCarrera(Carrera carrera) throws SQLException{

        this.ps = this.connection.prepareStatement("Insert into  Carrera (id_Carrera,Nombre_Carrera)");
        ps.setInt(1,carrera.getId_Carrera());
        ps.setString(2,carrera.getNombre_Carrera());
        ps.executeUpdate();
    }

    // Para obtener carrera mediante ID

    public Carrera getCarrera(int id_Carrera) throws SQLException {
        this.ps = this.connection.prepareStatement("Select * from Carrera  where id_Carrera = ?");
        this.ps.setInt(1, id_Carrera);
        this.rs = this.ps.executeQuery();

        if (!this.rs.next()) {
            Conexion.close(rs);
            Conexion.close(ps);
            return null;
        }

        Carrera carreraEncontrada = new Carrera(rs.getInt("id_Carrera"), rs.getString("Nombre_Carrera"));

        Conexion.close(rs);
        Conexion.close(ps);

        return carreraEncontrada;
    }

 //Modificar Nombre Carrera

    public Carrera modifCarrera(int id_Carrera,String Nombre_Carrera ) throws SQLException {
         Carrera carreraEncontrada = getCarrera(id_Carrera);


         if(carreraEncontrada == null ){
             return null;
         }
         this.ps =this.connection.prepareStatement("Update Carrera set Nombre_Carrera = ? where id_Carrera = ?");
         this.ps.setString(1,Nombre_Carrera);
         this.ps.setInt(2,id_Carrera);
         this.ps.executeUpdate();

         return carreraEncontrada;
    }

    //Eliminar Carrera
   public Carrera elimCarrera(int id_Carrera) throws  SQLException{
        Carrera carreraEncontrada = getCarrera(id_Carrera);

        if (carreraEncontrada == null){
            return null;
       }

        this.ps = this.connection.prepareStatement("Delete from Carrera where id_Carrera = ?");

        this.ps.setInt(1,id_Carrera);
        this.ps.executeUpdate();

        Conexion.close(ps);
        return carreraEncontrada;
   }

}
