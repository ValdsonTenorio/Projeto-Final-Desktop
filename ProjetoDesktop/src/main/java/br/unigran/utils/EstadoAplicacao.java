package br.unigran.utils;

import br.unigran.entities.Funcionario;

public class EstadoAplicacao {
    public static EstadoAplicacao instancia = new EstadoAplicacao();
    Funcionario logado;
    private EstadoAplicacao() {
    }
    public Funcionario getLogado() {
        return logado;
    }
    public EstadoAplicacao setLogado(Funcionario logado) {
        this.logado = logado;
        return this;
    }
}
