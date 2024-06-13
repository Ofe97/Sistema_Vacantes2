package Modelo;

public class Administrador {

  private int Admin_id;
  private String Nombre;
  private String Email;
  private String Password;

  private int Rol_id;


  public  Administrador(){

  }

  public Administrador(int Admin_id, String Nombre, String Email, String Password, int Rol_id){
      this.Admin_id= Admin_id;
      this.Nombre= Nombre;
      this.Email= Email;
      this.Password= Password;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
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
                ",Email=' " + Email + '\'' +
                ",Password=' " + Password + '\'' +
                " Rol_id=" + Rol_id +
                '}';
    }
}
