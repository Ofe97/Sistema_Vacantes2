package Modelo;
import java.io.Serializable;

public class Empresas implements Serializable{

    private int id_Empresa;
    private String Nombre_Empresa;
    private String Direccion;
    private String Pais;
    private String Estado;
    private String Telefono;
    private String Descripcion;
    private int Vacantes;
    private int Rol_id;

  public Empresas(){

  }

  public Empresas(int id_Empresa, String Nombre_Empresa, String Direccion, String Pais, String Estado, String Telefono, String Descripcion, int Vacantes, int Rol_id){
      this.id_Empresa=id_Empresa;
      this.Nombre_Empresa=Nombre_Empresa;
      this.Direccion=Direccion;
      this.Pais=Pais;
      this.Estado= Estado;
      this.Telefono=Telefono;
      this.Descripcion= Descripcion;
      this.Vacantes = Vacantes;
      this.Rol_id=Rol_id;
  }

    public int getId_Empresa() {
        return id_Empresa;
    }

    public void setId_Empresa(int id_Empresa) {
        this.id_Empresa = id_Empresa;
    }

    public String getNombre_Empresa() {
        return Nombre_Empresa;
    }

    public void setNombre_Empresa(String nombre_Empresa) {
        Nombre_Empresa = nombre_Empresa;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getVacantes() {
        return Vacantes;
    }

    public void setVacantes(int vacantes) {
        Vacantes = vacantes;
    }

    public int getRol_id() {
        return Rol_id;
    }

    public void setRol_id(int rol_id) {
        Rol_id = rol_id;
    }


    @Override
    public String toString() {
        return "Empresas{"+
                "id_Empresa=" + id_Empresa +
                ",Nombre_Empresa=' " + Nombre_Empresa + '\'' +
                ",Direccion=' " + Direccion + '\'' +
                ",Pais=' " + Pais + '\'' +
                ",Estado=' " + Estado + '\'' +
                ",Telefono=' " + Telefono + '\'' +
                ",Descripcion=' " +  Descripcion + '\'' +
                ",Vacantes= " + Vacantes +
                ",Rol_id= " + Rol_id +
                '}';


    }
}