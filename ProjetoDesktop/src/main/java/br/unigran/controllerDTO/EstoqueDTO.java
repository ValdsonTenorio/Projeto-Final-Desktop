package br.unigran.controlerDTO;

import br.unigran.entities.Estoque;
import br.unigran.entities.Funcionario;

public class EstoqueDTO {
    public long estoqueAtual;
    public long estoqueAnterior;

    public Estoque builder() {
        Estoque estoque = new Estoque();
        estoque.setEstoqueAtual(estoqueAtual);
        estoque.setEstoqueAnterior(estoqueAnterior);
        return estoque;
    }
    public EstoqueDTO (Estoque estoque){
        this.estoqueAtual = estoque.getEstoqueAtual();
        this.estoqueAnterior = estoque.getEstoqueAnterior();
    }
}
