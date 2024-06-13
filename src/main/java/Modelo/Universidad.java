package Modelo;

import java.io.Serializable;
public class Universidad implements Serializable {

    private int id_Universidad;
    private String Nombre_Universidad;


    public Universidad(){

    }


    public Universidad(int id_Universidad, String Nombre_Universidad){
        this.id_Universidad= id_Universidad;
        this.Nombre_Universidad= Nombre_Universidad;

    }

    public int getId_Universidad() {
        return id_Universidad;
    }

    public void setId_Universidad(int id_Universidad) {
        this.id_Universidad = id_Universidad;
    }

    public String getNombre_Universidad() {
        return Nombre_Universidad;
    }

    public void setNombre_Universidad(String nombre_Universidad) {
        Nombre_Universidad = nombre_Universidad;
    }


    @Override
    public String toString() {
        return "Universidad{"+
                "id_Universidad=" +id_Universidad +
                ",Nombre_Universidad= ' " + Nombre_Universidad +'\'' +
                '}';
    }
}
