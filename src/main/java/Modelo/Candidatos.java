package Modelo;
 import java.io.Serializable;
public class Candidatos implements Serializable {

    private int Candidato_id;
    private String Nombre;
    private String  Correo;
    private String Telefono;
    private String Direccion;
    private String Experiencia;
    private String Habilidades;
    private byte [] CV;
    private int Postulacion;

    private int Estudiante;

    private boolean Estado;


    public  Candidatos(){

    }

    public Candidatos(int Candidato_id, String Nombre, String Correo, String Telefono, String Direccion, String Experiencia, String Habilidades, byte[] CV, int Postulacion,int Estudiante ){
        this.Candidato_id = Candidato_id;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Experiencia= Experiencia;
        this.Habilidades = Habilidades;
        this.CV = CV;
        this.Postulacion = Postulacion;
        this.Estudiante = Estudiante;
    }

    public int getCandidato_id() {
        return Candidato_id;
    }

    public void setCandidato_id(int candidato_id) {
        Candidato_id = candidato_id;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }


    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String experiencia) {
        Experiencia = experiencia;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String habilidades) {
        Habilidades = habilidades;
    }

    public byte[] getCV() {
        return CV;
    }


    public void setCV(byte[] CV) {
        this.CV = CV;
    }

    public int getPostulacion() {
        return Postulacion;
    }

    public void setPostulacion(int postulacion) {
        Postulacion = postulacion;
    }

    public int getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(int estudiante) {
        Estudiante = estudiante;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Candidatos{" +
                "Candidato_id=" + Candidato_id +
                ",Nombre=' " + Nombre + '\'' +
                ",Correo=' " + Correo + '\'' +
                ",Telefono=' " + Telefono + '\'' +
                ",Direccion=' " + Direccion + '\'' +
                ",Experiencia=' " + Experiencia + '\'' +
                ",Habilidades=' " + Habilidades + '\'' +
                ",CV=" + CV +
                ",Postulacion= " + Postulacion +
                ",Estudiante = " + Estudiante +
                ",Estado = "  + Estado +
                '}';

    }
}
