package Modelo;
import java.io.Serializable;

public class Usuarios implements Serializable {
    private int id_Usuario;
    private  String  Correo;
    private String Contrasena;
    private int id_Rol;

    public Usuarios(){

    }

    public  Usuarios(String correo, String contrasena, int id_Rol){
        this.Correo = correo;
        this.Contrasena = contrasena;
        this.id_Rol = id_Rol;
    }

   public Usuarios(int id_Usuario,String Correo, String Contrasena, int id_Rol){
        this.id_Usuario= id_Usuario;
        this.id_Rol= id_Rol;
        this.Correo= Correo;
        this.Contrasena= Contrasena;
   }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public int getId_Rol() {
        return id_Rol;
    }

    public void setId_Rol(int id_Rol) {
        this.id_Rol = id_Rol;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                ",id_Usuario=" + id_Usuario +
                ",Correo=' " + Correo + '\'' +
                ",Contraseña+' " + Contrasena + '\'' +
                ",id_Rol=" + id_Rol+
                '}';

    }
}
