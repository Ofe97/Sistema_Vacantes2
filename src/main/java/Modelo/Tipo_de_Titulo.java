package Modelo;

import java.io.Serializable;
public class Tipo_de_Titulo implements Serializable {

  private int id_Tipo_de_Titulo;
  private String Tipo_de_titulo;



  public Tipo_de_Titulo(){

  }

   public Tipo_de_Titulo(int id_Tipo_de_Titulo, String Tipo_de_Titulo ){
      this.id_Tipo_de_Titulo= id_Tipo_de_Titulo;
      this.Tipo_de_titulo = Tipo_de_Titulo;

   }


    public int getId_Tipo_de_Titulo() {
        return id_Tipo_de_Titulo;
    }

    public void setId_Tipo_de_Titulo(int id_Tipo_de_Titulo) {
        this.id_Tipo_de_Titulo = id_Tipo_de_Titulo;
    }

    public String getTipo_de_titulo() {
        return Tipo_de_titulo;
    }

    public void setTipo_de_titulo(String tipo_de_titulo) {
        Tipo_de_titulo = tipo_de_titulo;
    }

    @Override
    public String toString() {
        return "Tipo_de_Titulo{" +
                "id_Tipo_de_Titulo=" + id_Tipo_de_Titulo +
                ",Tipo_de_titulo=' " + Tipo_de_titulo + '\'' +
                '}';
    }
}
