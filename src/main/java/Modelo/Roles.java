package Modelo;

import java.io.Serializable;
public class Roles implements  Serializable  {

    private int Rol_id;
    private String Nombre;


    public Roles(){

    }


    public Roles(int Rol_id, String Nombre){
        this.Rol_id = Rol_id;
        this.Nombre = Nombre;
    }

    public int getRol_id() {
        return Rol_id;
    }

    public void setRol_id(int rol_id) {
        Rol_id = rol_id;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
      return "Roles{" +
              "Rol_id =" + Rol_id +
              ",Nombre= '" + Nombre + '\'' +
              '}';
    }
}
