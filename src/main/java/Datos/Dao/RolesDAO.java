package Datos.Dao;

import Datos.Conexion;
import Modelo.Roles;

import java.sql.*;



public class RolesDAO {
    private Connection connection;

    private PreparedStatement ps;

    private ResultSet rs;
    private Roles roles;

    public RolesDAO(Connection connection) {this.connection = connection;}


    //Para insertar un nuevo Rol
    public void insertarRol(Roles roles) throws SQLException {
        this.ps = this.connection.prepareStatement("Insert into Roles(Roles_id, Nombre )values (?,?) ");
        ps.setInt(1, roles.getRol_id());
        ps.setString(2, roles.getNombre());
        ps.executeUpdate();
    }


    //Obtener Roles por ID

    public Roles getRoles(int Roles_id) throws SQLException {
        this.ps = this.connection.prepareStatement("Select * from Roles where Rol_id = ?");
        this.ps.setInt(1, Roles_id);
        this.rs = this.ps.executeQuery();

        if (!this.rs.next()) {
            Conexion.close(rs);
            Conexion.close(ps);
            return null;
        }

        Roles rolEncontrado = new Roles(rs.getInt("Rol_id"), rs.getString("Nombre"));

        Conexion.close(rs);
        Conexion.close(ps);

        return rolEncontrado;
    }

    //Modificar el nombre del Rol

    public Roles ModificarNom(int Rol_id, String Nombre) throws SQLException {
        Roles rolEncontrado = getRoles(Rol_id);

        if (rolEncontrado == null) {
            return null;
        }
        this.ps = this.connection.prepareStatement("Update Roles set Nombre = ? where Rol_id = ?");
        this.ps.setString(1, Nombre);
        this.ps.setInt(2, Rol_id);
        this.ps.executeUpdate();

        Conexion.close(ps);

        return rolEncontrado;

    }

    //Para eliminar un Rol

    public Roles eliminarRol(int Rol_id) throws SQLException{
        Roles rolEncontrado = getRoles(Rol_id);

        if (rolEncontrado == null){
            return null;
        }


        this.ps =this.connection.prepareStatement("Delete from Roles where  Rol_id = ?");

        this.ps.setInt(1,Rol_id);
        this.ps.executeUpdate();


        Conexion.close(ps);

        return rolEncontrado;


    }




}
