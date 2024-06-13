package Modelo;
 import java.io.Serializable;
public class Candidatos implements Serializable {

    private int Candidato_id;
    private String Nombre;
    private String  Email;
    private String Telefono;
    private String Direccion;
    private String Experiencia;
    private String Habilidades;
    private byte [] CV;
    private int Postulacion;


    public  Candidatos(){

    }

    public Candidatos(int Candidato_id, String Nombre, String Email, String Telefono, String Direccion, String Experiencia, String Habilidades, byte[] CV, int Postulacion ){
        this.Candidato_id = Candidato_id;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Experiencia= Experiencia;
        this.Habilidades = Habilidades;
        this.CV = CV;
        this.Postulacion = Postulacion;
    }

    @Override
    public String toString() {
        return "Candidatos{" +
                "Candidato_id=" + Candidato_id +
                ",Nombre=' " + Nombre + '\'' +
                ",Email=' " + Email + '\'' +
                ",Telefono=' " + Telefono + '\'' +
                ",Direccion=' " + Direccion + '\'' +
                ",Experiencia=' " + Experiencia + '\'' +
                ",Habilidades=' " + Habilidades + '\'' +
                ",CV=" + CV +
                ",Postulacion= " + Postulacion +
                '}';

    }
}
