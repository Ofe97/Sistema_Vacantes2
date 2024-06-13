package Modelo;
import java.io.Serializable;
public class Comentarios_Postulacion implements Serializable {

  private int id_Comentario;
  private String Comentario;


  public  Comentarios_Postulacion(){

  }

  public Comentarios_Postulacion(int id_Comentario, String Comentario){
      this.id_Comentario= id_Comentario;
      this.Comentario= Comentario;
  }

    public int getId_Comentario() {
        return id_Comentario;
    }

    public void setId_Comentario(int id_Comentario) {
        this.id_Comentario = id_Comentario;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentarios_Postulacion{" +
                "id_Comentario=" + id_Comentario +
                ",Comentario=' " +Comentario + '\'' +
                '}';
     }
}
