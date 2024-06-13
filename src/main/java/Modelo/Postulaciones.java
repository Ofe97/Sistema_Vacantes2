package Modelo;
import java.io.Serializable;
public class Postulaciones implements Serializable {

    private int id_Postulacion;
    private int Comentarios;


    public  Postulaciones(){

    }

    public  Postulaciones(int id_Postulacion, int Comentarios){
        this.id_Postulacion =id_Postulacion;
        this.Comentarios = Comentarios;
    }

    public int getId_Postulacion() {
        return id_Postulacion;
    }

    public void setId_Postulacion(int id_Postulacion) {
        this.id_Postulacion = id_Postulacion;
    }

    public int getComentarios() {
        return Comentarios;
    }

    public void setComentarios(int comentarios) {
        Comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Postulaciones{" +
                "id_Postulaciones=" + id_Postulacion +
                ",Comentarios=" + Comentarios +
                '}';

    }
}
