package Datos.Dao;
import  Modelo.Estudiantes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EstudiantesDAO {

    private  int id_Estudiante;
    private String Nombre;
    private  String Apellido_Paterno;
    private  String Apellido_Materno;
    private int Tipo_de_titulo;
    private  int Carrera;
    private int Universidad;
    private String Telefono_fijo;
    private  String Telefono_celular;

    private Connection connection;


    public  EstudiantesDAO(Connection connection){this.connection = connection;}


    //Editar Nombre Estudiante

    public void editarNombre(int id_Estudiante, String Nombre) throws SQLException {
       String sql = "Update Estudiantes set Nombre = ? where id_Estudiante = ?";
       try(PreparedStatement statement =connection.prepareStatement(sql)){
           statement.setString(1,Nombre);
           statement.setInt(2,id_Estudiante);
           statement.executeUpdate();
       }

    }

    public  void  editarApellido_Paterno(int id_Estudiante, String Apellido_Paterno)throws SQLException{
        String sql = "Update Estudiantes set Apellido_Paterno = ? where id_Estudiante = ? ";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,Apellido_Paterno);
            statement.setInt(2,id_Estudiante);
            statement.executeUpdate();
        }

    }



    public void editarApellido_Materno(int id_Estudiante, String Apellido_Materno)throws  SQLException{
        String sql = "Update Estudiantes set Apellido_Materno = ?  where id_Estudiante = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,Apellido_Materno);
            statement.setInt(2,id_Estudiante);
            statement.executeUpdate();
        }
    }


    public void editarTipo_de_titulo(int id_Estudiante, int Tipo_de_titulo)throws SQLException{
        String sql = "Update Estudiantes set Tipo_de_titulo = ? where id_Estudiante = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,Tipo_de_titulo);
            statement.setInt(2,id_Estudiante);
            statement.executeUpdate();
        }
    }



   public void editarCarrera(int id_Estudiante, int Carrera)throws  SQLException{
        String sql = "Update Estudiantes set Carrera = ? where id_Estudiante = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
           statement.setInt(1,Carrera);
           statement.setInt(2,id_Estudiante);
           statement.executeUpdate();
        }
   }


   public  void  editarUniversidad(int id_Estudiante , int Universidad)throws  SQLException{
        String sql = "Update Estudiantes set Universidad = ? where id_Estudiante = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,Carrera);
            statement.setInt(2, id_Estudiante);
            statement.executeUpdate();
        }
   }


   public void editarTelefono_fijo(int id_Estudiante, String Telefono_fijo)throws  SQLException{
        String sql=  "Update Estudiantes set Telefono_fijo =? where id_Estudiante = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,Telefono_fijo);
            statement.setInt(2,id_Estudiante);
            statement.executeUpdate();
        }
   }


   public void editarTelefono_celular(int id_Estudiante, String Telefono_celular)throws  SQLException{
        String sql = "Update Estudiantes set Telefono_celular = ? where id_Estudiante = ? ";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, Telefono_celular);
            statement.setInt(2,id_Estudiante);
            statement.executeUpdate();
        }
   }

}
