package Modelo;
import java.io.Serializable;
public class Estudiantes implements Serializable {

    private  int id_Estudiante;
    private String Nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private int Tipo_de_titulo;
    private int Carrera;
    private int Universidad;
    private  String Telefono_fijo;
    private String Telefono_celular;
    private String Correo;
    private int Tipo_de_rol;


    public Estudiantes(){

    }

    public Estudiantes(int id_Estudiante, String Nombre, String Apellido_Paterno, String Apellido_Materno, int Tipo_de_titulo,int Carrera, int Universidad, String Telefono_fijo, String Telefono_celular,String Correo, int Tipo_de_rol){
        this.id_Estudiante= id_Estudiante;
        this.Nombre=Nombre;
        this.Apellido_Paterno=Apellido_Paterno;
        this.Apellido_Materno=Apellido_Materno;
        this.Tipo_de_titulo=Tipo_de_titulo;
        this.Carrera=Carrera;
        this.Universidad=Universidad;
        this.Telefono_fijo=Telefono_fijo;
        this.Telefono_celular=Telefono_celular;
        this.Correo=Correo;
        this.Tipo_de_rol=Tipo_de_rol;
    }

    public int getId_Estudiante() {
        return id_Estudiante;
    }

    public void setId_Estudiante(int id_Estudiante) {
        this.id_Estudiante = id_Estudiante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        Apellido_Paterno = apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        Apellido_Materno = apellido_Materno;
    }

    public int getTipo_de_titulo() {
        return Tipo_de_titulo;
    }

    public void setTipo_de_titulo(int tipo_de_titulo) {
        Tipo_de_titulo = tipo_de_titulo;
    }

    public int getCarrera() {
        return Carrera;
    }

    public void setCarrera(int carrera) {
        Carrera = carrera;
    }

    public int getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(int universidad) {
        Universidad = universidad;
    }

    public String getTelefono_fijo() {
        return Telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        Telefono_fijo = telefono_fijo;
    }

    public String getTelefono_celular() {
        return Telefono_celular;
    }

    public void setTelefono_celular(String telefono_celular) {
        Telefono_celular = telefono_celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getTipo_de_rol() {
        return Tipo_de_rol;
    }

    public void setTipo_de_rol(int tipo_de_rol) {
        Tipo_de_rol = tipo_de_rol;
    }

    @Override
    public String toString() {
        return "Estudiantes{"+
                "id_Estudiante=" + id_Estudiante +
                ",Nombre=' " + Nombre + '\'' +
                ",Apellido_Paterno=' " + Apellido_Paterno +'\'' +
                ",Apellido_Materno=' " + Apellido_Materno +'\'' +
                ",Tipo_de_titulo=" + Tipo_de_titulo +
                ",Carrera=" + Carrera +
                ",Universidad=" + Universidad +
                ",Telefono_fijo=' " + Telefono_fijo + '\'' +
                ",Telefono_celular=' " + Telefono_celular + '\'' +
                ",Correo=' " + Correo + '\'' +
                ",Tipo_de_rol=" + Tipo_de_rol +
                '}';
    }
}
