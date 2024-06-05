package br.unigran.entities;

import javax.persistence.*;

@Entity
public class Saida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String motivoSaida;
    private String dataSaida;


    public Saida(String motivoSaida, String dataSaida) {
        this.motivoSaida = motivoSaida;
        this.dataSaida = dataSaida;
    }

    public Saida() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMotivoSaida() {
        return motivoSaida;
    }

    public void setMotivoSaida(String motivoSaida) {
        this.motivoSaida = motivoSaida;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void Login(){

    }

    public void efetuarSaida(){

    }

    public void alterar(){

    }
}