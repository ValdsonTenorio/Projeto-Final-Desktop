package br.unigran.entities;

public class Entrada {
    private String dataEntrada;
    private String notaFiscalAssoc;
    private String secao;

    public Entrada(String dataEntrada, String notaFiscalAssoc, String secao) {
        this.dataEntrada = dataEntrada;
        this.notaFiscalAssoc = notaFiscalAssoc;
        this.secao = secao;
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
