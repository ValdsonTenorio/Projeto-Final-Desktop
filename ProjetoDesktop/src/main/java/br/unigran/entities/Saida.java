package br.unigran.entities;

import javax.persistence.ManyToOne;

public class Saida {
    private String motidoSaida;
    private String dataSaida;

    @ManyToOne
    private Saida saida;

    public Saida(String motidoSaida, String dataSaida) {
        this.motidoSaida = motidoSaida;
        this.dataSaida = dataSaida;
    }

    public String getMotidoSaida() {
        return motidoSaida;
    }

    public void setMotidoSaida(String motidoSaida) {
        this.motidoSaida = motidoSaida;
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
