package Modelo;

public class Administrador {

  private int Admin_id;
  private String Nombre;
  private String Correo;
  private String Contrasena;

  private int Rol_id;


  public  Administrador(){

  }

  public Administrador(int Admin_id, String Nombre, String Correo, String Contrasena, int Rol_id){
      this.Admin_id= Admin_id;
      this.Nombre= Nombre;
      this.Correo= Correo;
      this.Contrasena= Contrasena;
      this.Rol_id= Rol_id;

  }

    public int getAdmin_id() {
        return Admin_id;
    }

    public void setAdmin_id(int admin_id) {
        Admin_id = admin_id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public int getRol_id() {
        return Rol_id;
    }

    public void setRol_id(int rol_id) {
        Rol_id = rol_id;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "Admin_id =" + Admin_id +
                ",Nombre Varchar=' " + Nombre + '\'' +
                ",Correo=' " + Correo + '\'' +
                ",Contraseña=' " + Contrasena+ '\'' +
                " Rol_id=" + Rol_id +
                '}';
    }
}
