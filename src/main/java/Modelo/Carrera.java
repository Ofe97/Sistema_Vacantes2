package Modelo;
import java.io.Serializable;
public class Carrera implements Serializable {
    private int id_Carrera;
    private String Nombre_Carrera;

    public Carrera(){

    }

    public Carrera(int id_Carrera, String Nombre_Carrera){
        this.id_Carrera= id_Carrera;
        this.Nombre_Carrera= Nombre_Carrera;
    }

    public int getId_Carrera() {
        return id_Carrera;
    }

    public void setId_Carrera(int id_Carrera) {
        this.id_Carrera = id_Carrera;
    }

    public String getNombre_Carrera() {
        return Nombre_Carrera;
    }

    public void setNombre_Carrera(String nombre_Carrera) {
        Nombre_Carrera = nombre_Carrera;
    }

    @Override
    public String toString() {
        return "Carrera{"+
                "id_Carrera=" + id_Carrera +
                ", Nombre_Carrera' " + Nombre_Carrera + '\'' +
                '}';
    }
}
