package Modelo;

import java.io.Serializable;

public class Tipo_Vacante implements  Serializable{
    private int id_Tipo_Vacante;
    private  String Tipo_Vacante;
    private  String Descripcion;


    public Tipo_Vacante(){

    }
    public  Tipo_Vacante(int id_Tipo_Vacante, String Tipo_Vacante, String Descripcion){
        this.id_Tipo_Vacante= id_Tipo_Vacante;
        this.Tipo_Vacante= Tipo_Vacante;
        this.Descripcion= Descripcion;
    }

    public int getId_Tipo_Vacante() {
        return id_Tipo_Vacante;
    }

    public void setId_Tipo_Vacante(int id_Tipo_Vacante) {
        this.id_Tipo_Vacante = id_Tipo_Vacante;
    }

    public String getTipo_Vacante() {
        return Tipo_Vacante;
    }

    public void setTipo_Vacante(String tipo_Vacante) {
        Tipo_Vacante = tipo_Vacante;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tipo_Vacante{" +
                "id_Tipo_Vacante=" + id_Tipo_Vacante +
                ",Tipo_Vacante=" + Tipo_Vacante + '\''+
                ",Descripcion=" + Descripcion + '\''+
                '}';
    }
}
