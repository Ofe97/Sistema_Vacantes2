package Modelo;

import java.io.Serializable;
public class Horarios implements Serializable {
    private int  id_Horarios;
    private String Tipo_de_horarios;

  public Horarios(){

  }

  public Horarios (int id_Horarios, String Tipo_de_horarios){
      this.id_Horarios= id_Horarios;
      this.Tipo_de_horarios = Tipo_de_horarios;
  }

    public int getId_Horarios() {
        return id_Horarios;
    }

    public void setId_Horarios(int id_Horarios) {
        this.id_Horarios = id_Horarios;
    }

    public String getTipo_de_horarios() {
        return Tipo_de_horarios;
    }

    public void setTipo_de_horarios(String tipo_de_horarios) {
        Tipo_de_horarios = tipo_de_horarios;
    }

    @Override
    public String toString() {
        return "Horarios{"+
                "id_Horarios=" + id_Horarios+
                ",Tipo_de_Horarios=' " + Tipo_de_horarios + '\'' +
                '}';
    }

}
