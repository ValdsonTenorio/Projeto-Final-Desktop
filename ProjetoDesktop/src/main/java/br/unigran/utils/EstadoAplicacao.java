package br.unigran.utils;

import br.unigran.controllerDTO.FuncionarioDTO;
import br.unigran.entities.Funcionario;

public class EstadoAplicacao {
    public static EstadoAplicacao instancia = new EstadoAplicacao();
    FuncionarioDTO logado;
    private EstadoAplicacao() {
    }
    public FuncionarioDTO getLogado() {
        return logado;
    }
    public EstadoAplicacao setLogado(FuncionarioDTO logado) {
        this.logado = logado;
        return this;
    }
}
