package Modelo;
import java.io.Serializable;
public class Vacantes implements Serializable {

    private int id_Vacante;
    private int Cantidad;
    private int Tipo_Vacante;
    private int Horario;
    private int Postulaciones;



    public  Vacantes(){

    }

    public Vacantes(int id_Vacante, int Cantidad, int Tipo_Vacante, int Horario, int Postulaciones){
        this.id_Vacante= id_Vacante;
        this.Cantidad=Cantidad;
        this.Tipo_Vacante=Tipo_Vacante;
        this.Horario=Horario;
        this.Postulaciones=Postulaciones;
    }

    public int getId_Vacante() {
        return id_Vacante;
    }

    public void setId_Vacante(int id_Vacante) {
        this.id_Vacante = id_Vacante;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public int getTipo_Vacante() {
        return Tipo_Vacante;
    }

    public void setTipo_Vacante(int tipo_Vacante) {
        Tipo_Vacante = tipo_Vacante;
    }

    public int getHorario() {
        return Horario;
    }

    public void setHorario(int horario) {
        Horario = horario;
    }

    public int getPostulaciones() {
        return Postulaciones;
    }

    public void setPostulaciones(int postulaciones) {
        Postulaciones = postulaciones;
    }

    @Override
    public String toString() {
        return "Vacantes{"+
                "id_Vacante=" + id_Vacante +
                ",Cantidad=" + Cantidad +
                ",Tipo_Vacante=" + Tipo_Vacante +
                ",Horario=" + Horario +
                ",Postulaciones=" + Postulaciones +
                '}';
    }
}
