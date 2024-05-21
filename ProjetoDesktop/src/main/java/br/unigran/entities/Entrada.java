package br.unigran.entities;

import javax.persistence.*;

@Entity
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String dataEntrada;
    @Column(length = 50)
    private String notaFiscalAssoc;
    @Column(length = 50)
    private String secao;

    @ManyToOne
    private Entrada entrada;

    public Entrada(String dataEntrada, String notaFiscalAssoc, String secao) {
        this.dataEntrada = dataEntrada;
        this.notaFiscalAssoc = notaFiscalAssoc;
        this.secao = secao;
    }

    public Entrada() {

    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getNotaFiscalAssoc() {
        return notaFiscalAssoc;
    }

    public void setNotaFiscalAssoc(String notaFiscalAssoc) {
        this.notaFiscalAssoc = notaFiscalAssoc;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public void Login(){

    }

    public void efetuarEntrada(){

    }

    public void alterar(){

    }
}