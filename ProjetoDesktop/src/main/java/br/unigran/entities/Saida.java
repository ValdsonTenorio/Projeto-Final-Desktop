package br.unigran.entities;

import javax.persistence.*;

@Entity
public class Saida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motivoSaida;
    private String dataSaida;

    @ManyToOne
    @JoinColumn(name = "estoque_id")
    private Estoque estoque;

    public Saida(String motivoSaida, String dataSaida) {
        this.motivoSaida = motivoSaida;
        this.dataSaida = dataSaida;
    }

    public Saida() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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