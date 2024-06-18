package Modelo;
import java.io.Serializable;

public class Usuarios implements Serializable {
    private int id_Usuario;
    private  String  Correo;
    private String Contraseña;
    private int id_Rol;

    public  Usuarios(String correo, String contraseña, int id_Rol){

    }


   public Usuarios(int id_Usuario,String Correo, String Contraseña, int id_Rol){
        this.id_Usuario= id_Usuario;
        this.id_Rol= id_Rol;
        this.Correo= Correo;
        this.Contraseña= Contraseña;
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

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
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
                ",Contrseña+' " + Contraseña + '\'' +
                ",id_Rol=" + id_Rol+
                '}';

    }
}
